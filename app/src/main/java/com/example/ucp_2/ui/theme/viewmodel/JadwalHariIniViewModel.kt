package com.example.ucp_2.ui.theme.viewmodel

import Jadwal
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp_2.Repository.RepositoryJadwal

class JadwalHariIniViewModel(private val repository: RepositoryJadwal.JadwalRepository) : ViewModel() {
    val jadwalHariIni = MutableLiveData<List<Jadwal>>()

    fun getJadwalHariIni(today: String) {
        jadwalHariIni.value = repository.getAllJadwal().filter { it.waktu.startsWith(today) }
    }
}
