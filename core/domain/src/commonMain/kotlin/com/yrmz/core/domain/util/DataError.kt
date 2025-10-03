package com.yrmz.core.domain.util

sealed interface DataError: Error {
    enum class Remote {
        BAD_REQUEST,
        REQUEST_TIMEOUT,
        UNAUTHORIZED,
        FORBIDDEN,
        NOT_FOUND,
        CONFLICT,
        INTERNAL_SERVER_ERROR,
        TOO_MANY_REQUEST,
        NO_INTERNET,
        PAYLOAD_TOO_LARGE,
        SERVER_ERROR,
        SERVICE_UNAVAILABLE,
        SERIALIZATION,
        UNKNOWN
    }

    enum class Local {
        DISK_FULL,
        NOT_FOUND,
        UNKNOWN
    }
}
