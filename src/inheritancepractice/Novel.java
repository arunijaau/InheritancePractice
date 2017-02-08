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
public class Novel extends Book{
    private String name;
    private int numberOfPages;
    private boolean isRead;

    public Novel(String name, int type, int numberOfCopies) {
        super(name, type, numberOfCopies);
        this.isRead = false;
    }

   
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    public void read(){
        this.isRead = true;
    }

    
}
