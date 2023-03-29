package ru.netology.newsapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.netology.newsapp.models.Article


@Database(entities = [Article::class], version = 1, exportSchema = true)
abstract class ArticleDatabase: RoomDatabase() {
    abstract fun getArticleDao(): ArticleDao

}