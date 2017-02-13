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
    private int copiesPrinted;

    public void print(int copies) {
        if (copies > 0) {
            this.copiesPrinted += copies;
        }
    }

    public int getCopiesPrinted() {
        return copiesPrinted;
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
