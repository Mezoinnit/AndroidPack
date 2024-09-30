package com.example.androidpack.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androidpack.R


val dangrek = FontFamily(Font(R.font.dangrek, FontWeight.Normal))
val dangrekBold = FontFamily(Font(R.font.dangrek, FontWeight.Bold))

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = dangrek,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.2.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = dangrek,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.175.sp
    ),
    bodySmall = TextStyle(
        fontFamily = dangrek,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.15.sp
    ),
    titleLarge = TextStyle(
        fontFamily = dangrekBold,
        fontSize = 32.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = dangrekBold,
        fontSize = 24.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = dangrekBold,
        fontSize = 16.sp,
    ),
)