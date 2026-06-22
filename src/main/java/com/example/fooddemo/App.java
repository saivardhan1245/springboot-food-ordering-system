package com.example.fooddemo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        OrderDAO dao = new OrderDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== FOOD ORDER MENU =====");
            System.out.println("1. Place Order");
            System.out.println("2. View Orders");
            System.out.println("3. Update Order");
            System.out.println("4. Delete Order");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Order ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Customer Name: ");
                String customer = sc.nextLine();

                System.out.print("Food Item: ");
                String food = sc.nextLine();

                System.out.print("Quantity: ");
                int quantity = sc.nextInt();

                System.out.print("Total Amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();

                System.out.print("Order Date (yyyy-mm-dd): ");
                LocalDate date =
                        LocalDate.parse(sc.nextLine());

                System.out.print("Order Status: ");
                String status = sc.nextLine();

                dao.saveOrder(
                        new Order(id, customer,
                                food, quantity,
                                amount, date, status));

                System.out.println("Order Placed");
                break;

            case 2:

                List<Order> orders =
                        dao.getAllOrders();

                for (Order o : orders) {
                    System.out.println(o);
                }

                break;

            case 3:

                System.out.print("Enter Order ID: ");
                int updateId = sc.nextInt();

                Order order =
                        dao.getOrder(updateId);

                if (order == null) {
                    System.out.println("Order Not Found");
                    break;
                }

                sc.nextLine();

                System.out.print("New Status: ");
                
                order.setOrderStatus(sc.nextLine());
                
                dao.updateOrder(order);
                
                System.out.println("Order Updated");
                
                break;

            case 4:

                System.out.print("Enter Order ID: ");
                int deleteId = sc.nextInt();

                dao.deleteOrder(deleteId);

                System.out.println("Order Deleted");
                break;

            case 5:

                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}