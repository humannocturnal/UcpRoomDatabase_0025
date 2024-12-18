package com.example.ucp_2

@Dao
interface DokterDao {
    @Insert
    suspend fun insertDokter(dokter: Dokter)

    @Query("SELECT * FROM dokter_table")
    fun getAllDokter(): LiveData<List<Dokter>>
}
