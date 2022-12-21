package singleResponsibility;

public class Invoice {

    public Book book;
    public int quantity;
    public double discountRate;
    public double taxRate;
    public double total;

    public Invoice(Book book, int quantity, double discountRate, double taxRate)
    {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = calculateTotal();
    }

    public double calculateTotal()
    {
        double price = ((book.price - book.price * discountRate) + this.quantity);
        double priceWithTaxes = price * (1 + taxRate);
        return priceWithTaxes;
    }
/*
    public void printInvoice()
    {
        System.out.println(quantity + " x " + book.name + " " + book.price + " R");
        System.out.println("Discount Rate: "+discountRate);
        System.out.println("Tax Rate: "+ taxRate);
        System.out.println("Total: "+total);
    }

    public void saveToFile(String fileName)
    {
        //creates file to be saved
    }
*/

}
