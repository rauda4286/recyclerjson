package com.example.rauda.firstapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.HEAD;

/**
 * Created by rauda on 03-22-18.
 */

public interface ModelInterface {

    @POST("/pi/v1/inspections")
    Call<User> getUser();


}
