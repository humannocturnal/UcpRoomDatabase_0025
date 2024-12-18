package com.example.ucp_2


@Entity(tableName = "jadwal_table")
data class Jadwal(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val namaDokter: String,
    val namaPasien: String,
    val noHp: String,
    val tanggal: String,
    val status: String
)
