package com.example.ucp_2.ui.theme.viewmodel

import Dokter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp_2.Repository.RepositoryDokter

class DetailDokterViewModel(private val repository: RepositoryDokter.DokterRepository) : ViewModel() {
    val dokter = MutableLiveData<Dokter>()

    fun getDokterById(id: Int) {
        dokter.value = repository.getAllDokter().find { it.id == id }
    }
}

private fun Any.find(function: () -> Boolean): Dokter? {
    TODO("Not yet implemented")
}
