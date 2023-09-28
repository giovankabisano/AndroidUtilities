package com.giovankov.deviceInformation

import android.os.Build

fun buildId(): String {
    return Build.ID
}

fun brand(): String {
    return Build.BRAND
}

fun device(): String {
    return Build.DEVICE
}

fun manufacturer(): String {
    return Build.MANUFACTURER
}

fun model(): String {
    return Build.MODEL
}
