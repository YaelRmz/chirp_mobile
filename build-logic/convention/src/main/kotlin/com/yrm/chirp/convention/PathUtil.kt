package com.yrm.chirp.convention

import org.gradle.api.Project
import java.util.Locale

fun Project.pathToPackageNAme(): String {
    val relativePackage = path
        .replace(':', '.')
        .lowercase()

    return "com.yrmz$relativePackage"
}

fun Project.pathToResourcePrefix(): String {
    return path
        .replace(':', '_')
        .lowercase()
        .drop(1) + "_"
}

fun Project.pathToFrameworkName(): String {
    val parts = this.path.split(":", "-", "_", " ")
    return parts.joinToString("") { part ->
        part.replaceFirstChar {
            it.titlecase(Locale.ROOT)
        }
    }
}
