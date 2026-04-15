import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Vehicle::class, ServiceRecord::class, FuelExpense::class, SparePart::class], version = 1)
abstract class LocalDatabase : RoomDatabase() {
    // Define DAOs here
}
