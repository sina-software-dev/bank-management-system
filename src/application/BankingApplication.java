package application;

import application.cli.Prompt;

public class BankingApplication {
    public static void main(String[] args) {
        System.out.println("****Welcome to Banking Management System****");
        while (true) {
            String start = Prompt.start();
            if (start != null && !start.isBlank() && start.equals("yes")) {
                System.out.println(Prompt.getPersonalInformationOfCustomer());
            } else {
                System.out.println("your input is invalid");
            }
        }
    }
}
