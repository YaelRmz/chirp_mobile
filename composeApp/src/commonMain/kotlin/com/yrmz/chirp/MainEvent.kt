package com.yrmz.chirp

sealed interface MainEvent {
    data object OnSessionExpired: MainEvent
}
