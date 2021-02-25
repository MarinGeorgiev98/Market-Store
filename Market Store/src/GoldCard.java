public class GoldCard extends Card {

    public GoldCard(int turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public void setDiscountRate(double discountRate) {
        if (this.getTurnover() < 300) {
            this.discountRate = 2;
        }
        else if (this.getTurnover() >= 300 && this.getTurnover() <= 400) {
            this.discountRate = 3;
        }
        else if (this.getTurnover() >= 400 && this.getTurnover() <= 500) {
            this.discountRate = 4;
        }
        else if (this.getTurnover() >= 500 && this.getTurnover() <= 600) {
            this.discountRate = 5;
        }
        else if (this.getTurnover() >= 600 && this.getTurnover() <= 700) {
            this.discountRate = 6;
        }
        else if (this.getTurnover() >= 700 && this.getTurnover() <= 800) {
            this.discountRate = 7;
        }
        else if (this.getTurnover() >= 800 && this.getTurnover() <= 900) {
            this.discountRate = 8;
        }
        else if (this.getTurnover() >= 900 && this.getTurnover() <= 1000) {
            this.discountRate = 9;
        }
        else if (this.getTurnover() > 1000) {
            this.discountRate = 10;
        }
    }
}