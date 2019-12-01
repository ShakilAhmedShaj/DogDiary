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
        DogBreed dog4 = new DogBreed("4", "Israel", "20 Year", "", "", "", "");
        DogBreed dog5 = new DogBreed("5", "Israel", "20 Year", "", "", "", "");
        DogBreed dog6 = new DogBreed("6", "Israel", "20 Year", "", "", "", "");
        DogBreed dog7 = new DogBreed("7", "Israel", "20 Year", "", "", "", "");
        DogBreed dog8 = new DogBreed("8", "Myanmar", "10 Year", "", "", "", "");
        DogBreed dog9 = new DogBreed("9", "Indian", "15 Year", "", "", "", "");
        DogBreed dog10 = new DogBreed("10", "Israel", "20 Year", "", "", "", "");
        DogBreed dog11 = new DogBreed("11", "Israel", "20 Year", "", "", "", "");
        DogBreed dog12 = new DogBreed("12", "Israel", "20 Year", "", "", "", "");
        DogBreed dog13 = new DogBreed("13", "Israel", "20 Year", "", "", "", "");
        DogBreed dog14 = new DogBreed("14", "Israel", "20 Year", "", "", "", "");

        ArrayList<DogBreed> dogsList = new ArrayList<>();
        dogsList.add(dog1);
        dogsList.add(dog2);
        dogsList.add(dog3);
        dogsList.add(dog4);
        dogsList.add(dog5);
        dogsList.add(dog6);
        dogsList.add(dog7);
        dogsList.add(dog8);
        dogsList.add(dog9);
        dogsList.add(dog10);
        dogsList.add(dog11);
        dogsList.add(dog12);
        dogsList.add(dog13);
        dogsList.add(dog14);

        dogs.setValue(dogsList);
        dogLoadError.setValue(false);
        loading.setValue(false);


    }
}
