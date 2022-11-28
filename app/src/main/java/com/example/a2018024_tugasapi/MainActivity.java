package com.example.a2018024_tugasapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView PublikListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PublikListView = findViewById(R.id.PublikListView);

        getpublik();
    }

    private void getpublik() {
        Call<Foodpojo> call = RetrofitClient.getInstance().getMyApi().getpublik();
        call.enqueue(new Callback<Foodpojo>() {
            @Override
            public void onResponse(Call<Foodpojo> call, Response<Foodpojo> response) {
                Foodpojo PublikData = response.body();
                List<ResultsItem> data = PublikData.getResults();
                String[] digimon = new String[data.size()];

                for (int i = 0; i < data.size(); i++) {
                    digimon[i] = data.get(i).getCountry();
                }

                PublikListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, digimon));
            }

            @Override
            public void onFailure(Call<Foodpojo> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }
}
