/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Nazmul
 */
public class RadiologicalTest extends LabTest implements CostCalculation, TestReport{
    
    private String plateDimension;
    
    public RadiologicalTest(){}
    
    public RadiologicalTest(String title,
                    double cost,
                    boolean isAvailable, String plateDimension){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;   
        this.plateDimension = plateDimension;
    }
    
//    void search(String title){
//        if(this.title == title)
//            show();
//        else
//            System.out.println("Not found");
//    }

    /**
     * @return the title
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the cost
     */
    @Override
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return the isAvailable
     */
    @Override
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * @param isAvailable the isAvailable to set
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String returnRLabTestInfo() {
        String output = "Test name: "+this.getTitle()+ "\r\n"
                + "Cost: "+this.getCost()+"\r\n"
                + " Plate Dimension: "+this.plateDimension+"\r\n"
                + "Availability: "+this.isIsAvailable();
        return output;
    }

    @Override
    public double calCost() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deliveryReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String returnLabTestInfo() {
        return this.getTitle()+ "\r\n"
                +this.getCost()+"\r\n"
                +this.plateDimension+"\r\n"
                +this.isIsAvailable();
    }

    @Override
    public String toString() {
        return this.getTitle()+ "\r\n"
                +this.getCost()+"\r\n"
                +this.plateDimension+"\r\n"
                +this.isIsAvailable();
    }
    
    
}
