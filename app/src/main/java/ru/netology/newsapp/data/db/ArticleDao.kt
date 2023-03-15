package ru.netology.newsapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.netology.newsapp.models.Article

interface ArticleDao {

    @Query("SELECT * FROM articles")
        suspend fun getAllArticles(): LiveData<List<Article>>

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insert(article: Article)

        @Delete
        suspend fun delete(article: Article)

}