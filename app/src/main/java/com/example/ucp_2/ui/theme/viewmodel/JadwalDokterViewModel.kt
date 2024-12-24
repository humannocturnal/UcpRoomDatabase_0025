package com.example.ucp_2.ui.theme.viewmodel

import Jadwal
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ucp_2.Repository.RepositoryJadwal

class JadwalDokterViewModel(private val repository: RepositoryJadwal.JadwalRepository) : ViewModel() {
    val dokterJadwal = MutableLiveData<List<Jadwal>>()

    fun getJadwalByDokterId(dokterId: Int) {
        repository.getAllJadwal().filter { it.dokterId == dokterId }.also { dokterJadwal.value = it }
    }
}