plugins {

    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

    // Kotlin DSL syntax for the parcelize plugin
    id("kotlin-parcelize")
}

android {
    namespace = "com.example.labactivity4_1"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.labactivity4_1"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.4.0")

    // Unit Testing (Mockito + Robolectric)
    testImplementation("org.mockito:mockito-core:5.20.0")
    testImplementation("org.mockito.kotlin:mockito-kotlin:6.1.0")
    testImplementation("org.robolectric:robolectric:4.16")
    testImplementation("androidx.test:core:1.7.0")
    testImplementation("androidx.test.ext:junit:1.3.0")

    // Allows using Espresso commands in Robolectric (local) tests
    testImplementation("androidx.test.espresso:espresso-core:3.5.1")
    testImplementation("androidx.test.espresso:espresso-intents:3.5.1")

    // UI Testing (Espresso Contrib + Idling Resource)
    androidTestImplementation("androidx.test.espresso:espresso-contrib:3.7.0")
    implementation("androidx.test.espresso:espresso-idling-resource:3.7.0")
}