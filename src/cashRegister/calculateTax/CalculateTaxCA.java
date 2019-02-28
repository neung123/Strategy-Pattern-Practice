package cashRegister.calculateTax;

import cashRegister.calculateTax.CalculateTaxBehavior;

public class CalculateTaxCA implements CalculateTaxBehavior {
    @Override
    public double calculate(double purchase) {
        return purchase + (purchase*0.075);
    }
}