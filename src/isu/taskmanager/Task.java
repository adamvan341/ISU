/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isu.taskmanager;

/**
 *
 * @author Adam Vanderneut
 */
public class Task {

    private String name;// Task Name
    private String desc;// Task Description

    /**
     * Initializes a task
     * @param name Name of task
     * @param desc Description of task
     */
    public Task(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * Sets the task's name
     * @param name Name of task
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the task
     * @return Name of task
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the description of the task
     * @param desc Description of task
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Gets the description of the task
     * @return Description of task
     */
    public String getDesc() {
        return desc;
    }
    
    /**
     * Validates the data of variables name and description.
     * Will return false if the variables are null or blank.
     * @return If the data is valid
     */
    public boolean validateData() {
        return !(name == null || desc == null || name.equals("") || desc.equals(""));
    }
    
    @Override
    public String toString() {
        String temp;
        temp = "Name: " + name;
        temp += "\nDescription: " + desc;
        temp += "\n\n";
        
        return temp;
    }
}
