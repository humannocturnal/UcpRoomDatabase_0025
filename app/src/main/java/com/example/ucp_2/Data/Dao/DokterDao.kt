import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

interface DokterDao {
    @Query("SELECT * FROM dokter")
    fun getAllDokter(): List<Dokter>

    @Insert
    fun insertDokter(dokter: Dokter)

    @Delete
    fun deleteDokter(dokter: Dokter)
}
