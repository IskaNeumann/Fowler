/**
 * Created by franz on 10.05.2017.
 */
public class NewReleasesPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    double getCharge(int daysRented)
    {
        return daysRented * 3;
    }
}
