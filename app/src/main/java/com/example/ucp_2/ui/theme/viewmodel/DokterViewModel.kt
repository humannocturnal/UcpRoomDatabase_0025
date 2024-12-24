package com.example.ucp_2.ui.theme.viewmodel

import Dokter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp_2.Repository.RepositoryDokter

class DokterViewModel(private val repository: RepositoryDokter.DokterRepository) : ViewModel() {
    val dokterList = MutableLiveData<List<Dokter>>()

    fun getAllDokter() {
        repository.getAllDokter().also { dokterList.value = it }
    }
}
