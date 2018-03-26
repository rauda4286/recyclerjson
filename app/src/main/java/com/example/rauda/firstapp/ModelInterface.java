package com.example.rauda.firstapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by rauda on 03-22-18.
 */

public interface ModelInterface {

    @GET("api/v1/inspections")
    Call<User> getUser();


}
