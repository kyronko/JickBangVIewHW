package com.example.jickbangviewhw.Data;


import java.io.Serializable;

public class HouseData implements Serializable {
    public String HouseMoneyTxt ;
   public int HouseFloorTxt;
    public String HouseAddressTxt;
    public String HouseOptionTxt;

    public HouseData(String houseMoneyTxt, int houseFloorTxt, String houseAddressTxt, String houseOptionTxt) {
        this.HouseMoneyTxt = houseMoneyTxt;
        this.HouseFloorTxt = houseFloorTxt;
        this.HouseAddressTxt = houseAddressTxt;
        this.HouseOptionTxt = houseOptionTxt;
    }
}
