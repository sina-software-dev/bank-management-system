package application.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @author Sina Ramezani, 3/2/2025
 */
public class Customer extends AbstractModel {
    private String name;
    private String lastName;
    private String nationalCode;
    private LocalDate birthDate;
    private List<Account> accounts;

    public Customer() {
    }

    public Customer(String name, String lastName, String nationalCode,
                    LocalDate birthDate, List<Account> accounts) {
        this.name = name;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.birthDate = birthDate;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(nationalCode, customer.nationalCode) &&
                Objects.equals(birthDate, customer.birthDate) &&
                Objects.equals(accounts, customer.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, nationalCode, birthDate, accounts);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", birthDate=" + birthDate +
                ", accounts=" + accounts +
                '}';
    }
}
