package com.kodeco.kodecochat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Label
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.kodecochat.ui.theme.KodecoChatTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      KodecoChatTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
          Box(modifier = Modifier.fillMaxSize()) {
            Column(
              Modifier
                .fillMaxSize()
                .padding(50.dp)
            )
            {
              OutlinedTextField(
                value = "",
                onValueChange = {  },
                label = { Text(text = stringResource(id = R.string.chat_entry_label)) }
              )
              Greeting(
                name = "Android"
              )
            }
          }

        }
      }
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(
    text = "Hi, $name!"
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  KodecoChatTheme {
    Greeting("Android")
  }
}