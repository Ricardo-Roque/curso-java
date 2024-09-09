package application.order;

import entities.order.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramOrder {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println();

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        sc.nextLine();
        String status = sc.nextLine();
        System.out.print("How many items to this order: ");
        int items = sc.nextInt();

        Date moment = Date.from(Instant.now());

        Order order = new Order(moment, OrderStatus.valueOf(status), client);

        for (int i = 0; i < items; i++) {
            System.out.println("Enter #" + (i + 1) + "item data: ");
            System.out.print("Product Name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product Price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, product);

            order.addItem(orderItem);
        }

        System.out.print("ORDER SUMARY: ");
        System.out.print(order);


        sc.close();
    }
}
