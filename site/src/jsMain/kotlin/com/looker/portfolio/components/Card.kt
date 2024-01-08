package com.looker.portfolio.components

import androidx.compose.runtime.Composable
import com.looker.portfolio.theme.LocalShapes
import com.varabyte.kobweb.compose.foundation.layout.BoxScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.theme.SilkTheme
import com.varabyte.kobweb.silk.theme.colors.palette.overlay
import com.varabyte.kobweb.silk.theme.shapes.Shape
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.vh

@Composable
fun Card(
    modifier: Modifier = Modifier,
    shape: Shape = LocalShapes.current.large,
    backgroundColor: Color = SilkTheme.palette.overlay,
    contentAlignment: Alignment = Alignment.CenterStart,
    content: @Composable BoxScope.() -> Unit
) {
    Surface(
        modifier = Modifier
            .clip(shape)
            .background(backgroundColor)
            .then(modifier),
        contentAlignment = contentAlignment,
        content = content
    )
}