package Resources;

import DAO.ActivityPlaceDAO;
import Handlers.ActivityPlaceData;
import Handlers.DatabaseConnector;
import Handlers.Serializer;
import Models.ActivityPlace;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

////Make Artifacts and check class

public class ActivityPlaceImpl implements ActivityPlaceDAO {

    ActivityPlaceData data = new ActivityPlaceData();

    @Override
    public List<String> GetActivityPlaces() {
        Serializer serializer = new Serializer();

        List<ActivityPlace> activities = new ArrayList<ActivityPlace>();

        List<String> serializedPlaces = new ArrayList<String>();
        try{
            activities = data.GetActivityPlaces();

            serializedPlaces = serializer.SerializePlaces(activities);


        }
        catch(Exception e){ System.out.println(e);}
        finally{
            return serializedPlaces;
        }
    }
    public void ChangeMaxGuests(String place, int maxGuests){
        try {
            data.ChangeMaxGuests(place, maxGuests);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
