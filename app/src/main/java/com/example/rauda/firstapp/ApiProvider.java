package com.example.rauda.firstapp;

/**
 * Created by rauda on 03-23-18.
 */

/**API: http://cherryinspect.databot.io/api/v1/inspections
 * Parametros: store_id: 157draft: 0(latestinspections).
 * Y valor de 1 (draft)
 * Header: Authorization: CZLjbUCekUD8QaxctLJ**/
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiProvider {


    public ModelInterface registerWorkshopClient() {
        return new Retrofit.Builder()

                .baseUrl(NetworkGeneralHelper.BASE_FINAL_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ModelInterface.class);
    }
}
