package com.example.ucp_2.Repository

import Dokter
import com.example.ucp_2.Data.Dao.DokterDao

interface RepositoryDokter {
    class DokterRepository(private val dokterDao: DokterDao) {
        fun getAllDokter() = dokterDao.getAllDokter()
        fun insertDokter(dokter: Dokter) = dokterDao.insertDokter(dokter)
        fun deleteDokter(dokter: Dokter) = dokterDao.deleteDokter(dokter)
    }

}