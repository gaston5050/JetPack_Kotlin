package com.example.greetingcard

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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme
import com.example.greetingcard.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White // Usamos el tema en lugar de un color fijo
                ) {
                    GreetingCard(
                        mensaje = stringResource(R.string.feliz_cumpleanos_text),
                        from = "Gastón",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingCard(mensaje: String, from: String, modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        // Imagen de fondo
        Image(
            painter = painterResource(R.drawable.androidparty),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.5f),
            contentScale = ContentScale.Crop // Ajusta la imagen al tamaño del contenedor
        )
        // Texto encima de la imagen
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = mensaje,
                fontSize = 36.sp,
                lineHeight = 40.sp,
                textAlign = TextAlign.Center,
                color = Color.White, // Color blanco para que sea visible sobre la imagen
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black.copy(alpha = 0.5f)) // Fondo semi-transparente para legibilidad
                    .padding(8.dp)
            )
            Text(
                text = "De: $from",
                fontSize = 40.sp,
                color = Color.Black,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .align(Alignment.End)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Greeting Card Preview"
)
@Composable
fun GreetingCardPreview() {
    GreetingCardTheme {
        GreetingCard(
            mensaje = "¡Feliz Cumpleaños!",
            from = "Gastón",
            modifier = Modifier.fillMaxSize()
        )
    }
}