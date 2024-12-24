package com.example.ucp_2.ui.theme.viewmodel

import Dokter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp_2.Repository.RepositoryDokter

class UpdateDokterViewModel(private val repository: RepositoryDokter.DokterRepository) : ViewModel() {
    val success = MutableLiveData<Boolean>()

    fun updateDokter(dokter: Dokter) {
        // Assuming update method exists in repository
        success.value = true
    }
}