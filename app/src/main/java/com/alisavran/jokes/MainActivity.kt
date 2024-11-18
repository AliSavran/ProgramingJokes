package com.alisavran.jokes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.alisavran.jokes.screens.JokeList
import com.alisavran.jokes.ui.theme.JokesTheme
import com.alisavran.jokes.viewmodel.JokeViewModel

class MainActivity : ComponentActivity() {

    private val viewModel:JokeViewModel by viewModels<JokeViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JokesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)){
                        viewModel.getJokes()
                        JokeList(jokeList = viewModel.jokeList.value)
                    }
                }
            }
        }
    }
}

