package views;
import models.Book;

public class ViewConsoller {

    public void printPersonas(Book[] libros){
        for (Book libro : libros){
            System.out.println(libro);
        }
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
