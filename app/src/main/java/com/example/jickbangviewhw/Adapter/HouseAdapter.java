package com.example.jickbangviewhw.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.jickbangviewhw.Data.HouseData;
import com.example.jickbangviewhw.R;

import java.util.List;

public class HouseAdapter extends ArrayAdapter<HouseData> {
    Context mContext;
    List<HouseData> mList;
    LayoutInflater inf;

    public HouseAdapter(Context context, List<HouseData> list) {
        super(context, R.layout.house_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.house_list_item, null);
        }
        HouseData houseData = mList.get(position);
        TextView HouseMoneyTxt = row.findViewById(R.id.HouseMoneyTxt);
        TextView HouseFloorTxt= row.findViewById(R.id.HouseFloorTxt);
        TextView HouseAddressTxt = row.findViewById(R.id.HouseAddressTxt);
        TextView HouseOptionTxt =row.findViewById(R.id.HouseOptionTxt);

        HouseMoneyTxt.setText(houseData.HouseMoneyTxt);
        HouseFloorTxt.setText(String.format("%d 층",houseData.HouseFloorTxt));
        HouseAddressTxt.setText(houseData.HouseAddressTxt);
        HouseOptionTxt.setText(houseData.HouseOptionTxt);


        return row;
    }
}

