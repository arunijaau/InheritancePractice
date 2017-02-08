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
public class PrintedMaterial {
    private String name;
    private int type;
    private int numberOfCopies;

    public PrintedMaterial(String name, int type, int numberOfCopies) {
        this.name = name;
        this.type = type;
        this.numberOfCopies = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public void print(){
        this.numberOfCopies += 1;
    }
    
    
}
