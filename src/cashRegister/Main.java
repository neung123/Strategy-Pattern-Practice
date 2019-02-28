package cashRegister;

import cashRegister.calculateTax.CalculateTaxCA;

public class Main {

    public static void main(String[] args) {

        CashRegister register = new CashRegister();

        register.recordPurchase(60);
        register.recordPurchase(40);
        register.setCalculateTaxBehavior(new CalculateTaxCA());
        register.calculateTax();
        register.enterPayment(200);

        double change = register.giveChange();
        System.out.println(change);
    }
}
