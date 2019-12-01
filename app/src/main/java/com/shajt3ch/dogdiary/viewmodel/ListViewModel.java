package com.shajt3ch.dogdiary.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.shajt3ch.dogdiary.model.DogBreed;
import com.shajt3ch.dogdiary.model.DogsApiService;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by SHAJ on 01 Dec, 2019.
 * shakilahmedshaj@gmail.com
 */

public class ListViewModel extends AndroidViewModel {

    public MutableLiveData<List<DogBreed>> dogs = new MutableLiveData<List<DogBreed>>();
    public MutableLiveData<Boolean> dogLoadError = new MutableLiveData<Boolean>();
    public MutableLiveData<Boolean> loading = new MutableLiveData<Boolean>();

    private DogsApiService dogsService = new DogsApiService();

    private CompositeDisposable disposable = new CompositeDisposable();


    public ListViewModel(@NonNull Application application) {
        super(application);
    }

    public void refresh() {
        fetchFromRemote();

    }

    private void fetchFromRemote() {
        loading.setValue(true);

        disposable.add(

                dogsService.getDogs()
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(new DisposableSingleObserver<List<DogBreed>>() {
                            @Override
                            public void onSuccess(List<DogBreed> dogBreeds) {

                                dogs.setValue(dogBreeds);
                                dogLoadError.setValue(false);
                                loading.setValue(false);

                            }

                            @Override
                            public void onError(Throwable e) {

                                dogLoadError.setValue(true);
                                loading.setValue(false);
                                e.printStackTrace();
                            }
                        })
        );
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        disposable.clear();
    }
}