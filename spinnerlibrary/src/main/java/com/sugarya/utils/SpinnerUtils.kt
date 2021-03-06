package com.sugarya.utils

import android.util.SparseArray
import com.sugarya.footer.interfaces.FooterMode
import java.text.SimpleDateFormat
import java.util.*


val FOOTER_MODE_SPARSE =
        SparseArray<FooterMode>().apply {
            put(0, FooterMode.MODE_TRANSLATE)
            put(1, FooterMode.MODE_EXPAND)
        }

const val MODE_EXPAND = 1

fun formatDate(date: Date): String {
    val format = SimpleDateFormat("yyyy-MM-dd", Locale.CHINA)
    return format.format(date)
}