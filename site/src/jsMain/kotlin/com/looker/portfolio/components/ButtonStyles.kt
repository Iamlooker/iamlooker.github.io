package com.looker.portfolio.components

import com.looker.portfolio.theme.SecondaryColorDark
import com.looker.portfolio.theme.SecondaryColorLight
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.graphics.lightened
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.rotateZ
import com.varabyte.kobweb.compose.ui.modifiers.scale
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.theme.SilkTheme
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent

val SecondaryButtonStyle by ComponentStyle {
    base {
        Modifier
            .background(
                color = if (colorMode.isDark) SecondaryColorLight
                else SecondaryColorDark
            )
            .transition(CSSTransition(TransitionProperty.All, 300.ms))
    }
    hover {
        Modifier.background(
            color = if (colorMode.isDark) SecondaryColorLight.lightened(0.2F)
            else SecondaryColorDark.darkened(0.2F)
        )
    }
}

val ScalableButtonStyle by ComponentStyle {
    base {
        Modifier.transition(CSSTransition(TransitionProperty.All, 300.ms))
    }
    hover {
        Modifier.scale(105.percent)
    }
}

val CrookedButtonStyle by ComponentStyle {
    base {
        Modifier
            .background(Colors.Transparent)
            .transition(CSSTransition(TransitionProperty.All, 300.ms))
    }
    hover {
        Modifier
            .background(Colors.Transparent)
            .rotateZ(8.deg)
    }
}