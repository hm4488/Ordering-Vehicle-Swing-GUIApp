/**
*Name: Harsh Mathur
*Course: ISTE-200 Java For Programmers
*Homework: Homework 8 GUI Shell 
*Date: November 5th, 2019
*<BR>
*Class: Boat
*<BR>
*@author Harsh Mathur
*@version 2.0.5_08
*@see Vehicle
*@see Truck
*@see Car 
*@see Jet
*@see AirBalloon
*@see Van
*@see OrdersScreen
*@see Vinfo
**/

import java.util.*;
import java.io.*;

//To create the class named Boat
class Boat extends Vehicle implements Serializable
{
//   private static final long serialVersionUID = 78965098267757690L;
   private final static String [] ATTRIBUTE_LABELS = {"Boat Type:", "Boat Construction:"};
   private final static String [] BOAT_TYPE_CHOICES = {"Pontoon", "PWC", "Sailboat"};
   private final static String[]  BOAT_CONSTRUCTION_CHOICES = {"Wood", "Fiberglass", "Steel"};
   
   
  final static String VEHICLE_IS = "Boat";
  transient  Scanner scan = new Scanner(System.in);

   // Attributes for class Boat
   
      //To describe the type of boat
   final String [] BOAT_TYPE = {"Pontoon", "PWC", "Sailboat"};
   int boatType; 
   
   
   
   //To describe the boat construction
   final String[] BOAT_CONSTRUCTION = {"Wood", "Fiberglass", "Steel"};
   int boatConstruction;
   
   //Default Constructor with variables that are assigned to default values
  public Boat()
   {
      super.setVehIs(VEHICLE_IS);
      
     //this.showMenu();
      
   }
   
   // public Boat(String _BOAT_TYPE, String _BOAT_CONSTRUCTION)
//    {
//    
//    }
   
   
   
     /**
   *It is showMenu method
   */
   public void showMenu()
   {
      System.out.println("Enter Boat order: ");
      super.showCommon();
         super.showMenu("What type of Boat is this?", BOAT_TYPE );
         super.showMenu("What is the boat construction?", BOAT_CONSTRUCTION );
          
   
   }
     
   
      public double gasMileage()
      {
      double gasMileageAmount = 200;
      //Pontoon
       if(getBoatType().equals("Pontoon"))
       {
        gasMileageAmount = PONTOON - 2;
        
        
       }
       //PWC
       else if(getBoatType().equals("PWC"))
       {
        gasMileageAmount = PWC + 4;
        }
        //Sailboat
        else if(getBoatType().equals("Sailboat"))
        {
         gasMileageAmount = SAILBOAT  + 6;
        }
        return gasMileageAmount;
      }
   
   /**
   *It is getBoatType method
   *@return
   */
   //Accessor for type variable
   public String getBoatType( )   { return BOAT_TYPE[boatType]; }
    

   /**
   *It is setBoatType method
   *param _boatType
   */
   //Mutator for type variable
   public void setBoatType( int _boatType ) { boatType = _boatType;}
   
   /**
   *It is getBoatConstruction method
   *@return
   */
   //Accessor for boat construction variable
   public String getBoatConstruction()
   {
      return BOAT_CONSTRUCTION[boatConstruction];
   }
   
   /**
   *It is setBoat method
   *param _boatConstruction
   */
   //Mutator for boat construction variable
   public void setBoatConstruction(int _boatConstruction)
   {
      boatConstruction = _boatConstruction;
   }
    
    /*@Override*/
   public String toString()
   {
      return super.toString()  +  "\n\tType:- " + getBoatType() + "\n\tMade of:- " + getBoatConstruction();
   }
   
   public static String [] getAttributeLabels(){
      return ATTRIBUTE_LABELS;
   }
	
   public static String [] getBoatTypeGUI(){
      return BOAT_TYPE_CHOICES;
   }
   
   public static String [] getBoatConstructionGUI(){
      return BOAT_CONSTRUCTION_CHOICES;
   }
   
    
}