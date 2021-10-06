/**
*Name: Harsh Mathur
*Course: ISTE-200 Java For Programmers
*Homework: Homework 8 GUI Shell 
*Date: November 5th, 2019
*<BR>
*Class: Van
*<BR>
*@author Harsh Mathur
*@version 2.0.5_08
*@see Vehicle
*@see Truck
*@see Car 
*@see Boat
*@see Jet
*@see AirBalloon
*@see OrdersScreen
*@see Vinfo
**/


import java.util.*;
import java.io.*;
//To create the class named Van
class Van extends Vehicle implements Serializable
{
//   private static final long serialVersionUID = 2349685098267757690L;
   private final static String [] ATTRIBUTE_LABELS = {"Van Size:", "Gas Capacity:"};
   private final static String [] VAN_SIZE_CHOICES = {"Mini-Van", "Small Van", "Moderate Van", "RV Van"};
   private final static String[]  VAN_GAS_CAPACITY_CHOICES = {"100 Gallons", "200 Gallons", "300 Gallons", "400 Gallons", "500 Gallons"};
   
   final static String VEHICLE_IS = "Van";
   // Scanner class must be made as transient if this class is Serializable
   transient Scanner scan = new Scanner(System.in);

   // Attributes for class Van
    
   //To describe the size of van
   final String[] VAN_SIZE = {"Mini-Van", "Small Van", "Moderate Van", "RV Van"};
   int vanSize;
   //To describe the capacity of van's gas
   final String[]  VAN_GAS_CAPACITY = {"100 Gallons", "200 Gallons", "300 Gallons", "400 Gallons", "500 Gallons"};
   int vanGasCapacity;
   
   public double gasMileage()
   {
      double gM = 0;
      if(getVanSize().equals("Mini-Van"))
      {
         gM = MINI_VAN;
      }
      else if(getVanSize().equals("Small Van"))
      {
         gM = SMALL_VAN;
      }
      else if(getVanSize().equals("Moderate Van"))
      {
         gM = MODERATE_VAN;
      }
      else if(getVanSize().equals("RV Van"))
      {
         gM = RV_VAN;
      }
      return gM;
   }
   
   //Default Constructor with variables that are assigned to default values
   public Van()
   {
      super.setVehIs(VEHICLE_IS);
     // this.showMenu();
   }
   
   /**
   *It is showMenu method
   */
   public void showMenu()
   {
      System.out.println("Enter Van order: ");
      
      super.showCommon();
            
     
      super.showMenu("What size van is this? ", VAN_SIZE);
    
      
      
      
      
     
      super.showMenu("What is the gas capacity?", VAN_GAS_CAPACITY);
     
      
      
   }
  
  /**
   *It is getVanSize method
   *@return
   */
   //Constructor with variables
     //Accessor for van size variable
   public String getVanSize() { 
      return VAN_SIZE[vanSize]; }
    
   
   /**
   *It is setVanSize method
   *@param _vanSize
   */
   //Mutator for van size variable
   public void setVanSize(int _vanSize)
   {
      vanSize = _vanSize;
   }
   
   /**
   *It is getGasCapacity method
   *@return
   */
   //Accessor for gas capacity variable
   public String getVanGasCapacity() {
      return VAN_GAS_CAPACITY[vanGasCapacity]; }
   
   /**
   *It is setVanGasCapacity method
   *@return
   */
   //Mutator for gas capacity variable
   public void setVanGasCapacity(int _vanGasCapacity)
   {
      vanGasCapacity = _vanGasCapacity;
   }
   
   /*@Override*/
   public String toString()
   {
      return super.toString() + "\n\tVan Size:- " + getVanSize() + "\n\tGas Capacity:- " + getVanGasCapacity();
   }
   
   public static String [] getAttributeLabels(){
      return ATTRIBUTE_LABELS;
   }
	
   public static String [] getVanSizeGUI(){
      return VAN_SIZE_CHOICES;
   }
   
   public static String [] getVanGasCapacityGUI(){
      return VAN_GAS_CAPACITY_CHOICES;
   }
    
}