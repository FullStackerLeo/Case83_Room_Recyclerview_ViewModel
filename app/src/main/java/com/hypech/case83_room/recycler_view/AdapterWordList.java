package com.hypech.case83_room.recycler_view;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.hypech.case83_room.entity.Word;

public class AdapterWordList extends ListAdapter<Word, ViewHolderWord> {

    public AdapterWordList(@NonNull DiffUtil.ItemCallback<Word> diffCallback) {
        super(diffCallback);
    }

    @Override
    public ViewHolderWord onCreateViewHolder(ViewGroup parent, int viewType) {
        return ViewHolderWord.create(parent);
    }

    @Override
    public void onBindViewHolder(ViewHolderWord holder, int position) {
        Word current = getItem(position);
        holder.bind(current.getWord());
    }

    public static class WordDiff extends DiffUtil.ItemCallback<Word> {

        @Override
        public boolean areItemsTheSame(@NonNull Word oldItem, @NonNull Word newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Word oldItem, @NonNull Word newItem) {
            return oldItem.getWord().equals(newItem.getWord());
        }
    }
}
