package lv.oopprograming;

public class VipCustomer {
    private String name;
    private long creditLimit;
    private String email;

    public VipCustomer() {
        this("Raimonds",101011L,"raim@bort");
    }

    public VipCustomer(String name, long creditLimit) {
        this(name,creditLimit,"noneEmail");
    }

    public VipCustomer(String name, long creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
