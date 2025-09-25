package com.example.tarjeta_de_presentacion

import android.R.attr.fontWeight
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                        Greeting("Gastón Ayala",
                            "Android Developer",
                            "15644XXXXX",
                            "github.com/gaston5050",
                            "gaston14101985@gmail.com")



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
        var imagenGit = painterResource(R.drawable.github_logo)

        //   var telefono = painterResource(R.drawable.)
            Image(
                painter = imagen,
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(150.dp)
                    .background(Color(0xFF305964))
        )
            Text(
                text = name,
                fontSize = 50.sp,
            )
            Text(
                text = puesto,
                fontSize = 20.sp,
                 color = Color.Blue,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 200.dp)
            )

            Row{
                Icon(
                    Icons.Filled.Phone,
                    contentDescription = null,
                    modifier = Modifier
                        .size(26.dp)
                        .align(Alignment.CenterVertically)
                        .padding(end = 5.dp)
                )
            Text(
                text = telefono,
                fontSize = 20.sp
            )
            }
            Row{
                Image(
                    painter = imagenGit,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .align(Alignment.CenterVertically)
                        .padding(end = 5.dp)

                )

            Text(
                text = github,
                fontSize = 20.sp
            )
            }
            Row { Icon(
                Icons.Filled.Email,
                contentDescription = null,
                modifier = Modifier
                    .size(26.dp)
                    .align(Alignment.CenterVertically)
                    .padding(end = 5.dp)
            )
                Text(
                    text = correo,
                    fontSize = 20.sp
                )

            }


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