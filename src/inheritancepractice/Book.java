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
public class Book extends PrintedMaterial{
    private String author;
    private String title;
    private boolean availability;

    public Book(String name, int type, int numberOfCopies) {
        super(name, type, numberOfCopies);
        this.availability = false;
    }
    
    

    public String getAuthor() {
        return author;
        
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable(){
        return this.availability;
    }
}
