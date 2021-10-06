package Handlers;

import Models.ActivityPlace;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Klassens ansvarsområde omhandler Ned hentning af ActivitePLace data
 */
public class ActivityPlaceData {

    DatabaseConnector dbConnector = new DatabaseConnector();
    public List<ActivityPlace> GetActivityPlaces(){

        List<ActivityPlace> activities = new ArrayList<ActivityPlace>();
        ActivityPlace place = null;

        Connection con = dbConnector.GetConnector();
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select ActivityName, Actual_quests, Max_quests from ActivityPlace");

            while(rs.next())
                activities.add( place = new ActivityPlace(rs.getString(1),rs.getInt(2), rs.getInt(3)));
            System.out.println("Activity name:" + " " + place.getPlaceName() + " " + "Min guests" + place.getActualGuests() + " " + "Max guests" + place.getMaximumGuests());
            con.close();

        }
        catch(Exception e){ System.out.println(e);}
        finally{
            return activities;
        }
    }
    public void ChangeMaxGuests(String place, int maxGuests){
        Connection con = dbConnector.GetConnector();

        String sql = "UPDATE ActivityPlace  SET Max_quests  = ? WHERE ActivityName = ? " ;


        try{
            PreparedStatement prepareStmt = con.prepareStatement(sql);
            prepareStmt.setInt(1,maxGuests);
            prepareStmt.setString(2,place);

            prepareStmt.executeUpdate();


            con.close();


        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }
}
