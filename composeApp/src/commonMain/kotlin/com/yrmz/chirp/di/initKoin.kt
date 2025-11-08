package com.yrmz.chirp.di

import com.yrmz.auth.presentation.di.authPresentationModule
import com.yrmz.chat.presentation.di.chatPresentationModule
import com.yrmz.core.data.di.coreDataModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(
            coreDataModule,
            authPresentationModule,
            appModule,
            chatPresentationModule
        )
    }
}
