public  class Book {
    private int numberOfPages;
    private String author;


    public Book(int numberOfPages, String author){
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }
}
