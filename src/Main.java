import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Maria Silva Souza K00293878


// while loop , asks user for input till they exit
        // jOptionPane to ask user to select c or e
        // if e it will go to customerMenu method, create method
        //if c it will go to employeeMenu method, create method
        while (true) {
            String input = JOptionPane.showInputDialog(null, " Welcome to SmartCars\n The pay as you go rental service \n \nAre you a customer(c) or employee(e)?");
            if (input.equalsIgnoreCase("c")) {
                customersMenu();
            } else if (input.equalsIgnoreCase("e")) {
                employeeMenu();
            }
        }
    }

    public static void customersMenu() {
        // aray list to hold booking, customer and employee class object
        // call classes
        // information to the classes
        // use while loop to keep asking user
        // JoptionPane to ask users ro select letters
        //use for to call array list and sout to display information

        ArrayList<Booking> bookings = new ArrayList<>();
        ;
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Liam", "Moleney", "liam12@gmail.com",
                "12 LakeView, Killaloe, Clare, V94 1234", 101));
        customers.add(new Customer("Saoirse", "Kargbo", "kargbo@gmail.com",
                "24 MillView, Shannon, Clare, V74 K234", 102));
        customers.add(new Customer("Kellie", "O'Conner", "kellie83@gmail.com",
                "The Grange, Nenagh, Tipperary, V83 1234", 103));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Joe", "Bloggs", "joel@gmail.com",
                "1 Main Street,Castle Connel,Limerick,V12 P234"));
        employees.add(new Employee("Mary", "Dune", "mary10@gmail.com",
                "10 O'Connel Avenue, Raheen Limerick,V12 R123"));
        employees.add(new Employee("Fyas", "Murphy", "fyazi17@gmail.com",
                "17 The Downs, Dooroyle, Limmerick, V21 S123"));


        while (true) {
            String input = JOptionPane.showInputDialog("What would you like to do? \n Add a vehicle(a), change rates(r), " +
                    "list bookings(b) \n, list customers(c), list all vehicles(v),list all employees(e)");
            if (input.equalsIgnoreCase("c")) {
                System.out.println("\nCustomers List:");
                for (Customer customer : customers) {
                    System.out.println(customer);
                }
            } else if (input.equalsIgnoreCase("e")) {
                System.out.println("\nEmployees List:");
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
            } else {
                break;
            }


        }

    }
    public static void employeeMenu(){
        // aray list to hold booking, customer, vehicle class class object
        // call classes
        // information to the classes
        // use while loop to keep asking user
        // JoptionPane to ask users ro select letters
        //use for to call array list and sout to display information

    }
}
