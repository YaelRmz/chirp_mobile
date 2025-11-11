package com.yrmz.auth.presentation.di

import com.yrmz.auth.presentation.email_verification.EmailVerificationViewModel
import com.yrmz.auth.presentation.forgot_password.ForgotPasswordViewModel
import com.yrmz.auth.presentation.login.LoginViewModel
import com.yrmz.auth.presentation.register.RegisterViewModel
import com.yrmz.auth.presentation.register_success.RegisterSuccessViewModel
import com.yrmz.auth.presentation.reset_password.ResetPasswordViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val authPresentationModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::RegisterSuccessViewModel)
    viewModelOf(::EmailVerificationViewModel)
    viewModelOf(::LoginViewModel)
    viewModelOf(::ForgotPasswordViewModel)
    viewModelOf(::ResetPasswordViewModel)
}
