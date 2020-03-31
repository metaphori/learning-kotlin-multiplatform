allprojects {
    group = "org.metaphori"
    version = "0.1"

    repositories {
        mavenCentral()
    }
}

subprojects {
    tasks.withType<Test> {
        /*
        getByName<Test>("allTests"){
            testLogging {
                events("passed", "skipped", "failed")
            }
        }

         */
        testLogging {
            events("passed", "skipped", "failed")
        }
    }
}