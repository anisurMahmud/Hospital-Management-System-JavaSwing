/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hms.controller;

import com.hms.model.PathologicalTest;
import com.hms.model.RadiologicalTest;
import com.hms.model.LabTest;
import com.hms.view.Home;
import java.awt.List;
import java.util.*;
/**
 *
 * @author Anis
 */
public class HospitalManagementSoftware {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        new Home().setVisible(true);
        PathologicalTest iTest = new PathologicalTest("CBC", 400, true);
        System.out.println(iTest.returnLabTestInfo());
        
        RadiologicalTest rTest = new RadiologicalTest("x-ray", 400, true ,"2x4");
        System.out.println(rTest.returnRLabTestInfo());
        
        ArrayList<LabTest> test = new ArrayList<>();
        test.add(iTest);
        test.add(rTest);
        System.out.println(test);
//        for(LabTest tests: test){
//            System.out.println(test);
//        }
        
        
    }
}
