/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.model.RadiologicalTest;
import java.util.*;

/**
 *
 * @author USER
 */
public class RadiologicalTestController {
    
    static RadiologicalTest RTest;
    public void initTest(String title, double cost, boolean isAvailable, String plateDimension){
        RTest = new RadiologicalTest(title, cost, isAvailable, plateDimension);    
    }
    
    public String returnRTestInfo(){
        //        System.out.println(ResultInfo);
        return RTest.returnLabTestInfo();
    }
    public ArrayList arrayOfObjects(){
        ArrayList<RadiologicalTest> objectList = new ArrayList<>();
        objectList.add(RTest);
        return objectList;
    }
    
    
}
