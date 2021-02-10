package Practice1;


import java.util.Arrays;

public class Book {
    private Pages[] pages;  //composition
    private String title;   //composition
    private Lybrary lybrary = null;   //aggregation

    public Book(int size, String title,Lybrary lybrary){
        this.title = title;
        this.lybrary = lybrary;

        pages = new Pages[size];

        for(int i =0; i<size;i++){
            pages[i]=new Pages(50,"Contend");


        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + Arrays.toString(pages) +
                ", title='" + title + '\'' +
                ", lybrary=" + lybrary +
                '}';
    }
}


