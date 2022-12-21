package singleResponsibility;

public class InvoicePrinter {
    public Invoice invoice;

    public InvoicePrinter(Invoice invoice)
    {
        this.invoice = invoice;
    }

    public void print()
    {
        System.out.println(invoice.quantity + " x " + invoice.book.name
                + " R " + invoice.book.price);
        System.out.println("Discount Rate: "+invoice.discountRate);
        System.out.println("Tax Rate: "+ invoice.taxRate);
        System.out.println("Total: R "+invoice.total);
    }

}
