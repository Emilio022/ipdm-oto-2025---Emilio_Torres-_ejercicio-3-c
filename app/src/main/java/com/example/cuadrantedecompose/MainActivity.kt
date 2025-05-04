package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadranteDeComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuadranteApp()
                }
            }
        }
    }
}

@Composable
fun CuadranteApp() {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            CuadranteTarjeta(
                titulo = "Text composable",
                descripcion = "Displays text and follows the recommended Material Design guidelines.",
                colorDeFondo = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f),
                colorTexto = Color.Black // Añadido color del texto
            )
            CuadranteTarjeta(
                titulo = "Image composable",
                descripcion = "Creates a composable that lays out and draws a given Painter class object.",
                colorDeFondo = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f),
                colorTexto = Color.Black // Añadido color del texto
            )
        }
        Row(Modifier.weight(1f)) {
            CuadranteTarjeta(
                titulo = "Row composable",
                descripcion = "A layout composable that places its children in a horizontal sequence.",
                colorDeFondo = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f),
                colorTexto = Color.Black // Añadido color del texto
            )
            CuadranteTarjeta(
                titulo = "Column composable",
                descripcion = "A layout composable that places its children in a vertical sequence.",
                colorDeFondo = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f),
                colorTexto = Color.Black // Añadido color del texto
            )
        }
    }
}

@Composable
fun CuadranteTarjeta(
    titulo: String,
    descripcion: String,
    colorDeFondo: Color,
    modifier: Modifier = Modifier,
    colorTexto: Color = Color.Black // Color por defecto del texto
) {
    Surface(color = colorDeFondo, modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
        ) {
            Text(
                text = titulo,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp),
                textAlign = TextAlign.Center,
                color = colorTexto // Usa el color del texto
            )
            Text(
                text = descripcion,
                textAlign = TextAlign.Justify,
                color = colorTexto // Usa el color del texto
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CuadranteAppPreview() {
    CuadranteDeComposeTheme {
        CuadranteApp()
    }
}
