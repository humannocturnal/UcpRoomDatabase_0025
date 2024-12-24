import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

@Composable
fun DokterCard(dokter: Dokter) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Nama: ${dokter.nama}", style = MaterialTheme.typography.h6)
            Text("Spesialis: ${dokter.spesialis}", style = MaterialTheme.typography.body2)
            Text("Lokasi: ${dokter.lokasi}", style = MaterialTheme.typography.body2)
        }
    }
}
