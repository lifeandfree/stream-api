package stream.lambda_interface.after;

/**
 * Inspector.
 *
 * @author Ilya_Sukhachev
 */
public class Inspector {

    private TaxCalculator taxCalculator;

    public Inspector(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }
}
