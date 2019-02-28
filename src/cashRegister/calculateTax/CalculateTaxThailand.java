package cashRegister.calculateTax;

import cashRegister.calculateTax.CalculateTaxBehavior;

public class CalculateTaxThailand implements CalculateTaxBehavior {
    @Override
    public double calculate(double purchase) {
        return purchase + (purchase*0.07);
    }
}
