package com.example.ucp_2

@Entity(tableName = "dokter_table")
data class Dokter(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nama: String,
    val spesialis: String,
    val klinik: String,
    val noHp: String,
    val jamKerja: String
)