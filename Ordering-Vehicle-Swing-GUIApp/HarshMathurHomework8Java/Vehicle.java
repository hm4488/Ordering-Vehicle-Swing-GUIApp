/**
*Name: Harsh Mathur
*Course: ISTE-200 Java For Programmers
*Homework: Homework 8 GUI Shell 
*Date: November 5th, 2019
*<BR>
*Class: Vehicle
*<BR>
*@author Harsh Mathur
*@version 2.0.5_08
*@see Truck
*@see Car 
*@see Boat
*@see Jet
*@see AirBalloon
*@see Van
*@see OrdersScreen
*@see Vinfo
**/

import java.util.*;
import java.io.*;

public abstract class Vehicle implements Serializable, Vinfo
{ 
//   private static final long serialVersionUID = 1235098267757690L;
   // Scanner class must be made as transient if this class is Serializable
   transient Scanner scan = new Scanner(System.in);
   //To describe the model of Vehicle
   private String model;
   
   //To describe the color of Vehicle
   private String color;
   
   //To describe the cost of Vehicle
   private double cost;
   
   //vehIs is new variable name for the type of vehicle
   private String vehIs;
   
   /**
   *It is getVehIs method
   *@return
   */
   
  public String getVehIs()
  {
   return vehIs;
  }
  
  /**
   *It is setVehIs method
   *@param _vehIs
   */
  public void setVehIs(String _vehIs)
  {
  vehIs = _vehIs;
  }
   
   /**
   *It is getModel method
   *@return
   */
   public String getModel()
   {
    return model;
   }
   
   /**
   *It is setModel method
   *@param _model
   */
   public void setModel(String _model)
   {
    model = _model;
   }
   
   /**
   *It is getColor method
   *@return
   */
   public String getColor()
   {
    return color;
   }
   
   /**
   *It is setColor method
   *@param _color
   */
   public void setColor(String _color)
   {
    color = _color;
   }
   
   /**
   *It is getCost method
   *@return
   */
   public double getCost()
   {
    return cost;
   }
   
   /**
   *It is setCost method
   *@param _cost
   */
   public void setCost(double _cost)
   {
    cost = _cost;
   }
   
   public abstract double gasMileage();
   
   
  //  public Vehicle(String model, String color, double cost)
//    {
//     this.model = model;
//     this.color = color;
//     this.cost = cost;
//    }
   /**
   *It is showCommon method
   *@return
   */
   public void showCommon()
   {
      System.out.print("Model: ");
      model = scan.nextLine();
     
      
      System.out.print("Color: ");
      color = scan.nextLine();
      
   
      do
      {
       System.out.print("Cost: ");
       if(scan.hasNextDouble())
       {
        cost = scan.nextDouble();
        
        break;
       }
       else
       {
        System.out.println("Error. Double Inputs only");
        scan.nextLine();
       }
      }while(true);
      scan.nextLine();
     }
   
   /**
   *It is showMenu method
   *param prompt
   *param choices
   *@return
   */
    public void showMenu (String prompt, String[] choices)
   {
      int input = 0;
       System.out.println(prompt);
     
       do
       {     
      for(int i=0; i< choices.length; i++)
         {
          System.out.println("\t"+(i+1)+". "+ choices[i] );
         }
       System.out.print("\tChoice: ");
       try
       {
       input = scan.nextInt();
       
       }
       catch(NumberFormatException e)
       {
        System.out.println("Please type numeric values");
        
       }
       catch(Exception e)
       {
        System.out.println("Try again");
       }
       scan.nextLine();
      
        if(input > choices.length || input <= 0)
        {
        System.out.println("Invalid input. Try again");
        }
        
       }while(input > choices.length || input <= 0);
     }
     
     /*@Override*/
     public String toString()
     {
       return getVehIs() + "\n\tModel:- " + getModel() + "\n\tColor:- " + getColor() + "\n\tCost:- $" + getCost() + "\n\tMPG/GPH:- $" + gasMileage();
     }

}