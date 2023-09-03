package Class1;

public class Book {
    protected int pages = 1500; // something new here
    // -------------------------------------------------------------

    // Pages mutator.
    // -------------------------------------------------------------

    public void setPages(int numPages) {
        pages = numPages;
    }
    // -------------------------------------------------------------

    // Pages accessor.
    // -------------------------------------------------------------

    public int getPages() {
        return pages;
    }
}
