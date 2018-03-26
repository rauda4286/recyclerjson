package com.example.rauda.firstapp;

import android.os.Bundle;
import android.util.Log;


import android.app.Activity;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {


    TextView make,model,mark,vin,plate,milles;

    ModelInterface client;
    ApiProvider provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                make = (TextView) findViewById(R.id.make);
                 vin = (TextView)findViewById(R.id.vin);
                model = (TextView)findViewById(R.id.model);
                mark = (TextView)findViewById(R.id.mark);
                plate = (TextView)findViewById(R.id.plate);
                milles = (TextView)findViewById(R.id.milles);


        provider = new ApiProvider();
        client = provider.registerWorkshopClient();



        Call<User> userCallApi = client.getUser();


        userCallApi.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {


                if (response.isSuccessful()) {
                    model.setText("Test H"+response.body().getVehicle());
                }
                else {
                    Log.d("Error","Hubo un error");
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.d("Error","Hubo un error de conexion" );
            }


        });






    }
}

