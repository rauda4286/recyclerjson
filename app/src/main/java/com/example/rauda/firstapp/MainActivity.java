package com.example.rauda.firstapp;

import android.os.Bundle;
import android.util.Log;


import android.app.Activity;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {


    TextView message;
    ModelInterface client;
    ApiProvider provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = (TextView) findViewById(R.id.message);

        provider = new ApiProvider();
        client = provider.registerWorkshopClient();

        Call<User> userCallApi = client.getUser();


        userCallApi.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {


                if (response.isSuccessful()) {
                    message.setText("Test H"+response.body().getVehicle());

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

