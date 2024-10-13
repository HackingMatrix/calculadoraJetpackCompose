package com.example.calculadorakotlinjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadorakotlinjetpack.ui.theme.CalculadoraKotlinJetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraKotlinJetPackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun CalculatorScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            CalculatorButton(text = "1")
            CalculatorButton(text = "2")
            CalculatorButton(text = "3")
            CalculatorButton(text = "+")
        }
        Row {
            CalculatorButton(text = "4")
            CalculatorButton(text = "5")
            CalculatorButton(text = "6")
            CalculatorButton(text = "-")
        }
        Row {
            CalculatorButton(text = "7")
            CalculatorButton(text = "8")
            CalculatorButton(text = "9")
            CalculatorButton(text = "*")
        }
        Row {
            CalculatorButton(text = "0")
            CalculatorButton(text = "C")
            CalculatorButton(text = "=")
            CalculatorButton(text = "/")
        }
    }
}

@Composable
fun CalculatorButton(text: String) {
    Button(
        onClick = { /* Action */ },
        modifier = Modifier
            .size(80.dp)
            .padding(8.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE)), // Purple color
        shape = CircleShape // Circular shape
    ) {
        Text(text = text, color = Color.White, fontSize = 24.sp)
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewCalculatorScreen() {
    CalculatorScreen()
}