/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author isuru udana
 */
public class customer_minarals {
    
    
      
    public static int calcium,chloride,chromium,copper, fluoride,Iodine,iron,magnesium, molybdenum, phosphorus,potassium, selenium, znc,sodium;
  public static int all_calcium,all_chloride,all_chromium,all_copper,all_fluoride,all_Iodine,all_iron,all_magnesium,all_molybdenum,all_phosphorus,all_potassium,all_selenium,all_znc,all_sodium;
   // private  int vegetableId,Vitamin_A, Thiamin, Ribloflevin, niacin, pantothenic, biotin, piridoxine, vitamin_B12, folic_acid, Vitamin_C, Vitamin_D,vitamin_E,vitamin_k ;

    
     public static  void minarals(String food,int i){
        calcium=0;chloride=0;chromium=0;copper=0; fluoride=0;Iodine=0;iron=0;magnesium=0; molybdenum=0; phosphorus=0;potassium=0; selenium=0; znc=0;sodium=0;
    String q2= null;
         
          
     try{ 
        Class.forName("com.mysql.jdbc.Driver");
       Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/online_food_order","root","");
           if (i==1){
          customer_vitamins.findvegitableID(food,1);
          q2="SELECT * FROM `content_minarals_for_rice` WHERE `RiceId`='"+customer_vitamins.variableID1+"'";
       
           }
           if (i==2){
          customer_vitamins.findvegitableID(food,2);
          q2="SELECT * FROM `content_minarals_for_vegetables` WHERE vegetableId ='"+customer_vitamins.variableID1+"'";
       
           }
           if (i==3){
          customer_vitamins.findvegitableID(food,3);
          q2="SELECT * FROM `content_minarals_for_meat_and_fish` WHERE meat_and_fishId ='"+customer_vitamins.variableID1+"'";
       
           }
           if (i==4){
          customer_vitamins.findvegitableID(food,4);
          q2="SELECT * FROM `content_minarals_for_dessert` WHERE dessertId ='"+customer_vitamins.variableID1+"'";
       
           }
      Statement st2= conn.createStatement();
          ResultSet rs2=st2.executeQuery(q2);
           
           while (rs2.next()){
        calcium = rs2.getInt("calcium");
       chloride =rs2.getInt("chloride");
       chromium =rs2.getInt("chromium");
       copper=rs2.getInt("copper");
       fluoride =rs2.getInt("fluoride");
       Iodine =rs2.getInt("Iodine");
       iron =rs2.getInt("iron");
       magnesium =rs2.getInt("magnesium");
       molybdenum =rs2.getInt("molybdenum");
       phosphorus =rs2.getInt("phosphorus");
       potassium =rs2.getInt("potassium");
        selenium =rs2.getInt("selenium");
       znc=rs2.getInt("znc");
        sodium =rs2.getInt("sodium"); 
        all_calcium += rs2.getInt("calcium");
       all_chloride +=rs2.getInt("chloride");
       all_chromium +=rs2.getInt("chromium");
       all_copper+=rs2.getInt("copper");
       all_fluoride +=rs2.getInt("fluoride");
       all_Iodine+=rs2.getInt("Iodine");
       all_iron +=rs2.getInt("iron");
       all_magnesium +=rs2.getInt("magnesium");
       all_molybdenum +=rs2.getInt("molybdenum");
       all_phosphorus +=rs2.getInt("phosphorus");
       all_potassium +=rs2.getInt("potassium");
        all_selenium +=rs2.getInt("selenium");
       all_znc+=rs2.getInt("znc");
        all_sodium +=rs2.getInt("sodium"); 
        
        
                conn.close();
                 st2.close();
		 rs2.close();
        
        }
       
         
         
         
      }catch(Exception e){
       System.out.println(e);}
         

     
     
     
     
     
     
     
     
   
     
     
     
     
     
     }}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    