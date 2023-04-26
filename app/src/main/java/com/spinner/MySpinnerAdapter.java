package com.spinner;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

class MySpinnerAdapter extends BaseAdapter {
    private Context context;
    private List<String> myList;
    LayoutInflater inflter;

    public MySpinnerAdapter(Context context, List<String> myList) {
        this.context = context;
        this.myList = myList;
        this.inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        convertView = inflter.inflate(R.layout.row_livenspinner, null);
        TextView tv = (TextView) convertView.findViewById(R.id.tvSpinnerItem);

        tv.setText(myList.get(position));

        return convertView;
    }
}