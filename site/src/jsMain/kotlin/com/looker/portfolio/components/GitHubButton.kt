package com.looker.portfolio.components

import androidx.compose.runtime.Composable
import com.looker.portfolio.theme.LocalShapes
import com.looker.portfolio.theme.Roboto
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.rotateZ
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowUp
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.SilkTheme
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.shapes.clip
import kotlinx.browser.window
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.px

@Composable
fun GithubButton(
    modifier: Modifier = Modifier
) {
    Button(
        onClick = {
            window.location.href = "mailto:mohit2002ss@gmail.com"
        },
        modifier = SecondaryButtonStyle.toModifier()
            .clip(LocalShapes.current.medium)
            .margin(24.px)
            .then(modifier),
    ) {
        FaGithub()
        SpanText(
            "Check Out", modifier = Modifier
                .fontFamily(Roboto)
                .margin(left = 6.px, right = 10.px)
        )
        FaArrowUp(
            modifier = Modifier
                .background(SilkTheme.palette.background)
                .rotateZ(45.deg),
            size = IconSize.LG
        )
    }
}