package com.example.android.miwok;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nevena on 7.5.2017..
 */

public class WordAdapter extends ArrayAdapter<Word> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View customListItem = convertView;
        if (customListItem==null) {
            customListItem= LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word wordToDisplay = getItem(position);

        TextView miwokTextView = (TextView) customListItem.findViewById(R.id.miwok_text_view);
        TextView defaultTextView = (TextView) customListItem.findViewById(R.id.default_text_view);

        miwokTextView.setText(wordToDisplay.getMiwokTranslation());
        defaultTextView.setText(wordToDisplay.getDefaultTranslation());

        return customListItem;
    }

    public WordAdapter (NumbersActivity numbersActivity, ArrayList<Word> words) {
        super(numbersActivity, 0, words);
    }

}
