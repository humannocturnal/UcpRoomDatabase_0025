package com.example.ucp_2.ui.theme.viewmodel

import Dokter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp_2.Repository.RepositoryDokter

class CariDokterViewModel(private val repository: RepositoryDokter.DokterRepository) : ViewModel() {
    val searchResults = MutableLiveData<List<Dokter>>()

    fun searchDokter(query: String) {
        searchResults.value = repository.getAllDokter().filter { it.nama.contains(query, ignoreCase = true) }
    }
}