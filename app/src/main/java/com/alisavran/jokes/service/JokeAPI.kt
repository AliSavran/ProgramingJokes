package com.alisavran.jokes.service

import com.alisavran.jokes.model.Joke
import retrofit2.http.GET

interface JokeAPI {

    //https://github.com/atilsamancioglu/ProgrammingJokesJSON/blob/main/jokes.json
    @GET("atilsamancioglu/ProgrammingJokesJSON/refs/heads/main/jokes.json")
    suspend fun getData() : List<Joke>
}