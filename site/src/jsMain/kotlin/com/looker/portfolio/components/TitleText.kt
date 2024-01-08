package com.looker.portfolio.components

import androidx.compose.runtime.Composable
import com.looker.portfolio.theme.SubtitleStyle
import com.looker.portfolio.theme.TitleStyle
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.SilkTheme
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.color
import org.jetbrains.compose.web.css.px

@Composable
fun TitleText(
    title: String,
    subtitle: String
) {
    Column {
        SpanText(
            text = subtitle,
            modifier = SubtitleStyle.toModifier()
                .margin(left = 50.px)
                .color(
                    if (ColorMode.current.isDark) Colors.DarkGray
                    else Colors.Gray
                )
        )
        SpanText(
            text = title,
            modifier = TitleStyle.toModifier()
                .margin(left = 50.px)
                .color(SilkTheme.palette.color)
        )
    }
}