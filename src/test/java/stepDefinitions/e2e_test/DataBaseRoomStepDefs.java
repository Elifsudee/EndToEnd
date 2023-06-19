package stepDefinitions.e2e_test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pojos.RoomPojo;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.e2e_test.MedunnaRoomStepDefs.roomNumberFaker;

public class DataBaseRoomStepDefs {
    Connection connection;
    Statement statement;
    @Given("connect to database")
    public void connect_to_database() throws SQLException {
        //1 adim:Connection
     connection= DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db_v2","select_user","Medunna_pass_@6");

     //2 adim: Statement
     statement= connection.createStatement();



    }
    @Then("read room and validate")
    public void read_room_and_validate() throws SQLException {
        //3adim: query calistir
        String sqlQuery="select * from room where room_number="+roomNumberFaker;
      ResultSet resultSet= statement.executeQuery(sqlQuery);////Query ile çağrılan data resultSet içerisinde yer alacak.
        resultSet.next();//pointeri siradki satira alir

       RoomPojo expectedData = new RoomPojo(roomNumberFaker,"SUITE", true,123.00,"Created For End To End Test");

       String roomType=  resultSet.getString("room_type");
      Boolean status=  resultSet.getBoolean("status");
     Double price=  resultSet.getDouble("price");
      String description=  resultSet.getString("description");
    Integer  roomNumber=resultSet.getInt("room_number");

        assertEquals(expectedData.getRoomType(), roomType);
        assertEquals(expectedData.getStatus(), status);
        assertEquals(expectedData.getPrice(), price);
        assertEquals(expectedData.getDescription(), description);
        assertEquals(expectedData.getRoomNumber(), roomNumber);

    }

}
