package com.yrmz.auth.presentation.register_success

import com.yrmz.core.presentation.util.UiText

data class RegisterSuccessState(
    val registeredEmail: String = "",
    val isResendingVerificationEmail: Boolean = false,
    val resentVerificationError: UiText? = null
)
