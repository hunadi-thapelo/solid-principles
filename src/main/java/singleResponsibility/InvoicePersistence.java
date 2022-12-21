package singleResponsibility;

public class InvoicePersistence {

    public Invoice invoice;

    public InvoicePersistence(Invoice invoice)
    {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {

        System.out.println("Save file to database!");
    }
}
