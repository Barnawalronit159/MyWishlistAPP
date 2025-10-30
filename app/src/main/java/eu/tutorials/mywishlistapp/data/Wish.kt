package eu.tutorials.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long= 0L,
    @ColumnInfo(name = "wish-title")
    val title:String = "",
    @ColumnInfo(name = "wish-desc")
    val description:String = ""
)

object dummyWish{
    val WishList = listOf(
        Wish(1, "Pixel Watch 2", "An Android smartwatch by Google."),
        Wish(2, "Oculus Quest 3", "Next-gen VR headset by Meta."),
        Wish(3, "MacBook Air M2", "Lightweight laptop with Apple Silicon."),
        Wish(4, "iPhone 15 Pro", "Latest flagship phone from Apple."),
        Wish(5, "Sony WH-1000XM5", "High-end noise-cancelling headphones.")
    )
}

