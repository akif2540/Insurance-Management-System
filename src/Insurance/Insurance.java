package Insurance;

import Account.Account;
import Input.Input;

public abstract class Insurance {
    Account account;
    String name;
    String startDate;
    String endDate;
    String type;
    double price;
    double rate;

    Insurance( Account account, String type, double rate){
        this.account = account;
        this.type = type;
        this.rate = rate;
        createInsurance();
    }

    public void createInsurance(){
        System.out.println("-----------------Create New Insurance----------");

        System.out.println("Insurance Name: ");
        this.name = Input.nextLine();
        System.out.println("Start Date: ");
        this.startDate = Input.nextLine();
        System.out.println("End Date: ");
        this.endDate = Input.nextLine();
        System.out.println("Price: ");
        this.price = Input.nextDouble();
    }
    public double calculate() {
        return price * rate * account.getRate();
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Start Date: " + startDate + " End Date: " + endDate + " Total Price: " + calculate();
    }
}
