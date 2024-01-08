package com.looker.portfolio

import androidx.compose.runtime.*
import com.looker.portfolio.theme.LocalShapes
import com.looker.portfolio.theme.Shapes
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaLightbulb
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.clip
import kotlinx.browser.localStorage
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalShapes provides Shapes()) {
        SilkApp {
            var colorMode by ColorMode.currentState
            LaunchedEffect(true) {
                val retrievedTheme = localStorage.getItem("") ?: ColorMode.LIGHT.name
                colorMode = ColorMode.valueOf(retrievedTheme)
            }
            Surface(
                modifier = SmoothColorStyle.toModifier().minHeight(100.vh),
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TopBar {
                        colorMode = colorMode.opposite
                        localStorage.setItem("", colorMode.name)
                    }
                    content()
                }
            }
        }
    }
}

@Composable
fun TopBar(
    onThemeChange: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ) {
        Button(
            modifier = Modifier
                .clip(LocalShapes.current.full)
                .margin(12.px),
            onClick = { onThemeChange() }
        ) {
            if (ColorMode.current.isDark) {
                FaLightbulb()
            } else {
                FaMoon()
            }
        }
    }
}
