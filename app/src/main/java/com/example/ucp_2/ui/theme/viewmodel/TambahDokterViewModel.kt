package com.example.ucp_2.ui.theme.viewmodel

import Dokter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp_2.Repository.RepositoryDokter

class TambahDokterViewModel(private val repository: RepositoryDokter.DokterRepository) : ViewModel() {
    val success = MutableLiveData<Boolean>()

    fun tambahDokter(dokter: Dokter) {
        repository.insertDokter(dokter)
        success.value = true
    }
}
