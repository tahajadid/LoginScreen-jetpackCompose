package com.example.loginjetpackcompose

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.loginjetpackcompose.ui.composables.LoginPage
import com.example.loginjetpackcompose.ui.theme.LoginJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        setContent {
            LoginJetpackComposeTheme {
                // LoginAppliaction()
                LoginPage()
            }
        }
    }

    @Composable
    fun LoginAppliaction() {
        Text(text = "Hello !")
    }
}
