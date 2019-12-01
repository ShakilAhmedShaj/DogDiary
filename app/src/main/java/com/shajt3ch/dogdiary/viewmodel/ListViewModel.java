package com.shajt3ch.dogdiary.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.shajt3ch.dogdiary.model.DogBreed;

import java.util.ArrayList;
import java.util.List;

public class ListViewModel extends AndroidViewModel {

    public MutableLiveData<List<DogBreed>> dogs = new MutableLiveData<List<DogBreed>>();
    public MutableLiveData<Boolean> dogLoadError = new MutableLiveData<Boolean>();
    public MutableLiveData<Boolean> loading = new MutableLiveData<Boolean>();


    public ListViewModel(@NonNull Application application) {
        super(application);
    }

    public void refresh() {
        DogBreed dog1 = new DogBreed("1", "Myanmar", "10 Year", "", "", "", "");
        DogBreed dog2 = new DogBreed("2", "Indian", "15 Year", "", "", "", "");
        DogBreed dog3 = new DogBreed("3", "Israel", "20 Year", "", "", "", "");

        ArrayList<DogBreed> dogsList = new ArrayList<>();
        dogsList.add(dog1);
        dogsList.add(dog2);
        dogsList.add(dog3);

        dogs.setValue(dogsList);
        dogLoadError.setValue(false);
        loading.setValue(false);


    }
}
