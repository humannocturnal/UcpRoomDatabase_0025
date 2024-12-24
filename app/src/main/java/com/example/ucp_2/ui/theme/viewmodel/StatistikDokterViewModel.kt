package com.example.ucp_2.ui.theme.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp_2.Repository.RepositoryDokter

class StatistikDokterViewModel(private val repository: RepositoryDokter.DokterRepository) : ViewModel() {
    val totalDokter = MutableLiveData<Int>()

    fun calculateTotalDokter() {
        totalDokter.value = repository.getAllDokter().size
    }
}