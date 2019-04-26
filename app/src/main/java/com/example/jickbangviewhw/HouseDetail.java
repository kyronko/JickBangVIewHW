package com.example.jickbangviewhw;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jickbangviewhw.Data.HouseData;
import com.example.jickbangviewhw.databinding.ActivityHouseDetailBinding;

public class HouseDetail extends AppCompatActivity {
    HouseData mHouseData;

    ActivityHouseDetailBinding act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_house_detail);

        mHouseData =(HouseData) getIntent().getSerializableExtra("집정보");

        act.HouseMoneyIntent.setText(String.format("월세 : %s",mHouseData.HouseMoneyTxt));
        act.HouseOptionIntent.setText(mHouseData.HouseOptionTxt);

    }
}
