package com.yrmz.auth.presentation.reset_password

import androidx.compose.foundation.text.input.TextFieldState
import com.yrmz.core.presentation.util.UiText

data class ResetPasswordSate(
    val passwordTextState: TextFieldState = TextFieldState(),
    val isLoading: Boolean = false,
    val errorText: UiText? = null,
    val isPasswordVisible: Boolean = false,
    val canSubmit: Boolean = false,
    val isResetSuccessful: Boolean = false
)
