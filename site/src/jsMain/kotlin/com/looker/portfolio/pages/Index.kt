package com.looker.portfolio.pages

import androidx.compose.runtime.Composable
import com.looker.portfolio.*
import com.looker.portfolio.components.*
import com.looker.portfolio.theme.Roboto
import com.looker.portfolio.theme.SubtitleStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

val fullWidthModifier = Modifier
    .width(100.percent)
    .minHeight(25.vh)
    .padding(12.px)

val gridMarginModifier = Modifier
    .margin(12.px)

@Page
@Composable
@Suppress("unused")
fun HomePage() {
    val breakpoint = rememberBreakpoint()

    if (breakpoint <= Breakpoint.MD) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeroCard(fullWidthModifier)
            ResumeCard(fullWidthModifier)
            HireMeCard(fullWidthModifier)
            ProjectsCard(fullWidthModifier)
            ContactMeCard(fullWidthModifier)
        }
    } else {
        Column {
            Row(modifier = Modifier.fillMaxWidth()) {
                HeroCard(
                    modifier = gridMarginModifier
                        .size(width = 60.percent, height = 32.vh)
                )
                ResumeCard(
                    modifier = gridMarginModifier
                        .size(width = 40.percent, height = 32.vh)
                )
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                HireMeCard(
                    modifier = gridMarginModifier
                        .size(width = 35.percent, height = 28.vh)
                )
                ProjectsCard(
                    modifier = gridMarginModifier
                        .size(width = 65.percent, height = 28.vh)
                )
            }
            ContactMeCard(
                modifier = Modifier
                    .margin(12.px)
                    .size(width = 100.percent, height = 35.vh)
            )
        }
    }
}

@Composable
fun HeroCard(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Card(
            modifier = ScalableButtonStyle.toModifier()
                .fillMaxSize()
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TitleText(
                    title = "Mohit Sharma",
                    subtitle = "I'm"
                )
                Image(
                    src = HeroImage,
                    modifier = Modifier
                        .align(Alignment.Bottom)
                        .height(30.vh)
                        .objectFit(ObjectFit.Fill)
                )
            }
        }
    }
}

@Composable
fun ResumeCard(
    modifier: Modifier = Modifier
) {
    Link(Resume, modifier = modifier) {
        Card(
            modifier = ScalableButtonStyle.toModifier()
                .fillMaxSize()
        ) {
            FaArrowUp(
                modifier = Modifier
                    .margin(32.px)
                    .align(Alignment.TopEnd)
                    .rotateZ(45.deg),
                size = IconSize.LG
            )
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TitleText(
                    title = "Resume",
                    subtitle = "My"
                )
                Image(
                    src = Projects,
                    modifier = Modifier
                        .height(25.vh)
                        .objectFit(ObjectFit.Fill)
                )
            }
        }
    }
}

@Composable
fun HireMeCard(
    modifier: Modifier = Modifier
) {
    Link(GitHubProfile, modifier = modifier) {
        Card(
            modifier = ScalableButtonStyle.toModifier()
                .fillMaxSize()
        ) {
            FaArrowUp(
                modifier = Modifier
                    .margin(32.px)
                    .align(Alignment.TopEnd)
                    .rotateZ(45.deg),
                size = IconSize.LG
            )
            TitleText(
                title = "Android Developer",
                subtitle = "Hire Me"
            )
        }
    }
}

@Composable
fun ProjectsCard(
    modifier: Modifier = Modifier
) {
    Link(GitHubProfile, modifier = modifier) {
        Card(
            modifier = ScalableButtonStyle.toModifier()
                .fillMaxSize()
        ) {
            FaArrowUp(
                modifier = Modifier
                    .margin(32.px)
                    .align(Alignment.TopEnd)
                    .rotateZ(45.deg),
                size = IconSize.LG
            )
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TitleText(
                    title = "Projects",
                    subtitle = "Explore"
                )
                Image(
                    src = Android,
                    modifier = Modifier
                        .height(25.vh)
                        .objectFit(ObjectFit.Fill)
                )
            }
        }
    }
}

@Composable
fun ContactMeCard(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Card(
            modifier = ScalableButtonStyle.toModifier()
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                src = "lights.png",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .height(32.vh)
                    .objectFit(ObjectFit.Fill)
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                SpanText(
                    text = "Find Me",
                    modifier = SubtitleStyle.toModifier()
                        .margin(left = 50.px)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Link(GitHubProfile) {
                        Button(
                            onClick = {},
                            modifier = CrookedButtonStyle.toModifier()
                                .margin(12.px)
                                .padding(12.px)
                        ) {
                            FaGithub(size = IconSize.XXL)
                        }
                    }
                    Link(LinkedinProfile) {
                        Button(
                            onClick = {},
                            modifier = CrookedButtonStyle.toModifier()
                                .margin(12.px)
                                .padding(12.px)
                        ) {
                            FaLinkedin(size = IconSize.XXL)
                        }
                    }
                    Link(Telegram) {
                        Button(
                            onClick = {},
                            modifier = CrookedButtonStyle.toModifier()
                                .margin(12.px)
                                .padding(12.px)
                        ) {
                            FaTelegram(size = IconSize.XXL)
                        }
                    }
                    Link(Mail) {
                        Button(
                            onClick = {},
                            modifier = CrookedButtonStyle.toModifier()
                                .margin(12.px)
                                .padding(12.px)
                        ) {
                            FaEnvelope(size = IconSize.XXL)
                        }
                    }
                }
                SpanText(
                    text = Credits,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .color(
                            if (ColorMode.current.isDark) Colors.DarkGray
                            else Colors.Gray
                        )
                        .fontFamily(Roboto)
                        .fontWeight(FontWeight.Normal)
                        .fontSize(14.px)
                        .textAlign(TextAlign.Start)
                )
            }
        }
    }
}
