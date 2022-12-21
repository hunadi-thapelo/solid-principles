package org.example;

import singleResponsibility.Book;
import singleResponsibility.Invoice;
import singleResponsibility.InvoicePersistence;
import singleResponsibility.InvoicePrinter;



public class Main {
    public static void main(String[] args) {
        String fileName = "Print book inv"; //local variable
        Book comeDineWithMe = new Book("Come Dine With Me", "Master Chef", "2340001", 2020, 250);
        //comeDineWithMe.name = "Come dine with me";
        System.out.println(comeDineWithMe.name);

        Invoice total = new Invoice(comeDineWithMe, 3, 0.30, 0.15);
        System.out.println(total.calculateTotal());

        //this prints the invoice
        InvoicePrinter  obj = new InvoicePrinter(total);
        System.out.println("Print " +comeDineWithMe.name + " invoice: ");
        obj.print();

        //this saves invoice file to database
        InvoicePersistence obj2 = new InvoicePersistence(total);
        obj2.saveToFile(fileName); //pass local variable to call method

    }
}