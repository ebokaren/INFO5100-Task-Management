/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author eboka
 */

public class TaskManagementModel {
    // private String name; //Global Variable
    private String adminName;
    private String adminPassword; 
    private String userName;
    private String userPassword; 
    private double age;
    private String newTask;
    private String priority;
    private String scTextArea;
    private String newTaskAssignee;
    private String dateChooser;
   
    public TaskManagementModel(String adminName, String adminPassword, String userName, String userPassword, Double age, String newTask, String priority, String newTaskAssignee, String scTextArea, String dateChooser){
           // this.name = name;
            this.adminName = adminName;
            this.adminPassword = adminPassword;
            this.userName = userName;
            this.userPassword = userPassword;
            this.age = age;
            this.newTask = newTask;
            this.priority = priority;
            this.scTextArea = scTextArea;
            this.newTaskAssignee = newTaskAssignee;
            this.dateChooser = dateChooser;
            
        }  

    public TaskManagementModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   // public String getName() {
//        return name;
//    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getNewTask() {
        return newTask;
    }

    public void setNewTask(String newTask) {
        this.newTask = newTask;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getScTextArea() {
        return scTextArea;
    }

    public void setScTextArea(String scTextArea) {
        this.scTextArea = scTextArea;
    }

    public String getNewTaskAssignee() {
        return newTaskAssignee;
    }

    public void setNewTaskAssignee(String newTaskAssignee) {
        this.newTaskAssignee = newTaskAssignee;
    }

    public String getDateChooser() {
        return dateChooser;
    }

    public void setDateChooser(String dateChooser) {
        this.dateChooser = dateChooser;
    }

}