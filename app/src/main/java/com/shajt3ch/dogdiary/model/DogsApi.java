package com.shajt3ch.dogdiary.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * Created by SHAJ on 01 Dec, 2019.
 * shakilahmedshaj@gmail.com
 */
public interface DogsApi {

    @GET("DevTides/DogsApi/master/dogs.json")
    Single<List<DogBreed>> getDogs();


}
