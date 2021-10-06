package Handlers;



import Models.Chip;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ChipData {

    DatabaseConnector dbConnector = new DatabaseConnector();

    public List<Chip> GetChips(){
        List<Chip> chips=new ArrayList(){};


        Connection con = dbConnector.GetConnector();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select RFID from Chip");

            while(rs.next())
                chips.add(  new Chip(rs.getString(1)));
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return chips;
    }
}
