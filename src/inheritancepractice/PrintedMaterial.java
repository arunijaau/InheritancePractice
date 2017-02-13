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
    private String type;
    private int numberOfCopiesNeeded;
    private int copiesPrinted;

    public void print() {
        this.copiesPrinted += this.numberOfCopiesNeeded;
    }

    public int getCopiesPrinted() {
        return copiesPrinted;
    }

    public int getNumberOfCopiesNeeded() {
        return numberOfCopiesNeeded;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopiesNeeded = numberOfCopies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
