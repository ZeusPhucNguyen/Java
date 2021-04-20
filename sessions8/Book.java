package sessions8;


import sessions6.Author;

public class Book {
    private String name;
    private sessions6.Author author;
    private double price;
    private int qty;
    //constructors

    public Book(String name, sessions6.Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public sessions6.Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    public String toString(){
        return "Book-name:"+name+" by Author-name:"+author+"";
    }

    public static void main(String[] args) {
        sessions6.Author a=new sessions6.Author("NguyenNgocBaoPhuc","baophuc10112002@gmail.com",'m');
        System.out.println(a);
        //test book
        sessions6.Book b=new sessions6.Book("Batman",a,99.99,5);
        System.out.println(b);
        System.out.println("Name book is:"+b.getName());
        System.out.println("Price is:"+b.getPrice());
        System.out.println("Qty is:"+b.getQty());
        //test setter book
        System.out.println("");
        b.setQty(6);
        b.setPrice(88.88);
        System.out.println(b);
        System.out.println("");
        sessions6.Book moreBook=new sessions6.Book("Superman",new Author("Nguyen Quang Tuan","qtuan9e@gmail.com",'m'),19.99,10);
        System.out.println(moreBook);

    }
}
