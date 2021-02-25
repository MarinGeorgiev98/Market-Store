public abstract class Card {
    private int turnover;
    protected double discountRate;
    private double purchaseValue;
    private double discount;
    protected double total;

    public Card (int turnover, double purchaseValue) {
        this.turnover = turnover;
        this.purchaseValue = purchaseValue;
        this.setDiscountRate(this.discountRate);
        this.discount = (purchaseValue * discountRate) / 100;
        this.setTotal(this.purchaseValue, this.discount);
    }

    private void setTotal(double purchaseValue, double discount) {
        this.total = purchaseValue - discount;
    }

    public abstract void setDiscountRate(double discountRate);

    public int getTurnover() {
        return turnover;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("Purchase value: $")
                .append(this.getPurchaseValue())
                .append(System.lineSeparator())
                .append("Discount rate: ")
                .append(this.getDiscountRate())
                .append("%")
                .append(System.lineSeparator())
                .append("Discount: $")
                .append(this.getDiscount())
                .append(System.lineSeparator())
                .append("Total: $")
                .append(this.getTotal());

        return sb.toString();
    }
}