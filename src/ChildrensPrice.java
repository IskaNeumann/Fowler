
/**
 * Created by franz on 10.05.2017.
 */
public class ChildrensPrice extends Price{

    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    double getCharge(int daysRented)
    {
        double result = 1.5;
        if(daysRented > 3)
        {
            result += (daysRented -3) * 1.5;
        }
        return result;
    }
}
