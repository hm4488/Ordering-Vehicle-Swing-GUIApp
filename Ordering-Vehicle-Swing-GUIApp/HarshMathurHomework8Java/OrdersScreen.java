/**
*Name: Harsh Mathur
*Course: ISTE-200 Java For Programmers
*Homework: Homework 8 GUI Shell 
*Date: November 5th, 2019
*<BR>
*Class: OrdersScreen
*Purpose: This program focus on GUI events based on the requirements from Homework 8 to understand the concepts of GUI interactions and its associations with events.
*<BR>
*@author Harsh Mathur
*@version 2.0.5_08
*@see Vehicle
*@see Truck 
*@see Car
*@see Boat
*@see Jet
*@see Van
*@see AirBalloon
*@see Vinfo
**/


//To get resources from java
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


//Class named OrdersScreen that extends JFrame and implements ActionListener, Item Listener Classes
public class OrdersScreen extends JFrame implements ActionListener, ItemListener
{
   //Global Variables
   
   //Index Position Variable
   int indexPosition = 0;
   
   //ArrayList of Vehicles
   ArrayList<Vehicle> carTruckList;
   
   //Array of vehicles types that displays in JComboBox -  VehicleTypeComboBox 
   String[] VEHICLE_LIST = {"Select Vehicle .. ", "Car", "Truck", "Boat", "Jet", "Air Balloon", "Van"};
     
    //File
   File pathNameForDatFile =  new File("VehicleOrders.dat");
   
       //Panels
   JPanel rightPanel;
   JPanel bottomPanel;
   JPanel centralPanel;
   JPanel southPanel;
       //Menu Bar
   JMenuBar menuBar;
       
       //Menus
   JMenu fileMenu;
   JMenu helpMenu;
       
       //Menu Items
   JMenuItem loadMenuItem;
   JMenuItem exitMenuItem;
   JMenuItem aboutMenuItem;
       
       //Labels
   JLabel nameLabel;
   JLabel vehicleTypeLabel;
   JLabel modelLabel;
   JLabel colorLabel;
   JLabel costLabel;
   JLabel basedTypeLabel1;
   JLabel basedTypeLabel2;
       
       //Combo Boxes
   JComboBox vehicleTypeComboBox;
   JComboBox basedTypeComboBox1;
   JComboBox basedTypeComboBox2;
       
       //Text Fields
   JTextField modelTextField;
   JTextField colorTextField;
   JTextField costTextField;
       
       //Buttons
   JButton saveButton;
   JButton firstButton;
   JButton previousButton;
   JButton nextButton;
   JButton lastButton;
   JButton exitButton;
       
       //Font
   Font font;
       
 //Main      
   public static void main(String[] args)
   {
      new OrdersScreen();
   }
 
 //Constructor
   public OrdersScreen()
   {
      carTruckList = new ArrayList<Vehicle>();
   //Set the title "Harsh Ordering System"
      this.setTitle("Harsh Ordering System");
   
   //Set the size with width of 600 and height of 300
      this.setSize(600, 300);
   
   //Set the layout to BorderLayout
      this.setLayout(new BorderLayout(5, 5));
   
      //
      String headerText = "Harsh Ordering System";
      JLabel nameLabel = new JLabel(headerText, SwingConstants.CENTER);
      font = new Font("", Font.BOLD,25);
      nameLabel.setFont(font);
      nameLabel.setForeground(Color.red);
      
      this.add(nameLabel, BorderLayout.NORTH);
   
      //Menu
   
      //Menu Bar
      menuBar = new JMenuBar();
      
      
      //Orders of menu
      fileMenu = new JMenu("File");
      helpMenu = new JMenu("Help");
     
      //Drop down menu options
      loadMenuItem = new JMenuItem("Load");
      loadMenuItem.addActionListener(this);
      exitMenuItem = new JMenuItem("Exit");
      exitMenuItem.addActionListener(this);
      aboutMenuItem = new JMenuItem("About");
      aboutMenuItem.addActionListener(this);
      //Labels
      vehicleTypeLabel = new JLabel("Vehicle Type: ", SwingConstants.LEFT);
      modelLabel = new JLabel("Model: ", SwingConstants.LEFT);
      colorLabel = new JLabel("Color: ", SwingConstants.LEFT);
      costLabel = new JLabel("Cost: ", SwingConstants.LEFT);
      basedTypeLabel1 = new JLabel("", SwingConstants.LEFT);
      basedTypeLabel2 = new JLabel("", SwingConstants.LEFT);
      //Buttons
      saveButton = new JButton("SAVE");
      saveButton.addActionListener(this);
      firstButton = new JButton("FIRST");
      firstButton.addActionListener(this);
      previousButton = new JButton("PREV");
      previousButton.addActionListener(this);
      nextButton = new JButton("NEXT");
      nextButton.addActionListener(this);
      lastButton = new JButton("LAST");
      lastButton.addActionListener(this);
      exitButton = new JButton("Exit");
      exitButton.addActionListener(this);
      
      //TextFields
      modelTextField = new JTextField("");
      colorTextField = new JTextField("");
      costTextField = new JTextField("");
      
      //ComboBoxes
      vehicleTypeComboBox = new JComboBox(VEHICLE_LIST);
      basedTypeComboBox1 = new JComboBox();
      basedTypeComboBox2 = new JComboBox();
      
      this.setJMenuBar(menuBar);
      menuBar.add(fileMenu);
      menuBar.add(helpMenu);
      fileMenu.add(loadMenuItem);
      fileMenu.add(exitMenuItem);
      helpMenu.add(aboutMenuItem);
      
      centralPanel = new JPanel();
      centralPanel.setLayout(new BorderLayout());
      bottomPanel = new JPanel();
      //bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
      bottomPanel.add(saveButton);
      bottomPanel.add(firstButton);
      bottomPanel.add(previousButton);
      bottomPanel.add(nextButton);
      bottomPanel.add(lastButton);
      bottomPanel.add(exitButton);
      
      rightPanel = new JPanel();
      rightPanel.setLayout(new GridLayout(7,0));
      rightPanel.add(vehicleTypeLabel);
      rightPanel.add(vehicleTypeComboBox);
      rightPanel.add(modelLabel);
      rightPanel.add(modelTextField);
      rightPanel.add(colorLabel);
      rightPanel.add(colorTextField);
      rightPanel.add(costLabel);
      rightPanel.add(costTextField);
      rightPanel.add(basedTypeLabel1);
      rightPanel.add(basedTypeComboBox1);
      rightPanel.add(basedTypeLabel2);
      rightPanel.add(basedTypeComboBox2);
      
   
      centralPanel.add(rightPanel, BorderLayout.EAST);
       
      centralPanel.add(bottomPanel, BorderLayout.SOUTH);
       
      add(centralPanel);
      vehicleTypeComboBox.addItemListener(this);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
   }
 
  
  //Action Performed Method
   public void actionPerformed(ActionEvent eve)
   {
      if(eve.getSource() == exitMenuItem)
      {
         write();
         System.exit(0);
      }
      else if(eve.getSource() == exitButton)
      {
         write();
         System.exit(0);
      }
      else if(eve.getSource() == aboutMenuItem)
      {
         JFrame frame = new JFrame("JOptionPane showMessageDialog example");
      
      // show a joptionpane dialog using showMessageDialog
         JOptionPane.showMessageDialog(frame,
            "Harsh Mathur - GUI Shell");
      }
      else if(eve.getSource() == loadMenuItem)
      {
         load();
      }
      else if(eve.getSource() == saveButton)
      {
         save();
      }
      else if(eve.getSource() == firstButton)
      {
         first();
      }
      else if(eve.getSource() == lastButton)
      {
         last();
      }
      else if(eve.getSource() == nextButton)
      {
         next();
      }
      else if(eve.getSource() == previousButton)
      {
         previous();
      }
    
   }

  
   public void itemStateChanged(ItemEvent ie){
      String[] attributeLabels;
      String[] choices1;
      String[] choices2;
      //Note that itemStateChanged event is raised 2 times when a value is selected.
      //First time when the current value is UNSELECTED
      //Second time when the a new value is SELECTED.
      //Since we are concerned with only new value, below 3 line is used to ignore the event
      //when it is raised for UNSELECTED EVENT.
      
      int state = ie.getStateChange();
      if ( state != ItemEvent.SELECTED )
         return;
   	
      String item = (String)ie.getItem();
   	
      
      if( item.equals("Car")){
      	
      
         attributeLabels = Car.getAttributeLabels();
      	
         basedTypeLabel1.setText(attributeLabels[0]);
         
         choices1 = Car.getCarTypesGUI();
         
         basedTypeComboBox1.removeAllItems();
         for(String s : choices1)
         {
            basedTypeComboBox1.addItem(s);
            
            
         }
         
         basedTypeLabel2.setText(attributeLabels[1]);
         choices2 = Car.getTowingGUI();
         
         basedTypeComboBox2.removeAllItems();
         for(String s : choices2)
         {
            basedTypeComboBox2.addItem(s);
            
            
         }
      
      } 
      else if( item.equals( "Truck" ) )
      {
         
         attributeLabels = Truck.getAttributeLabels();
         basedTypeLabel1.setText(attributeLabels[0]);
         
         choices1 = Truck.getTruckSizeGUI();
         
         basedTypeComboBox1.removeAllItems();
         for(String s : choices1)
         {
            basedTypeComboBox1.addItem(s);
            
            
         }
         
         basedTypeLabel2.setText(attributeLabels[1]);
         choices2 = Truck.getEngineSizeGUI();
         
         basedTypeComboBox2.removeAllItems();
         for(String s : choices2)
         {
            basedTypeComboBox2.addItem(s);
            
            
         }
      	
        
      }
      else if( item.equals( "Boat" ) )
      {
         
         attributeLabels = Boat.getAttributeLabels();
         basedTypeLabel1.setText(attributeLabels[0]);
         
         choices1 = Boat.getBoatTypeGUI();
         
         basedTypeComboBox1.removeAllItems();
         for(String s : choices1)
         {
            basedTypeComboBox1.addItem(s);
            
            
         }
         
         basedTypeLabel2.setText(attributeLabels[1]);
         choices2 = Boat.getBoatConstructionGUI();
         
         basedTypeComboBox2.removeAllItems();
         
         for(String s : choices2)
         {
            basedTypeComboBox2.addItem(s);
            
            
         }
      
         
      }
      else if( item.equals( "Jet" ) )
      {
         
         attributeLabels = Jet.getAttributeLabels();
         basedTypeLabel1.setText(attributeLabels[0]);
         
         choices1 = Jet.getJetSizeGUI();
         
         basedTypeComboBox1.removeAllItems();
         for(String s : choices1)
         {
            basedTypeComboBox1.addItem(s);
            
            
         }
         
         basedTypeLabel2.setText(attributeLabels[1]);
         choices2 = Jet.getEnginePowerGUI();
         
         basedTypeComboBox2.removeAllItems();
         
         for(String s : choices2)
         {
            basedTypeComboBox2.addItem(s);
            
            
         }
      }
      else if( item.equals( "Air Balloon" ) )
      {
         
         attributeLabels = AirBalloon.getAttributeLabels();
         
         basedTypeLabel1.setText(attributeLabels[0]);
         
         choices1 = AirBalloon.getEnvelopeDesignGUI();
         
         basedTypeComboBox1.removeAllItems();
         
         for(String s : choices1)
         {
            basedTypeComboBox1.addItem(s);  
         }
         
         basedTypeLabel2.setText(attributeLabels[1]);
         
         choices2 = AirBalloon.getBasketSizeGUI();
         
         basedTypeComboBox2.removeAllItems();
         
         for(String s : choices2)
         {
            basedTypeComboBox2.addItem(s);   
         }
      }
      else if( item.equals( "Van" ) )
      {
         
         attributeLabels = Van.getAttributeLabels();
         
         basedTypeLabel1.setText(attributeLabels[0]);
         
         choices1 = Van.getVanSizeGUI();
         
         basedTypeComboBox1.removeAllItems();
         
         for(String s : choices1)
         {
            basedTypeComboBox1.addItem(s);    
         }
         
         basedTypeLabel2.setText(attributeLabels[1]);
         
         choices2 = Van.getVanGasCapacityGUI();
         
         basedTypeComboBox2.removeAllItems();
         
         for(String s : choices2)
         {
            basedTypeComboBox2.addItem(s);
         }
      }
      else
      {
         basedTypeLabel1.setText("");
         basedTypeLabel2.setText("");
         basedTypeComboBox1.removeAllItems();
         basedTypeComboBox2.removeAllItems();
      }
   }
   
   //Load Method
   public void load()
   {
      read();
   }
   
   //Save Method
   public void save()
   {
   
      if(vehicleTypeComboBox.getSelectedItem().equals("Truck"))
      {
      
         Truck truck = new Truck();
         
         String model = modelTextField.getText();
         
         truck.setModel(model);
         
         String color = colorTextField.getText();
         
         truck.setColor(color);
         
         double cost = Double.parseDouble(costTextField.getText());
         
         truck.setCost(cost);
              
         truck.setSize(basedTypeComboBox1.getSelectedIndex());
         
         truck.setEngineSize(basedTypeComboBox2.getSelectedIndex());
         
         carTruckList.add(truck);            
            
      }
      else if(vehicleTypeComboBox.getSelectedItem().equals("Car"))
      {
           
         Car car = new Car();
         
         String model = modelTextField.getText();
         
         car.setModel(model);
         
         String color = colorTextField.getText();
         
         car.setColor(color);
         
         double cost = Double.parseDouble(costTextField.getText());
         
         car.setCost(cost);
              
         car.setCarType(basedTypeComboBox1.getSelectedIndex());
         
         car.setTowingPackage(basedTypeComboBox2.getSelectedIndex());
         
         carTruckList.add(car);
         
      }
      else if(vehicleTypeComboBox.getSelectedItem().equals("Boat"))
      {
         Boat boat = new Boat();
         
         String model = modelTextField.getText();
         
         boat.setModel(model);
         
         String color = colorTextField.getText();
         
         boat.setColor(color);
         
         double cost = Double.parseDouble(costTextField.getText());
         
         boat.setCost(cost);
              
         boat.setBoatType(basedTypeComboBox1.getSelectedIndex());
         
         boat.setBoatConstruction(basedTypeComboBox2.getSelectedIndex());
         
         carTruckList.add(boat);
      
      }
      else if(vehicleTypeComboBox.getSelectedItem().equals("Jet"))
      {
         Jet jet = new Jet();
         
         String model = modelTextField.getText();
         
         jet.setModel(model);
         
         String color = colorTextField.getText();
         
         jet.setColor(color);
         
         double cost = Double.parseDouble(costTextField.getText());
         
         jet.setCost(cost);
              
         jet.setJetSize(basedTypeComboBox1.getSelectedIndex());
         
         jet.setEnginePower(basedTypeComboBox2.getSelectedIndex());
         
         carTruckList.add(jet);
      }
      else if(vehicleTypeComboBox.getSelectedItem().equals("Van"))
      {
         Van van = new Van();
         
         String model = modelTextField.getText();
         
         van.setModel(model);
         
         String color = colorTextField.getText();
         
         van.setColor(color);
         
         double cost = Double.parseDouble(costTextField.getText());
         
         van.setCost(cost);
              
         van.setVanSize(basedTypeComboBox1.getSelectedIndex());
         
         van.setVanGasCapacity(basedTypeComboBox2.getSelectedIndex());
         
         carTruckList.add(van);
      }
      else if(vehicleTypeComboBox.getSelectedItem().equals("Air Balloon"))
      {
         AirBalloon airBalloon = new AirBalloon();
         
         String model = modelTextField.getText();
         
         airBalloon.setModel(model);
         
         String color = colorTextField.getText();
         
         airBalloon.setColor(color);
         
         double cost = Double.parseDouble(costTextField.getText());
         
         airBalloon.setCost(cost);
              
         airBalloon.setDesign(basedTypeComboBox1.getSelectedIndex());
         
         airBalloon.setBSize(basedTypeComboBox2.getSelectedIndex());
         
         carTruckList.add(airBalloon);
      
      }
   
           
      JFrame frame = new JFrame("Save Message Box");
      JOptionPane.showMessageDialog(frame, "The data that you put is saved to the files");
      System.out.println("The data that you put is saved to the files");
   }  

   

   //First Method
   public void first()
   {
      indexPosition = 0;
      
      JFrame frame = new JFrame("First Message Box");
      
      JOptionPane.showMessageDialog(frame, carTruckList.get(indexPosition).toString());
      
      System.out.println(carTruckList.get(indexPosition).toString());
   }
   
   //Last Method
   public void last()
   {
      indexPosition = (carTruckList.size() - 1);
      
      JFrame frame = new JFrame("Previous Message Box");
      
      JOptionPane.showMessageDialog(frame, carTruckList.get(indexPosition).toString());
    
      System.out.println(carTruckList.get(indexPosition).toString());
      
    
   }
   
   //Next Method
   public void next()
   {
      
      
      if(indexPosition < (carTruckList.size() - 1))
      {
         indexPosition++;
         JFrame frame = new JFrame("Next Message Box");
      
         JOptionPane.showMessageDialog(frame, carTruckList.get(indexPosition).toString());
         System.out.println(carTruckList.get(indexPosition).toString());
            
      }
         
      else
      {
         JFrame frame = new JFrame("Next Error Message Box");
      
         JOptionPane.showMessageDialog(frame, "You cannot go next beyond this point");
         
         System.out.println("You cannot go next beyond this point");
      }
      
      
   }
   
   //Previous Method
   public void previous()
   {
      
      
      if(indexPosition > 0)
      {
         indexPosition--;
         
         JFrame frame = new JFrame("Previous Message Box");
      
         JOptionPane.showMessageDialog(frame, carTruckList.get(indexPosition).toString());
         
         System.out.println(carTruckList.get(indexPosition).toString());
            
      }
      else
      {
         JFrame frame = new JFrame("Previous Error Message Box");
      
         JOptionPane.showMessageDialog(frame, "You cannot go previous beyond this point");
        
         System.out.println("You cannot go previous beyond this point");
      }
      
      
            
   }

   
   //Write Method
   public void write()
   {
      try{
          
      
         ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(pathNameForDatFile));
            
         for(Vehicle v : carTruckList)
         {
            ois.writeObject(v);
         }
         
         ois.flush();
         
         ois.close();
         
         
         System.out.println("Writes the vehicle objects to the arraylists dat file");      
      
      }
      catch(IOException ex)
      {
         System.out.println(ex.getMessage());
      }
      
      try 
      {
         FileWriter out = new FileWriter("VehicleOrders.txt", false);
         
         BufferedWriter br = new BufferedWriter(out);
         
         for(Vehicle v: carTruckList)
         {
            if(v instanceof Car)
            {
               Car car = (Car) v;
               
               System.out.println(car.toString());
               
               br.write(car.toString());
               
               br.newLine();
            }
            else if(v instanceof Truck)
            {
               Truck truck = (Truck) v;
               
               System.out.println(truck.toString());
               
               br.write(truck.toString());
               
               br.newLine();
            }
            else if(v instanceof Boat)
            {
               Boat boat = (Boat) v;
               
               System.out.println(boat.toString());
               
               br.write(boat.toString());
               
               br.newLine();
            }
            else if(v instanceof Jet)
            {
               Jet jet = (Jet) v;
               
               System.out.println(jet.toString());
               
               br.write(jet.toString());
               
               br.newLine();
            }
            else if(v instanceof Van)
            {
               Van van = (Van) v;
               
               System.out.println(van.toString());
               
               br.write(v.toString());
               
               br.newLine();
            }
            
            else if(v instanceof AirBalloon)
            {
               AirBalloon airBalloon = (AirBalloon) v;
               
               System.out.println(airBalloon.toString());
               
               br.write(v.toString());
               
               br.newLine();
            }
         
         }   
           
         br.flush();
         
         br.close();
         
         System.out.println("Writes the vehicle objects to the arraylists text file"); 
      }
      catch(IOException e)
      {
         System.out.println("Exception: " + e.getMessage());
      }
   
      
   }

      //Read Method
   public void read()
   {
      try{
      
         if(pathNameForDatFile.exists())
         {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathNameForDatFile));
     
            while(true)
            {
               try
               {
                  carTruckList.add((Vehicle)ois.readObject());
               }
               catch(EOFException e)
               {
                  break;
               }  
            }
            ois.close();
            
            JFrame frame = new JFrame("Load Message Box");
            
            JOptionPane.showMessageDialog(frame, "The file is loaded to the program");
         }
      }
      catch(IOException ex)
      {
         ex.printStackTrace();
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      System.out.println("The file is readed and loaded");
   }
}