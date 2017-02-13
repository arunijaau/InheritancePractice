/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author Aruni
 */
public class AngryBird extends Bird{
    private String name;
    private String color;

    public void getAngry(){
        System.out.println(this.name + " has been angry.");
    }
    
    public void manageAnger(){
        System.out.println(this.name + " need to go to anger management sessions.");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        
}
