package Handlers;

import Models.ActivityPlace;
import Models.Chip;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Står for Serializering af systems modeler
 */
public class Serializer {
    public List<String> SerializePlaces(List<ActivityPlace> Places){

        List<String> serializedPlaces = new ArrayList<String>();

        for (ActivityPlace place: Places) {

            serializedPlaces.add(new Gson().toJson(place));
        }
        return serializedPlaces;
    }
    public List<String> SerializeChips(List<Chip> Chips){

        List<String> serializedChips = new ArrayList<String>();

        for (Chip chip: Chips) {

            serializedChips.add(new Gson().toJson(chip));
        }
        return serializedChips;
    }
}
