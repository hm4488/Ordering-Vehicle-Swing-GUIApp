/**
*Name: Harsh Mathur
*Course: ISTE-200 Java For Programmers
*Homework: Homework 8 GUI Shell 
*Date: November 5th, 2019
*<BR>
*Class: Truck
*<BR>
*@author Harsh Mathur
*@version 2.0.5_08
*@see Vehicle
*@see Car 
*@see Boat
*@see Jet
*@see AirBalloon
*@see Van
*@see OrdersScreen
*@see Vinfo
**/

//To use the class Scanner
//import java.util.Scanner;

//To use the class ArrayList
//import java.util.ArrayList;

import java.util.*;
import java.io.*;

//To create the class named Truck
class Truck extends Vehicle implements Serializable 
{
//   private static final long serialVersionUID = 3459685098267757690L;
   private final static String [] ATTRIBUTE_LABELS = {"Truck size:", "Engine size:"};
   private final static String [] TRUCK_SIZE_CHOICES = {"Half-ton", "Full ton"};
   private final static String[] TRUCK_ENGINE_SIZE_CHOICES = {"Really big", "Not so big"};

   final static String VEHICLE_IS = "Truck";
   //final Scanner scan = new Scanner(System.in);

   // Attributes for class Truck
    
   //To describe the size of truck
   final String[] SIZE = {"Half-Ton", "Full-Ton"};
   int size;
   //To describe the size of truck's engine
   final String[] ENGINE_SIZE = {"Really big", "Not so big"};
   int engineSize;
   
   public double gasMileage()
   {
      double gM = 50;
      return gM;
   }
   
   //Default Constructor with variables that are assigned to default values
   public Truck()
   {
      super.setVehIs(VEHICLE_IS);
     // this.showMenu();
   }
   
   /**
   *It is showMenu method
   */
   public void showMenu()
   {
      System.out.println("Enter Truck order: ");
      
      super.showCommon();
            
     
      super.showMenu("What size truck is this? ", SIZE);
    
      
      
      
      
     
      super.showMenu("What is the engine size of the truck?", ENGINE_SIZE);
     
      
      
   }
  
  /**
   *It is getSize method
   *@return
   */
   //Constructor with variables
     //Accessor for size variable
   public String getSize() { 
      return SIZE[size]; }
    
   
   /**
   *It is setSize method
   *@param _size
   */
   //Mutator for size variable
   public void setSize(int _size)
   {
      size = _size;
   }
   
   /**
   *It is getEngineSize method
   *@return
   */
   //Accessor for Engine Size variable
   public String getEngineSize() {
      return ENGINE_SIZE[engineSize]; }
   
   /**
   *It is setEngineSize method
   *@param _engineSize
   */
   //Mutator for Engine Size variable
   public void setEngineSize(int _engineSize)
   {
      engineSize = _engineSize;
   }
   
   /*@Override*/
   public String toString()
   {
      return String.format(super.toString() + "\n\tSize:- " + getSize() + "\n\tEngine Size:- " + getEngineSize());
   }
   
   
   public static String [] getAttributeLabels(){
      return ATTRIBUTE_LABELS;
   }
	
   public static String [] getTruckSizeGUI(){
      return TRUCK_SIZE_CHOICES;
   }
   
   public static String [] getEngineSizeGUI(){
      return TRUCK_ENGINE_SIZE_CHOICES;
   }
}