package Services;

import Resources.ActivityPlaceImpl;

import java.util.ArrayList;
import java.util.List;

public class ActivityPlaceService {

    ActivityPlaceImpl placeImpl = new ActivityPlaceImpl();

    public List<String>  GetActivityPlaces(){
        List<String> serializedPlaces = new ArrayList<String>();
        serializedPlaces = placeImpl.GetActivityPlaces();

        return serializedPlaces;
    }
    public void ChangeMaxGuests(String place, int maxGuests){
       placeImpl.ChangeMaxGuests(place, maxGuests);

    }
}

