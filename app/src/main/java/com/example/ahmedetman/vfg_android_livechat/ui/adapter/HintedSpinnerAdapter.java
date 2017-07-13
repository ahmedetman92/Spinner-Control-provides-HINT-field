package com.example.ahmedetman.vfg_android_livechat.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ahmedetman.vfg_android_livechat.R;

import java.util.List;

/**
 * Created by Ahmed Etman on 7/5/2017.
 */

public class HintedSpinnerAdapter extends ArrayAdapter<String>
{
    String mHint;

    public HintedSpinnerAdapter(Context context, int resource, List<String> chatOptionsList,
                                String hint)
    {
        super(context, resource, chatOptionsList);
        this.mHint = hint;
    }

    @Override
    public int getItemViewType(int position)
    {
        if(position == 0)
        {
            return VIEW_HINT;
        }
        else
        {
            return VIEW_ITEM;
        }
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder ;
        if(convertView == null)
        {
            viewHolder =  new ViewHolder();
           convertView =  LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.spinner_row_item, parent, false);

            viewHolder.spinnerItemTextView =
                    (TextView) convertView.findViewById(R.id.spinner_row_item_textView);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        if(getItemViewType(position) == VIEW_HINT)
        {
            viewHolder.spinnerItemTextView.setText(mHint);
        }
        else
        {
            viewHolder.spinnerItemTextView.setText(getItem(position -1));
        }

        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder ;
        if(convertView == null)
        {
            viewHolder =  new ViewHolder();
            convertView =  LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.spinner_row_item, parent, false);

            viewHolder.spinnerItemTextView =
                    (TextView) convertView.findViewById(R.id.spinner_row_item_textView);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        if(getItemViewType(position) == VIEW_HINT)
        {
            viewHolder.spinnerItemTextView.setText(mHint);
        }
        else
        {
            viewHolder.spinnerItemTextView.setText(getItem(position - 1));
        }

        return convertView;
    }

    @Override
    public int getCount()
    {
        return super.getCount() + 1;
    }

    public static final int VIEW_HINT = 0 ;
    public static final int VIEW_ITEM = 1 ;



    private class ViewHolder
    {
        TextView spinnerItemTextView;
    }
}
