/**
*Name: Harsh Mathur
*Course: ISTE-200 Java For Programmers
*Homework: Homework 8 GUI Shell 
*Date: November 5th, 2019
*<BR>
*Class: Jet
*<BR>
*@author Harsh Mathur
*@version 2.0.5_08
*@see Vehicle
*@see Truck
*@see Car 
*@see Boat
*@see Van
*@see AirBalloon
*@see OrdersScreen
*@see Vinfo
**/

//To use the class Scanner
//import java.util.Scanner;

//To use the class ArrayList
//import java.util.ArrayList;

/**
*Date: October 8, 2019
*@author: Harsh Mathur
*@version: 2.0.5_08
*  Purpose:    This Car class provides a jet object template 
*              for Orders
**/

import java.util.*;
import java.io.*;

//To create the class named Jet
class Jet extends Vehicle implements Serializable
{
//   private static final long serialVersionUID = 5675098267757690L;
   private final static String [] ATTRIBUTE_LABELS = {"Jet Size:", "Engine Power:"};
   private final static String [] JET_SIZE_CHOICES = {"Compact Light Jet", "Small Cabin", "Super Light Jet"};
   private final static String[]  ENGINE_POWER_CHOICES = {"1000 mph", "2000 mph", "3000 mph", "4000 mph", "5000 mph", "10000 mph"};

final static String VEHICLE_IS = "Jet";
   // Attributes for class Jet
    
   //To describe the size of jet
   final String[] JET_SIZE = {"Compact Light Jet", "Small Cabin", "Super Light Jet"};
   int jetSize;
   //To describe the size of jet's engine power
   final String[] ENGINE_POWER = {"1000 mph", "2000 mph", "3000 mph", "4000 mph", "5000 mph", "10000 mph"};
   int enginePower;
   
   public double gasMileage()
   {
     double gM = 0;
     if(getJetSize().equals("Compact Light Jet"))
     {
      gM = COMPACT_LIGHT_JET + 10;
     }
     else if(getJetSize().equals("Small Cabin"))
     {
      gM = SMALL_CABIN + 200;
      }
      else if(getJetSize().equals("Super Light Jet"))
      {
       gM = SUPER_LIGHT_JET + 1000;
      }
      
      return gM;
   }
   
   //Default Constructor with variables that are assigned to default values
   public Jet()
   {
   super.setVehIs(VEHICLE_IS);
      //this.showMenu();
   }
   
   /**
   *It is showMenu method
   */
   public void showMenu()
   {
      System.out.println("Enter Jet order: ");
      
      super.showCommon();
            
     
      super.showMenu("What size jet is this? ", JET_SIZE);
    
      
      
      
      
     
      super.showMenu("What is the engine power of the jet?", ENGINE_POWER);
     
      
      
  }
  
  
  /**
   *It is getJetSize method
   *@return
   */
   //Constructor with variables
     //Accessor for size variable
   public String getJetSize() { return JET_SIZE[jetSize]; }
    
   
   /**
   *It is setJetSize method
   *@param _jetSize
   */
   //Mutator for size variable
   public void setJetSize(int _jetSize)
   {
      jetSize = _jetSize;
   }
   
   /**
   *It is getEnginePower method
   *@return
   */
   //Accessor for Engine Size variable
   public String getEnginePower() {return ENGINE_POWER[enginePower]; }
   
   /**
   *It is setEngine method
   *@param _enginePower
   */
   //Mutator for Engine Size variable
   public void setEnginePower(int _enginePower)
   {
      enginePower = _enginePower;
   }
   
   /*@Override*/
   public String toString()
   {
      return super.toString() + "\n\tJet Size:- " + getJetSize() + "\n\tEngine Power:- " + getEnginePower();
   }
   
   public static String [] getAttributeLabels(){
      return ATTRIBUTE_LABELS;
   }
	
   public static String [] getJetSizeGUI(){
      return JET_SIZE_CHOICES;
   }
   
   public static String [] getEnginePowerGUI(){
      return ENGINE_POWER_CHOICES;
   }
    
}