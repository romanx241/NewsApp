package ru.netology.newsapp.data.api

import retrofit2.http.GET
import retrofit2.http.Query
import ru.netology.newsapp.utils.Constants.Companion.API_KEY

interface NewsService {

    @GET("/v2/everything")
    suspend fun getEverything (
        @Query ("q") query: String,
        @Query ("page") page: Int = 1,
        @Query ("apiKey") apiKey: String = API_KEY

    )

    @GET("/v2/top-headlines")
    suspend fun getHeadlines (
        @Query ("country") countryCode: String = "ru",
        @Query ("page") page: Int = 1,
        @Query ("apiKey") apiKey: String = API_KEY

    )
}