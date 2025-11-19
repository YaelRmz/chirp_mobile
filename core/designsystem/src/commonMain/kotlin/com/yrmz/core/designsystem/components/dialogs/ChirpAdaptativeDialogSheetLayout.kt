package com.yrmz.core.designsystem.components.dialogs

import androidx.compose.runtime.Composable
import com.yrmz.core.presentation.util.currentDeviceConfiguration

@Composable
fun ChirpAdaptativeDialogSheetLayout(
    onDismiss: () -> Unit,
    content: @Composable () -> Unit
) {
    val configuration = currentDeviceConfiguration()
    if (configuration.isMobile) {
        ChirpBottomSheet(
            onDismiss = onDismiss,
            content = content
        )
    } else {
        ChirpDialogContent(
            onDismiss = onDismiss,
            content = content
        )
    }
}
