public class Book implements Comparable<Book> {
    String name;
    double price;
    public Book(String name, double price)
    {
        this.name=name;
        this.price=price;
    }
    public double TotalPrice()
    {
        return price +(0.08d * price);
    }
    public String toString() {
        return "Title: " + this.name + ", Price: " + this.TotalPrice();
    }
    @Override
    public int compareTo(Book book) {
        return (int) (price-book.price);
    }
}
