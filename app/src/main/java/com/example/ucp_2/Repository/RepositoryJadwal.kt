package com.example.ucp_2.Repository

import Jadwal
import JadwalDao

interface RepositoryJadwal {
    class JadwalRepository(private val jadwalDao: JadwalDao) {
        fun getAllJadwal() = jadwalDao.getAllJadwal()
        suspend fun insertJadwal(jadwal: Jadwal) = jadwalDao.insertJadwal(jadwal)
        fun deleteJadwal(jadwal: Jadwal) = jadwalDao.deleteJadwal(jadwal)
    }

}