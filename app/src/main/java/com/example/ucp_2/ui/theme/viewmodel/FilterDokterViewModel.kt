package com.example.ucp_2.ui.theme.viewmodel

import Dokter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp_2.Repository.RepositoryDokter

class FilterDokterViewModel(private val repository: RepositoryDokter.DokterRepository) : ViewModel() {
    val filteredDokterList = MutableLiveData<List<Dokter>>()

    fun filterDokter(spesialis: String) {
        filteredDokterList.value = repository.getAllDokter().filter { it.spesialis == spesialis }
    }
}

fun Any.filter(function: () -> Boolean): List<Dokter>? {
    TODO("Not yet implemented")
}
