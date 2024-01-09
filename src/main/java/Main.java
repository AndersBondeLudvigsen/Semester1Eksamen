import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookArrayList = new ArrayList<>();
        Book book = new Book(10, "Anders");
        Book book1 = new Book(20, "Anders");
        Book book2 = new Book(20, "Anders");
        Biography biography = new Biography(10,"Anders","Mads");
        bookArrayList.add(biography);
        bookArrayList.add(book);
        bookArrayList.add(book1);
        bookArrayList.add(book2);


        double samletAntalSider = 0;
        for (Book bog : bookArrayList){
            samletAntalSider +=bog.getNumberOfPages();
        }
        System.out.println(samletAntalSider/bookArrayList.size());


    }
}
