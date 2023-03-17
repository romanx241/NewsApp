package ru.netology.newsapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import ru.netology.newsapp.models.Article

@Dao
interface ArticleDao {

    @Query("SELECT * FROM articles")
        suspend fun getAllArticles(): LiveData<List<Article>>

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insert(article: Article)

        @Delete
        suspend fun delete(article: Article)

}