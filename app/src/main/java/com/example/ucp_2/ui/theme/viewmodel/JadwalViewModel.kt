package com.example.ucp_2.ui.theme.viewmodel

import Jadwal
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp_2.Repository.RepositoryJadwal

class JadwalViewModel(private val repository: RepositoryJadwal.JadwalRepository) : ViewModel() {
    val jadwalList = MutableLiveData<List<Jadwal>>()

    fun getAllJadwal() {
        repository.getAllJadwal().also { jadwalList.value = it }
    }

    suspend fun tambahJadwal(jadwal: Jadwal) {
        repository.insertJadwal(jadwal)
    }

    fun hapusJadwal(jadwal: Jadwal) {
        repository.deleteJadwal(jadwal)
    }
}