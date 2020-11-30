package ru.skillbranch.devintensive.extensions

fun String.truncate(num:Int = 16): String {
    if (this.length > num) {
        return this.substring(0, num).trim().plus("...")
    }

    return this.trim()
}