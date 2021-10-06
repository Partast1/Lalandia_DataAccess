package Services;

import Resources.ChipDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class ChipService {
    ChipDAOImpl chipImpl = new ChipDAOImpl();

    public List<String> GetActivityPlaces(){
        List<String> serializedChips = new ArrayList<String>();
        serializedChips = chipImpl.GetChips();

        return serializedChips;
    }
}
