plugins {
    kotlin("multiplatform") version "1.3.71"
    id("maven-publish")
}

kotlin {
    jvm()
    js {
        browser { }
        nodejs { }
    }
    // For ARM, should be changed to iosArm32 or iosArm64
    // For Linux, should be changed to e.g. linuxX64
    // For MacOS, should be changed to e.g. macosX64
    // For Windows, should be changed to e.g. mingwX64
    linuxX64("linux")
    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin ("stdlib-common"))
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin ("test-common"))
                implementation(kotlin ("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation( kotlin ("stdlib-jdk8"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin ("test"))
                implementation(kotlin ("test-junit"))
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(kotlin ("stdlib-js"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin ("test-js"))
            }
        }
        val linuxMain by getting { }
        val linuxTest by getting { }
    }
}