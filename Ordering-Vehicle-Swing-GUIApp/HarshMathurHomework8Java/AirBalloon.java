import java.util.Scanner;
import java.util.*;
import java.io.*;
/** 
*  Name:       Vanny Chao              <BR>
*  Course:     ISTE-200 2019-Fall      <BR>   
*  Assignment: Homework 05             <BR>             
*  Date:       10/04/19 written        <BR>   
*<BR>
*  Class:      Truck                   <BR>
*  Purpose:    This Car class provides a truck object template 
*              for OrdersFinal <BR> 
*              
*<BR>              
*  @author:    Program assignment provided by Prof. Tanweer Alam
*              Assignment completed by Vanny Chao, with help from TA Khavya
*  @version:   2.0
*  @see:       Car.java
*  @see:       OrdersFinal.java
*  @see:       Boat.java
*  @see:       Vehicle.java
*  @see:       Truck.Java
*  @see:       Vinfo.java
*/

public class AirBalloon extends Vehicle implements Serializable //declare as abstract because not impletmenting abstract method?
{
//   private static final long serialVersionUID = 65123098267757690L;
   private final static String [] ATTRIBUTE_LABELS = {"Envelope Design:", "Basket Size:"};
   private final static String [] ENVELOPE_DESIGN_CHOICES = {"Star Wars","Circus","Cultural"};
   private final static String[]  BASKET_SIZE_CHOICES = {"Two Person","Four Person","Six Person"};
   
   final static String VEHICLE_IS = "Air Balloon";
   // private attributes that contain information about a hot air balloon, 
   // specific to only airBalloon
   private int envelopeDesign;  
   final String [] ENVELOPEDESIGN = {"Star Wars","Circus","Cultural"};
   private int basketSize;
   final String [] BASKETSIZE = {"Two Person","Four Person","Six Person"};
   
   //constructor overloading
//    public AirBalloon(String enteredModel, String enteredColor, double enteredCost, int enteredDesign, int enteredSize)
//        {
//         model = enteredModel;
//         color = enteredColor;
//         cost = enteredCost;
//         envelopeDesign = enteredDesign;
//         basketSize = enteredSize;
//        }
       
   public AirBalloon() {
      this.acceptOrder();
   }
   
   public void acceptOrder() {
      super.setVehIs(VEHICLE_IS);
     //  super.showCommon();
//        super.showMenu("What design is the envelope?", ENVELOPEDESIGN);
//         super.showMenu("What is the basket size?", BASKETSIZE);
   }

   //accessors
   public String getDesign()
      {
 		   return ENVELOPEDESIGN[envelopeDesign];
 	   }
      
      public String getBSize()
      {
 		   return BASKETSIZE[basketSize];
 	   }
      
   //mutators
   public void setDesign(int _design)
     {

         envelopeDesign = _design;
      } 
     
     public void  setBSize(int _BSize)
      {

         basketSize = _BSize;
      }
   
      /**
     *   This method, gasMileage(), calculates gallons per hour
     *   for each AirBalloon object. It accepts no parameters.  
     *   It is an abstract method in Vinfo.java   <BR>
     */
     
    public double gasMileage() {
      double airBalloonMileage = 10;
      return airBalloonMileage;
    
    }
    
   /**
     *   create a toString() method that returns a String of all
     *   Boat information formatted and ready for printing by 
     *   Orders class   <BR>
     */
   public String toString()
      {
          String returnValue = super.toString() + 
                         " \n\t[Envelope design] = " + getDesign() +
                         " \n\t[Basket size] = " + getBSize();
    		 return returnValue;
      } 
      
      public static String [] getAttributeLabels(){
      return ATTRIBUTE_LABELS;
   }
	
   public static String [] getEnvelopeDesignGUI(){
      return ENVELOPE_DESIGN_CHOICES;
   }
   
   public static String [] getBasketSizeGUI(){
      return BASKET_SIZE_CHOICES;
   }
}//end of class AirBalloon
