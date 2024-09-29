/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user_profile;

import javax.swing.ImageIcon;

/**
 *
 * @author eboka
 */
public class User {
    private String firstName;
    private String lastName;
    private ImageIcon Pic;
    private String email;
    private double phoneNumber;
    private double age;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
        
    public ImageIcon getPic() {
        return Pic;
    }

    public void setPic(ImageIcon Pic) {
        this.Pic = Pic;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    
    

    
    
}
