package com.example.appcaffe.ui.Componentes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appcaffe.R
import com.example.appcaffe.ui.theme.AppCaffeTheme
import com.example.appcaffe.ui.theme.CafeteriaAzul
import com.example.appcaffe.ui.theme.CafeteriaVerde

@Composable
fun ProductoCarta(nombre:String, descripcion: String, precio: Double){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { }
            .size(540.dp),
        elevation = 10.dp,
        shape = MaterialTheme.shapes.small

    ) {
        Image(painterResource(id = R.drawable.c1), contentDescription = null)

        Surface(
            modifier = Modifier
                .fillMaxWidth(),
            color = CafeteriaVerde.copy(alpha = 0.09f)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier =  Modifier.fillMaxWidth(),
            ) {
                Text(text = nombre,
                    style = MaterialTheme.typography.h4)
                Text(text = descripcion,
                    style = MaterialTheme.typography.body1)
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom,

                ) {
                    Row() {
                        Image(painterResource(id = R.drawable.lc1),
                            contentDescription = null,
                            modifier = Modifier.size(32.dp, 36.dp))
                        Text(text = "$ $precio MXN", Modifier.fillMaxWidth(),
                            textAlign = TextAlign.End,
                            style = MaterialTheme.typography.h4)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun ProductoCartaPreview(){
    AppCaffeTheme(){
        ProductoCarta(
            "Cafe Bonamkaf",
            "El mejor cafe de Santo Doming",
            20.00)
    }
}

