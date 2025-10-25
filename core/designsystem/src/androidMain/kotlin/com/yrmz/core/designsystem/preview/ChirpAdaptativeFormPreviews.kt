package com.yrmz.core.designsystem.preview

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import com.yrmz.core.designsystem.components.brand.ChirpBrandLogo
import com.yrmz.core.designsystem.components.layouts.ChirpAdaptativeFormLayout
import com.yrmz.core.designsystem.theme.ChirpTheme

@Composable
@PreviewLightDark
@PreviewScreenSizes
fun ChirpAdaptativeFormLayoutLightPreview() {
    ChirpTheme {
        ChirpAdaptativeFormLayout(
            headerText = "Welcome to Chirp!",
            errorText = "Login failed!",
            logo = { ChirpBrandLogo() },
            formContent = {
                Text(
                    text = "Sample form title",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = "Sample form title",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        )
    }
}
