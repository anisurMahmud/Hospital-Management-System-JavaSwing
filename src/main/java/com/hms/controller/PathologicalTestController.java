/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.model.PathologicalTest;
import java.util.*;

/**
 *
 * @author USER
 */
public class PathologicalTestController {
    
    static PathologicalTest PTest;
    public void initTest(String title, double cost, boolean isAvailable, String reAgent){
        PTest = new PathologicalTest(title, cost, isAvailable, reAgent);    
    }
    
    public String returnPTestInfo(){
        //        System.out.println(ResultInfo);
        return PTest.returnLabTestInfo();
    }
    public ArrayList arrayOfObjects(){
        ArrayList<PathologicalTest> objectList = new ArrayList<>();
        objectList.add(PTest);
        return objectList;
    }
    
    
}
