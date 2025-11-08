package com.yrmz.auth.presentation.login

sealed interface LoginEvent {
    data object Success: LoginEvent
}
