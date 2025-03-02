package application.model.enumuration;

/**
 * @author Sina Ramezani, 3/2/2025
 */
public enum AccountType {
    CREDIT("credit",1),DEBIT("Debit",2);

    private String name;
    private Integer code;

    AccountType(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
