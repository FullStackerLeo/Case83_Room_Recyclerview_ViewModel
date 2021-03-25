package com.hypech.case83_room;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.hypech.case83_room.entity.Word;

import java.util.List;

public class L_ViewModel extends AndroidViewModel {

    private RepositoryWord mRepository;
    private final LiveData<List<Word>> mAllWords;

    public L_ViewModel(Application application) {
        super(application);
        mRepository = new RepositoryWord(application);
        mAllWords = mRepository.getAllWords();
    }

    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insert(Word word) {
        mRepository.insert(word);
    }
}