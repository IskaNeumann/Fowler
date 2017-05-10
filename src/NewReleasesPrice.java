/**
 * Created by franz on 10.05.2017.
 */
public class NewReleasesPrice extends Price {
    @Override
    int getPriceCoder() {
        return Movie.NEW_RELEASE;
    }
}
