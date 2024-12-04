import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

     while (true){
         String input = JOptionPane.showInputDialog(null, " Welcome to SmartCars\n The pay as you go rental service \n \nAre you a customer(c) or employee(e)?");
         if (input.equalsIgnoreCase("c")){
             customersMenu();
         } else if (input.equalsIgnoreCase("e")) {
             //employeeMenu();
         }
     }
    }
    public static void customersMenu() {
        Customer c1 = new Customer("Liam", "Moloney",
                "liam12@gmail.com", "12 LakeView, Killaloe, Clare, V94 1234", 101);
        Customer c2 = new Customer("Saoirse", "Kargbo",
                "kargbo@gmail.com", "24 MillView, Shannon, Clare, V74 K234", 102);
        Customer c3 = new Customer("Kellie", "O'Connor",
                "kellie83@gmail.com", "The Grange, Nenagh, Tipperary, V83 1234", 103);

        ArrayList<Booking> bookings = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            String input = JOptionPane.showInputDialog("What would you like to do? \n Add a vehicle(a), change rates(r), list bookings(b) \n, list customers(c), list all vehicles(v),list all employees(e)");
            if (input.equalsIgnoreCase("c")) {
                System.out.println("\nCustomers List:");
                for (Customer customer : customers) {
                    System.out.println(customer);
                }
            }
        }


    }
}