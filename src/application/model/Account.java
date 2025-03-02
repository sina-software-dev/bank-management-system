package application.model;

import application.model.enumuration.AccountType;

import java.util.List;
import java.util.Objects;

/**
 * @author Sina Ramezani, 3/2/2025
 */
public class Account extends AbstractModel {
    private String accountNumber;
    private AccountType accountType;
    private Double balance;
    private List<Transaction> transactions;

    public Account() {
    }

    public Account(String accountNumber, AccountType accountType,
                   Double balance, List<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.transactions = transactions;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) &&
                accountType == account.accountType &&
                Objects.equals(balance, account.balance) &&
                Objects.equals(transactions, account.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountType,
                balance, transactions);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountType=" + accountType +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}
