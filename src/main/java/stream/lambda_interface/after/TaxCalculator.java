package stream.lambda_interface.after;

@FunctionalInterface
public interface TaxCalculator {
    double calculateTax(int summ);

    default double calc(String i) {
        return 0.0;
    }
}
