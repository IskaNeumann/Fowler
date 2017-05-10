/**
 * Created by franz on 10.05.2017.
 */
abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);
}
