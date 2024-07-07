public class Currency {
    private String base_code;
    private String target_code;

    private double amount;
    private double conversion_result;

    public String getBase_code() {
        return base_code;
    }

    public Currency(String base_code, String target_code, double amount) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.amount = amount;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getAmount() {
        return amount;
    }

    public double getConversion_result() {
        return conversion_result;
    }


}
