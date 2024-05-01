package edu.icet.demo.Service;

import java.util.HashMap;

public class CityService {

    public String getCityByPostalCode(String postalCode){
        HashMap<String,String> cityList = new HashMap();
        cityList.put("80000","Galle");
        cityList.put("10400","Colombo");
        cityList.put("50000","Matara");

        return cityList.get(postalCode);
    }
}
