package com.shajt3ch.dogdiary.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SHAJ on 01 Dec, 2019.
 * shakilahmedshaj@gmail.com
 */
public class DogsApiService {

    private static final String BASE_URL = "https://raw.githubusercontent.com/";
    private DogsApi api;

    public DogsApiService() {

        api = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(DogsApi.class);
    }

    public Single<List<DogBreed>> getDogs() {

        return api.getDogs();
    }
}
