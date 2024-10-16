/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author USER
 */
public abstract class LabTest {
    protected long id;
    protected String title;
    protected double cost;
    protected boolean isAvailable;
    
    public LabTest(){}
    public LabTest(String title, double cost, boolean isAvailable){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;   
    }

    public LabTest(long id, String title, double cost, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "LabTest{" + "id=" + id + ", title=" + title + ", cost=" + cost + ", isAvailable=" + isAvailable + '}';
    }
    
    
    public abstract String returnLabTestInfo();
    public abstract String getTitle();
    public abstract double getCost();
    public abstract boolean isIsAvailable();
//    {
//        String output = "Test name: "+this.title+ "\r\n"
//                + "Cost: "+this.cost+"\r\n"
//                + "Availability: "+this.isAvailable;
//        return output;
//    }
}
    
