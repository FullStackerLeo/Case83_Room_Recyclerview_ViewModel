package com.hypech.case83_room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.hypech.case83_room.entity.Word;

import java.util.List;

@Dao
public interface DaoWord {

    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);

    @Query("DELETE FROM Word")
    void deleteAll();

    @Query("SELECT * FROM Word ORDER BY word ASC")
    LiveData<List<Word>> getAlphabetizedWords();
}