package com.example.loginjetpackcompose.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
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
import com.example.loginjetpackcompose.ui.theme.myPrimaryColor
import com.example.loginjetpackcompose.ui.theme.mySecondaryColor

@Preview
@Composable
fun LoginPage() {
    val imageTop = painterResource(id = R.drawable.login_top)

    var emailValue by remember {
        mutableStateOf("")
    }

    var passwordValue by remember {
        mutableStateOf("")
    }

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
                .fillMaxHeight(0.50f)
                .clip(RoundedCornerShape(topStartPercent = 10, topEndPercent = 10))
                .background(mySecondaryColor)
                .padding(10.dp)
        ) {
            // Text
            Text(
                text = "Sign In",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    letterSpacing = TextUnit.Unspecified
                ),
                fontSize = TextUnit.Unspecified,
                color = myPrimaryColor
            )

            // Space
            Spacer(modifier = Modifier.padding(10.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                // OutlinedTextField
                OutlinedTextField(
                    value = emailValue,
                    onValueChange = { it ->
                        emailValue = it
                    },
                    label = { Text(text = "Email Address") },
                    placeholder = { Text(text = "Email Address") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(0.8f)
                )

                // OutlinedTextField
                OutlinedTextField(
                    value = passwordValue,
                    onValueChange = { it ->
                        passwordValue = it
                    },
                    label = { Text(text = "Password") },
                    placeholder = { Text(text = "Password") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(0.8f)
                )

                // Space
                Spacer(modifier = Modifier.padding(10.dp))

                // Button
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .height(50.dp)
                ) {
                    Text(
                        text = "Sign In",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            letterSpacing = TextUnit.Unspecified
                        ),
                        fontSize = TextUnit.Unspecified
                    )
                }

                // Space
                Spacer(modifier = Modifier.padding(20.dp))

                // Text
                Text(
                    text = "Crate An Account",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        letterSpacing = TextUnit.Unspecified
                    ),
                    fontSize = TextUnit.Unspecified,
                    modifier = Modifier.clickable(onClick = {})
                )
            }
        }
    }
}
