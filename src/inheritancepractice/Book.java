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
public class Book extends PrintedMaterial {

    private int NumberOfChapters;
    private int chapterNumber;

    public void readChapter(int chapterNumber) {
        System.out.println("Chapter " + chapterNumber + " was read.");
    }

    public int getNumberOfChapters() {
        return NumberOfChapters;
    }

    public void setNumberOfChapters(int NumberOfChapters) {
        this.NumberOfChapters = NumberOfChapters;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

}
