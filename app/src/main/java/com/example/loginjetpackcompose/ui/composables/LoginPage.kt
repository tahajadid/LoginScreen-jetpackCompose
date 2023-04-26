package com.example.loginjetpackcompose.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.loginjetpackcompose.R

@Preview
@Composable
fun LoginPage() {
    val imageTop = painterResource(id = R.drawable.login_top)

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.TopCenter
        ) {
            Image(painter = imageTop, contentDescription = "imageTop")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(0.60f)
                .clip(RoundedCornerShape(topStartPercent = 30, topEndPercent = 30))
                .background(Color.White)
                .padding(10.dp)
        ) {
            Text(text = "Sign In",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                letterSpacing = TextUnit.Unspecified
                ),
                fontSize = TextUnit.Unspecified
            )
            Spacer(modifier = Modifier.padding(20.dp))
        }
    }
}
