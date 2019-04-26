package com.example.jickbangviewhw;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.jickbangviewhw.Adapter.HouseAdapter;
import com.example.jickbangviewhw.Data.HouseData;
import com.example.jickbangviewhw.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding act;
    List<HouseData> HouseList = new ArrayList<>();
    HouseAdapter mHouseAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);
        fullhouse();
        mHouseAdapter = new HouseAdapter(MainActivity.this,HouseList);
        act.HouseList.setAdapter(mHouseAdapter);

        act.HouseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HouseData clickedHouseData =HouseList.get(position);
                Intent intent = new Intent(MainActivity.this,HouseDetail.class);
                intent.putExtra("집정보",clickedHouseData);
                startActivity(intent);

            }
        });

    }
    void fullhouse(){
        HouseList.add(new HouseData("100/13",2,"경상북도 구미시 송정동","번개시장"));
        HouseList.add(new HouseData("100/15",3,"경상북도 구미시 신평동","신평1동사무소부근"));
        HouseList.add(new HouseData("100/13",2,"경상북도 구미시 송정동","구미역뒤_모든"));
        HouseList.add(new HouseData("100/13",2,"경상북도 구미시 송정동","먹자골목근처"));
        HouseList.add(new HouseData("100/13",2,"경상북도 구미시 송정동","새출발을 응원합니다"));



    }

}
