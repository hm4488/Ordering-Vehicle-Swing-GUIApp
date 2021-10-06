//To use the class Scanner
//import java.util.Scanner;

//To use the class ArrayList
//import java.util.ArrayList;

/**
*Name: Harsh Mathur
*Course: ISTE-200 Java For Programmers
*Homework: Homework 8 GUI Shell 
*Date: November 5th, 2019
*<BR>
*Class: Car
*<BR>
*@author Harsh Mathur
*@version 2.0.5_08
*@see Vehicle
*@see Truck 
*@see Boat
*@see Jet
*@see Van
*@see AirBalloon
*@see OrdersScreen
*@see Vinfo
**/

import java.util.*;
import java.io.*;

//To create the class named Car
class Car extends Vehicle implements Serializable
{
//   private static final long serialVersionUID = 678685098267757690L;  
   private final static String [] CARTYPE_CHOICES = {"Sedan","Coupe","Wagon"}; 
   private final static String [] TOWING_CHOICES = {"Included", "Not Included"};
   private final static String [] ATTRIBUTE_LABELS = {"Car type:", "Towing:"};
   final static String VEHICLE_IS = "Car";
   transient Scanner scan = new Scanner(System.in);

   // Attributes for class Car
   
   
   public static String [] getAttributeLabels(){
		return ATTRIBUTE_LABELS;
	}
	
 
   public static String [] getCarTypesGUI()
   {
      return CARTYPE_CHOICES;
   }
   
   public static String [] getTowingGUI()
   {
      return TOWING_CHOICES;
   }
   
     
     //To describe the type of car
   final String [] CARTYPE = {"Sedan","Coupe","Wagon"};
   int carType; 
   
   
   
   //To describe the towingPackage of car
   final  String[] TOWINGPACKAGE = {"Included", "Not Included"};
   int towingPackage;
   
   
   public double gasMileage()
   {
      double gM = 0;
      if(getCarType().equals("Sedan"))
      {
         gM = SEDAN;
         if(getTowingPackage().equals("Included"))
         {
            gM = SEDAN - 3;
         }
      }
      else if(getCarType().equals("Coupe"))
      {
         gM = COUPE;
         if(getTowingPackage().equals("Included"))
         {
            gM = COUPE - 5;
         }
      }
      else if(getCarType().equals("Wagon"))
      {
         gM = WAGON;
         if(getTowingPackage().equals("Included"))
         {
            gM = WAGON - 7;
         }
      }
    return gM;
   }
   
   //Default Constructor with variables that are assigned to default values
   public Car()
   {
      
      super.setVehIs(VEHICLE_IS);
      //this.showMenu();
   }
   
  /**
   *It is showMenu method
   */
   public void showMenu()
   {
      System.out.println("Enter Car order: ");
    
      super.showCommon();
      
      
      super.showMenu("What type of Car is this?", CARTYPE );
      
         
               
      
      super.showMenu("Does this car have a towing package?", TOWINGPACKAGE );
         
   }
  
      
      
   /**
   *It is getCarType method
   *@return
   */
   //Accessor for type variable
   public String getCarType( )   { 
      return CARTYPE[carType]; }
    

   /**
   *It is setCarType method
   @param _carType
   */
   //Mutator for type variable
   public void setCarType( int _carType )     
   { 
      carType = _carType;    
   }
   
   /**
   *It is getCarTypes method
   *@return
   */
   public String[] getCarTypes(){
      return CARTYPE;
   }
   
   /**
   *It is getTowingPackage method
   *@return
   */
   //Accessor for towing package variable
   public String getTowingPackage()
   {
      return TOWINGPACKAGE[towingPackage];
   }
   
   /**
   *It is setTowingPackage method
   *@param _towingPackage
   */
   //Mutator for towing package variable
   public void setTowingPackage(int _towingPackage)
   {
      towingPackage = _towingPackage;
   }
    
    /*@Override*/
   public String toString()
   {
      return super.toString() + "\n\tType:- " + getCarType() + "\n\tTowing:- " + getTowingPackage();
   }
   
 //   public void printCar()
//    {
//    System.out.println("\nCar");
//    System.out.println(this.toString());
//    }
    
}