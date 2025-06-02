plugins {
    java
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

sourceSets {
    main {
        java {
            srcDir("src/main/java")
            destinationDirectory.set(file("build/classes/java/main"))
        }
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    doLast {
        if (!destinationDirectory.get().asFile.exists()) {
            throw GradleException("Compilation failed: Output directory does not exist")
        } else {
            println("Compilation successful: Output directory exists")
            println("Source directory: src/main/java")
        println("Output directory: ${destinationDirectory.get().asFile.canonicalPath}")
        println("Java Compilation Completed")
    }
}
}

tasks.clean {
    delete("build/classes/java/main")
    doLast {
        println("Clean completed: Output directory deleted")
    }
}