package eu.tutorials.mywishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {
    //To add a new wish
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addWish(wish: Wish)

    //Loads all wishes from the wish table
    @Query("Select * from 'wish-table'")
    abstract fun getAllWishes(): Flow<List<Wish>>

    //To edit an already existing wish
    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)

    //To delete an wish
    @Delete
    abstract suspend fun deleteWish(wishEntity: Wish)

    //To display a single wish
    @Query("Select * from 'wish-table' where id=:id")
    abstract fun getAWishById(id:Long): Flow<Wish>
}