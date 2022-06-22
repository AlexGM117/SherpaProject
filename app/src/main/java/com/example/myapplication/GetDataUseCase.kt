package com.example.myapplication

class GetDataUseCase {
    private val service = UniversitiesAPI.getInstance()

    suspend fun getData(): List<UniversityData> {
        val call = service.getQuery().body()
        return if (call != null) {
            return call
        } else {
            emptyList<UniversityData>()
        }
    }
}