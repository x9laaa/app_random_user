package cl.bootcamp.apprandomuser.dataSource

import androidx.room.Database
import androidx.room.RoomDatabase
import cl.bootcamp.apprandomuser.modal.User
import cl.bootcamp.apprandomuser.modal.UserDao


@Database(entities = [User::class], version = 1)
abstract class DbDataSource: RoomDatabase() {
    abstract fun userDao(): UserDao
}