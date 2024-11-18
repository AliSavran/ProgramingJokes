package com.alisavran.jokes.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.alisavran.jokes.model.Joke

@Composable
fun JokeList(jokeList : List<Joke>){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Magenta)
    ) {
        items(jokeList){
            JokeRow(joke = it)
        }
    }
}
@Composable
fun JokeRow(joke: Joke){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(BorderStroke(3.dp, color = Color.Black))
            .background(color = Color.Magenta)
            .padding(5.dp)
    ) {
        if (joke.type == "single"){
            Text(text = joke.joke ?: "",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(2.dp)
            )
        }else{
            Column {
                Text(text = "Setup :" + joke.setup,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(2.dp)
                )
                Text(text = "Delivery :" + joke.delivery,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(2.dp)
                )
            }
        }


        Text(text = joke.joke ?: "",
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Medium
        )
    }
}