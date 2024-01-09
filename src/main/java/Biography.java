public class Biography extends Book {

    private String mainCharacer;

    public Biography(int numberOfPages, String author, String mainCharacer){
        super(numberOfPages,author);
        this.mainCharacer = mainCharacer;
    }


}
