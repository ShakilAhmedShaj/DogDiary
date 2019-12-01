package com.shajt3ch.dogdiary.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.shajt3ch.dogdiary.model.DogBreed;


/**
 * Created by SHAJ on 01 Dec, 2019.
 * shakilahmedshaj@gmail.com
 */
public class DetailViewModel extends ViewModel {

    public MutableLiveData<DogBreed> dogLiveData = new MutableLiveData<DogBreed>();

    public void fetch() {
        DogBreed dog1 = new DogBreed("1", "Myanmar", "10 Year", "Breed", "Me", "Ship", "");

        dogLiveData.setValue(dog1);

    }


}
