

public class BookTitle {

    private String title;
    private float price;
    private String isbn;
    private int pages;

    public String getTitle(){return title;}
    public float getPrice(){return price;}
    public int getPages(){return pages;}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public BookTitle()
    {
        this("Unknown", "Unknown", 0, 0.0f);

    }
    public BookTitle(String title, String isbn, int pages, float price)
    {
        setTitle("Unknown");
        setIsbn("Unknown");
        setPages(0);
        setPrice(0.0f);
    }
}
