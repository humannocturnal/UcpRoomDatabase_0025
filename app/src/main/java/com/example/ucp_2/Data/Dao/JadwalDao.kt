import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

interface JadwalDao {
    @Query("SELECT * FROM jadwal")
    fun getAllJadwal(): List<Jadwal>

    @Insert
    fun insertJadwal(jadwal: Jadwal)

    @Delete
    fun deleteJadwal(jadwal: Jadwal)
}