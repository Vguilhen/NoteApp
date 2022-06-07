package com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source.repository

import androidx.room.*
import com.plcoding.cleanarchitecturenoteapp.feature_note.data.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    //Consulta ao banco de dados
    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNot(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}