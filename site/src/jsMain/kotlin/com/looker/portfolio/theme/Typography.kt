package com.looker.portfolio.theme

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.theme.SilkTheme
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.color
import org.jetbrains.compose.web.css.px

const val Poppins = "Poppins"
const val Roboto = "Roboto"

val TitleStyle by ComponentStyle {
    base {
        Modifier
            .fontFamily(Poppins)
            .fontSize(30.px)
            .fontWeight(FontWeight.Bold)
    }
}

val SubtitleStyle by ComponentStyle {
    base {
        Modifier
            .fontFamily(Roboto)
            .fontWeight(FontWeight.Bold)
            .fontSize(25.px)
    }
}