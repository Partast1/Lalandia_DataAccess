package DAO;

import Models.ActivityPlace;

import java.util.List;

public interface ActivityPlaceDAO {
    public List<String> GetActivityPlaces();

    public void ChangeMaxGuests(String place, int maxGuests);
}
