package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class GetDataViewModel: ViewModel() {

    private var useCase = GetDataUseCase()
    val listResponse = MutableLiveData<List<UniversityData>>()

    fun callAPI() {
        viewModelScope.launch {
            listResponse.value = useCase.getData()
        }
    }
}