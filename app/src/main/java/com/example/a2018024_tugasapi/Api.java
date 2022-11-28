package com.example.a2018024_tugasapi;


import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://api.fda.gov/";
    @GET("food/enforcement.json?limit=10")
    Call<ResultsItem> getpublik();
}
