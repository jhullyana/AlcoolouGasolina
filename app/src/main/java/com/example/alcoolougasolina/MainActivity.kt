package com.example.alcoolougasolina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alcoolougasolina.ui.theme.AlcoolOuGasolinaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlcoolOuGasolinaTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    App()

                }
            }
        }
    }
}
@Preview(
    device = Devices.PIXEL
)
@Composable
fun App(){

    var valorGasolina = remember {
        mutableStateOf("")
    }

    var valorAlcool = remember {
        mutableStateOf("")
    }



    Column (
        Modifier
            .background(color = Color(0xFF00000))
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Text(
                text = "Álcool ou Gasolina?",
                style = TextStyle
                    (
                    color = Color.White,
                    fontSize = 40.sp
                )
            )


            Text(text = "Gasolina",
                color = Color.Red,
                fontSize = 30.sp)


            TextField(
                value = valorGasolina.value,
                onValueChange = {novoValor ->
                    valorGasolina.value = novoValor
                },
                label = {
                    Text(text = "Gasolina")
                }
            )
            TextField(value = valorGasolina.value,
                onValueChange = {
                    valorAlcool= it
                },
                label = {
                    Text(text = "Alcool")
                }
            )
        }
    }


}