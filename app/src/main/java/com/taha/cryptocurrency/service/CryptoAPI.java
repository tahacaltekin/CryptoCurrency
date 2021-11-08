package com.taha.cryptocurrency.service;

import com.taha.cryptocurrency.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("prices?key=82749821e599f7cfeb7f3321ce92e2119349fdf1")
    Observable<List<CryptoModel>> getData();


    //Call<List<CryptoModel>> getData();
}
