/**
 * Created by franz on 10.05.2017.
 */
public class RegularPrice extends Price {
    @Override
    int getPriceCoder() {
        return Movie.REGULAR;
    }
}
