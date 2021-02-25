public class SilverCard extends Card {

    public SilverCard(int turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public void setDiscountRate(double discountRate) {
        if (this.getTurnover() < 300) {
            this.discountRate = 2;
        }
        else if (this.getTurnover() > 300) {
            this.discountRate = 3.5;
        }
    }
}