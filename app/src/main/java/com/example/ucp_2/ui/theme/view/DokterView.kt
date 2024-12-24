package com.example.ucp_2.ui.theme.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DokterView() {
    Column {
        Text("Chat Dokter di Ayo Sehat")
        Button(onClick = { /* Navigate to tambah dokter */ }) { Text("Tambah Dokter") }
        Button(onClick = { /* Navigate to lihat jadwal */ }) { Text("Lihat Jadwal") }
    }
}
