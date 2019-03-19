package lv.oopprograming;

public class oopprograming {
    public static void main(String[] args) {
       /* //steate and behavior
        //class is templeat to hold objects
        //Basic data types
        //

        Car car = new Car();
        Car holden = new Car();
        Car lexus = new Car();
        car.setModel("SuperCar");
        System.out.println("Model is "+ car.getModel());
        BankAcc raimAccc = new BankAcc();
        raimAccc.depositBankAcc(3030);
        raimAccc.withdrawFunds(222);
        raimAccc.getBalance();
        BankAcc raimAccc2 = new BankAcc("Set", "Emaild", 2002020L);
        System.out.println();*/
       VipCustomer vip = new VipCustomer();
        System.out.println(vip.getCreditLimit() + vip.getEmail() + vip.getName());
        VipCustomer vip2 = new VipCustomer("Bor",222L);
        System.out.println(vip2.getName());
    }
}
