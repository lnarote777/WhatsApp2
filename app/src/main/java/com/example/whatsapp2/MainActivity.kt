package com.example.whatsapp2


import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp2.ui.theme.WhatsApp2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WhatsApp2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(modifier) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
            .background(color = colorResource(R.color.headerWa))
            .fillMaxWidth()

        ) {
            Text(
                modifier = Modifier.padding(horizontal = 15.dp),
                textAlign = TextAlign.Center,
                text = stringResource(R.string.inicio),
                fontSize = 30.sp,
                color = colorResource(R.color.white),
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier.weight(1f))

            Image(painter = painterResource(R.drawable.camera),
                contentDescription = "Camara",
                modifier = Modifier.size(30.dp)
            )

            Spacer(Modifier.width(10.dp))

            Icon(imageVector = Icons.Default.Search,
                contentDescription = "Buscar",
                tint = colorResource(R.color.white),
                modifier = Modifier.size(30.dp)
            )

            Spacer(Modifier.width(10.dp))

            Icon( imageVector = Icons.Filled.MoreVert,
                contentDescription = "Ver más",
                tint = colorResource(R.color.white),
                modifier = Modifier.size(30.dp)
            )


        }

        Listado()

    }

}

@Composable
fun Listado(){
    Column(Modifier
        .background(color = colorResource(R.color.bodyWa))
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = stringResource(R.string.contacto1),
                modifier = Modifier.size(60.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto1),
                fontSize = 20.sp
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )

            Spacer(Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto2),
                fontSize = 20.sp
            )
        }


        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )

            Spacer(Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto3),
                fontSize = 20.sp

            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = stringResource(R.string.contacto1),
                modifier = Modifier.size(60.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto1),
                fontSize = 20.sp
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )

            Spacer(Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto2),
                fontSize = 20.sp
            )
        }


        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )

            Spacer(Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto3),
                fontSize = 20.sp

            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = stringResource(R.string.contacto1),
                modifier = Modifier.size(60.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto1),
                fontSize = 20.sp
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )

            Spacer(Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto2),
                fontSize = 20.sp
            )
        }


        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )

            Spacer(Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto3),
                fontSize = 20.sp

            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = stringResource(R.string.contacto1),
                modifier = Modifier.size(60.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto1),
                fontSize = 20.sp
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )

            Spacer(Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto2),
                fontSize = 20.sp
            )
        }


        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )

            Spacer(Modifier.width(10.dp))

            Text(
                text = stringResource(R.string.contacto3),
                fontSize = 20.sp

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WhatsApp2Theme {
        Greeting()
    }
}