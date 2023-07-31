package com.example.buissnesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buissnesscardapp.ui.theme.BuissnessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuissnessCardAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = Color(0xFFd2e8d4)
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.android_logo)

        Image(
            painter = image,
            contentDescription = null,
            Modifier
                .fillMaxWidth(0.35f)
                .background(Color(0xFF073042))
        )
        Text(
            text = stringResource(R.string.my_name),
            fontSize = 28.sp,
            modifier = Modifier
                .padding(top = 5.dp)
        )
        Text(
            text = stringResource(R.string.android_developer_extraordinaire),
            color = Color(0xFF006c39),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 5.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 32.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ContactRow(
            text = stringResource(R.string.phone_number),
            icon = Icons.Rounded.Phone
        )
        ContactRow(
            text = stringResource(R.string.share),
            icon = Icons.Rounded.Share
        )
        ContactRow(
            text = stringResource(R.string.kacper_blabla_gmail_com),
            icon = Icons.Rounded.Email
        )
    }
}

@Composable
fun ContactRow(text: String, icon: ImageVector) {
    Row(
        modifier = Modifier.padding(8.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF006c39),
            modifier = Modifier
                .weight(2f)
        )
        Text(
            text = text,
            color = Color.Black,
            modifier = Modifier
                .weight(3f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = Color(0xFFd2e8d4)
    ) {
        BusinessCard()
    }
}