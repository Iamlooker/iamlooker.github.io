package com.looker.portfolio.theme

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.graphics.lightened
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.ColorSchemes
import com.varabyte.kobweb.silk.theme.colors.palette.*

@InitSilk
fun overrideTheme(ctx: InitSilkContext) {
    ctx.theme.palettes.light.background = Color.Companion.rgb(225, 255, 214)
    ctx.theme.palettes.light.overlay = Color.Companion.rgb(255, 255, 255)
    ctx.theme.palettes.light.color = Color.Companion.rgb(17, 43, 13)
    ctx.theme.palettes.light.border = Colors.Transparent

    ctx.theme.palettes.light.button.default = Colors.Transparent
    ctx.theme.palettes.light.button.hover = Color.Companion.rgb(225, 255, 214).darkened(0.2F)
    ctx.theme.palettes.light.button.pressed = Color.Companion.rgb(225, 255, 214).darkened(0.4F)

    ctx.theme.palettes.dark.background = Color.Companion.rgb(48, 48, 47)
    ctx.theme.palettes.dark.overlay = Color.Companion.rgb(0, 0, 0)
    ctx.theme.palettes.dark.color = Color.Companion.rgb(228, 255, 224)
    ctx.theme.palettes.dark.border = Colors.Transparent

    ctx.theme.palettes.dark.button.default = Colors.Transparent
    ctx.theme.palettes.dark.button.hover = Color.Companion.rgb(48, 48, 47).lightened(0.2F)
    ctx.theme.palettes.dark.button.pressed = Color.Companion.rgb(48, 48, 47).lightened(0.4F)
}

val SecondaryColorDark = Color.Companion.rgb(255, 175, 84)
val SecondaryColorLight = Color.Companion.rgb(107, 62, 11)

val SecondaryColorScheme = ColorSchemes.Brown