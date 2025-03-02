package application.cli;

import application.model.Customer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Sina Ramezani, 3/2/2025
 */
public class Prompt {

    public static String start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You are new to this application?(yes/no)");
        return scanner.nextLine();
    }

    public static Customer getPersonalInformationOfCustomer() {
        Scanner scanner = new Scanner(System.in);
        String name = getName(scanner);
        String lastName = getLastName(scanner);
        String nationalCode = getNationalCode(scanner);
        LocalDate birthDay = getBirthDay(scanner);
        return new Customer(
                name,
                lastName,
                nationalCode,
                birthDay,
                new ArrayList<>()
        );
    }

    public static String getName(Scanner scanner) {
        System.out.print("What is your name:");
        String name = scanner.nextLine();
        if(name == null || name.isBlank()) {
            inputInvalid("name");
            name = getName(scanner);
        }
        return name;
    }

    public static void inputInvalid(String field) {
        System.out.println(field + " is invalid try again!");
    }


    public static String getLastName(Scanner scanner) {
        System.out.print("What is your lastName:");
        String lastName = scanner.nextLine();
        if(lastName == null || lastName.isBlank()) {
            inputInvalid("lastName");
            lastName = getLastName(scanner);
        }
        return lastName;
    }

    public static String getNationalCode(Scanner scanner) {
        System.out.print("What is your nationalCode:");
        String nationalCode = scanner.nextLine();
        if(nationalCode == null || nationalCode.isBlank()) {
            inputInvalid("nationalCode");
            nationalCode = getNationalCode(scanner);
        }
        return nationalCode;
    }

    public static LocalDate getBirthDay(Scanner scanner) {
        System.out.print("What is your birthDay (YYYY/MM/DD):");
        String birthDayAsString = scanner.nextLine();
        if(birthDayAsString == null || birthDayAsString.isBlank() ||
                !Pattern.matches("^(19[0-9]{2}|20[0-2][0-5])/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])$",
                        birthDayAsString)) {
            inputInvalid("birthDay");
            return getBirthDay(scanner);
        }
        return LocalDate.parse(birthDayAsString, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }

    /*public static void getUserNameAndPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide your username:");
        String username = scanner.nextLine();
        System.out.print("Provide your password:");
        String password = scanner.nextLine();
    }*/
}
