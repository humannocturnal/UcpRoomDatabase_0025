import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dokter")
data class Dokter(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nama: String,
    val spesialis: String,
    val tempatPraktik: String,
    val kontak: String
)
