package com.example.tarjeta_de_presentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tarjeta_de_presentacion.ui.theme.Tarjeta_de_presentacionTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarjeta_de_presentacionTheme {
                Scaffold(
                    content = { innerPadding ->


                    }
                )
            }
        }
    }
}

@Composable
fun Greeting(
    name: String,
    puesto: String,
    telefono: String,
    github: String,
    correo: String,
    modifier: Modifier = Modifier
) {


    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        var imagen = painterResource(R.drawable.android_logo)
            Image(
                painter = imagen,
                contentDescription = null,
                modifier = Modifier.align(Alignment.CenterHorizontally)
                    .size(150.dp)
                    .align(Alignment.CenterHorizontally)
                    .background(Color(0xFF305964))
        )
            Text(
                text = name
            )
            Text(
                text = puesto
            )


            Text(
                text = telefono
            )
            Text(
                text = github
            )
            Text(
                text = correo
            )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Tarjeta_de_presentacionTheme {
        Greeting("Gastón Ayala",
            "Android Developer",
            "15644XXXXX",
            "github.com/gaston5050",
                    "gaston14101985@gmail.com")
    }
}