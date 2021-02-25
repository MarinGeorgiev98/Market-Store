public class BronzeCard extends Card {

    public BronzeCard(int turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public void setDiscountRate(double discountRate) {
        if (this.getTurnover() < 100) {
            this.discountRate = 0;
        }
        else if (this.getTurnover() >= 100 && this.getTurnover() <= 300) {
            this.discountRate = 1;
        }
        else if (this.getTurnover() > 300) {
            this.discountRate = 3.5;
        }
    }
}