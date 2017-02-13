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
public class Novel extends Book {

    private String title;
    private int numberOfPages;
    private String author;

    public void isAvailableInStock() {
        if (this.getCopiesPrinted() >= 0) {
            System.out.println(this + " novel has " + this.getCopiesPrinted() + " copies in the stock.");
        } else {
            System.out.println("No copies available in the stock.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title;
    }

}
