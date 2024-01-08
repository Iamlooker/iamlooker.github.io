import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
    alias(libs.plugins.kobwebx.markdown)
}

group = "com.looker.portfolio"
version = "1.0"

kobweb {
    app {
        index {
            description.set("Portfolio of Mohit")

            head.add {
                link(rel = "stylesheet", href = "https://fonts.googleapis.com/css2?family=Poppins&display=swap")
                link(rel = "stylesheet", href = "https://fonts.googleapis.com/css2?family=Roboto&display=swap")
            }

        }
    }
}

kotlin {
    configAsKobwebApplication("portfolio")

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
        }

        jsMain.dependencies {
            implementation(compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)
            implementation(libs.kobwebx.markdown)
        }
    }
}
