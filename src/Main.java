import Resources.ActivityPlaceImpl;
import Services.ActivityPlaceService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        ActivityPlaceImpl service = new ActivityPlaceImpl();
        List<String> places = new ArrayList<String>();
        places = service.GetActivityPlaces();

        for (String place : places
             ) {
            System.out.println(place);
        }

    }
}
