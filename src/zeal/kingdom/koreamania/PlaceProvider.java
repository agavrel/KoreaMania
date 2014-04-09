package zeal.kingdom.koreamania;

import java.util.List;

import android.location.Location;

public interface PlaceProvider {

    public void onLocationChanged(Location location);

    public void onDestroy();

    public interface PlaceLoaderCallback {
        public void onPlaceLoadFinished( List<Place> places );
    }
}