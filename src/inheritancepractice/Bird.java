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
public class Bird extends Animal{
    private String type;
    private boolean isRare;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void LayEggs(){
        System.out.println("Laid eggs.");
    }
}
