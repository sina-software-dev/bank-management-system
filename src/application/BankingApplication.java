package application;

import application.cli.Prompt;

public class BankingApplication {
    //ConcurrentMap<String,>
    public static void main(String[] args) {
        System.out.println("****Welcome to banking management System****");
        //System.out.println(Prompt.FirstTime());
        System.out.println(Prompt.getPersonalInformationOfCustomer());
    }
}
