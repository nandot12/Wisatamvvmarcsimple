package com.udacoding.wisatamvvmarcsimple.network

import com.udacoding.wisatamvvmarcsimple.model.Wisata
import retrofit2.Call
import retrofit2.http.GET

public interface ApiService {


    @GET("?action=findAll")
    fun wisata():Call<Wisata>
}