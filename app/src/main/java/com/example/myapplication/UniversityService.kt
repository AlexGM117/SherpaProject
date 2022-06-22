package com.example.myapplication

import retrofit2.Response
import retrofit2.http.GET

interface UniversityService {
    @GET("search?country=United+States")
    suspend fun getQuery() : Response<List<UniversityData>>
}