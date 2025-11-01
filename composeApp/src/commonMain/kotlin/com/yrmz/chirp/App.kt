package com.yrmz.chirp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.yrmz.chirp.navigation.DeepLinkListener
import com.yrmz.chirp.navigation.NavigationRoot
import com.yrmz.core.designsystem.theme.ChirpTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val navController = rememberNavController()
    DeepLinkListener(navController)
    ChirpTheme {
        NavigationRoot(navController)
    }
}
