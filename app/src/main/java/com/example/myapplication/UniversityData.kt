package com.example.myapplication

data class UniversityData(
    val domains: List<String>,
    val webPages: List<String>,
    val stateProvince: String? = null,
    val name: String,
    val country: String,
    val alphaTwoCode: AlphaTwoCode
)

enum class AlphaTwoCode {
    Us
}