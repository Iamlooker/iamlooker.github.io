package com.looker.portfolio.theme

import androidx.compose.runtime.staticCompositionLocalOf
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.Shape
import org.jetbrains.compose.web.css.vh

data class Shapes(
    val small: Shape = Rect(2.vh),
    val medium: Shape = Rect(4.vh),
    val large: Shape = Rect(6.vh),
    val full: Shape = Circle()
)

val LocalShapes = staticCompositionLocalOf { Shapes() }