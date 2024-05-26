/*
 * Copyright (c) 2024 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.kodeco.kodecochat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
              Box() {
                Icon(
                  painter = painterResource(id = R.drawable.kodeco_logo_back),
                  contentDescription = null,
                  tint = Color(0xFFFF5A00)
                )
                Icon(
                  painter = painterResource(id = R.drawable.kodeco_logo),
                  contentDescription = null,
                  tint = Color.White
                )
              }
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
  val greetingText = stringResource(id = R.string.greeting)
  Text(
    text = "$greetingText, $name!"
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  KodecoChatTheme {
    Greeting("Android")
  }
}