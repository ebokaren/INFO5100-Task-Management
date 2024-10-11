/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSwingModels;

import javax.swing.ImageIcon;

/**
 *
 * @author eboka
 */
public class User {
    // private String name; //Global Variable
    private String firstName;
    private String lastName; 
    private ImageIcon pic;
    private double age; 
    private String email;
    private String gender;
    private String scTextArea;
    private String patientType;
    private String dateChooser;
   
  
    
    public User(String firstName, String lastName, Double age, String gender, String email, String scTextArea, String patientType, String dateChooser, ImageIcon pic){
           // this.name = name;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.email = email;
            this.gender = gender;
            this.scTextArea = scTextArea;
            this.patientType = patientType;
            this.dateChooser = dateChooser;
            this.pic = pic;
            
        }  

   // public String getName() {
//        return name;
//    }

    public String getPatientType() {
        return patientType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getScTextArea() {
        return scTextArea;
    }
    
        public double getAge() {
        return age;
    }
        
    public ImageIcon getPic() {
        return pic;
    }

    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }
        
    public String getGender(){
        return gender;
    }

    public String getDateChooser() {
        return dateChooser;
    }
    
    
    
    void someFunction() {
        System.out.println("Name: " +firstName);
        
    }

   
   }
