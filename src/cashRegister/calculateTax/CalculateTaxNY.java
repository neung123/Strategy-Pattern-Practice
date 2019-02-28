package cashRegister.calculateTax;

import cashRegister.calculateTax.CalculateTaxBehavior;

public class CalculateTaxNY implements CalculateTaxBehavior {
    @Override
    public double calculate(double purchase) {
        if (purchase > 100) purchase = purchase + (purchase*0.08);

        return purchase;
    }
}