package com.example.ucp_2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun DokterGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "dokterHome") {
        composable("dokterHome") { DokterView() }
        composable("detailDokter/{dokterId}") { backStackEntry ->
            val dokterId = backStackEntry.arguments?.getString("dokterId")?.toInt()
            DetailDokterView(dokterId)
        }
    }
}

@Composable
fun DetailDokterView(dokterId: Int?) {
    TODO("Not yet implemented")
}

@Composable
fun DokterView() {
    TODO("Not yet implemented")
}
