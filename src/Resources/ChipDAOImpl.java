package Resources;

import DAO.ChipDAO;
import Handlers.ActivityPlaceData;
import Handlers.ChipData;
import Handlers.Serializer;
import Models.ActivityPlace;
import Models.Chip;

import java.util.ArrayList;
import java.util.List;

public class ChipDAOImpl implements ChipDAO {

    ChipData data = new ChipData();
    public List<String> GetChips() {
        Serializer serializer = new Serializer();

        List<Chip> chips = new ArrayList<Chip>();

        List<String> serializedPlaces = new ArrayList<String>();
        try{
            chips = data.GetChips();

            serializedPlaces = serializer.SerializeChips(chips);

        }
        catch(Exception e){ System.out.println(e);}
        finally{
            return serializedPlaces;
        }
    }
}
