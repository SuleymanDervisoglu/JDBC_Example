package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.DB_Utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import static utilities.DB_Utils.closeConnection;
import static utilities.DB_Utils.getStatement;

public class StepDefinitions {

    ResultSet resultSet;

    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() {
        DB_Utils.createConnection();
    }
    @Given("DB_US05 Query calistirilir ve sonuclari alinir.")
    public void db_us05_query_calistirilir_ve_sonuclari_alinir() throws SQLException {

            resultSet= getStatement().executeQuery(ConfigReader.getProperty("db_us05Query"));

    }
    @Given("DB_US05 Query sonuclari dogrulanir.")
    public void db_us05_query_sonuclari_dogrulanir() throws SQLException {

        while(resultSet.next()){

            String  motherName= resultSet.getString("mother_name");
            String motherOccupation= resultSet.getString("mother_occupation");

            System.out.println("Mother Name:   "+ motherName +", Mother Occupation:   "+ motherOccupation);

        }
    }
    @Given("Database baglantisi kapatilir.")
    public void database_baglantisi_kapatilir() {
        closeConnection();
    }


    @Given("DB_US08 Query calistirilir ve sonuclari alinir.")
    public void db_us08_query_calistirilir_ve_sonuclari_alinir() {

       String updateQuery= ConfigReader.getProperty("db_us08Query");
       String updateName = ConfigReader.getProperty("updateName");
       String updateID= ConfigReader.getProperty("updateID");

    DB_Utils.updatePrepared(updateQuery, updateName, updateID);

    }
    @Given("DB_US08 Query sonuclari dogrulanir.")
    public void db_us08_query_sonuclari_dogrulanir() {


    }

//////SULEYMAN///////
    @Given("DB_US04 Query calistirilir ve sonuclari alinir.")
    public void db_us04_query_calistirilir_ve_sonuclari_alinir() throws SQLException {
        resultSet= getStatement().executeQuery(ConfigReader.getProperty("db_us04Query"));
    }
    @Given("DB_US04 Query sonuclari dogrulanir.")
    public void db_us04_query_sonuclari_dogrulanir() throws SQLException {
        while(resultSet.next()){

            String  firstname= resultSet.getString("firstname");
            String lastname= resultSet.getString("lastname");

            System.out.println("firstname:   "+ firstname +", lastname:   "+ lastname);

        }
    }

    @Given("DB_US06 Query calistirilir ve sonuclari alinir.")
    public void db_us06_query_calistirilir_ve_sonuclari_alinir() throws SQLException {
        resultSet= getStatement().executeQuery(ConfigReader.getProperty("db_us06Query"));
    }
    @Given("DB_US06 Query sonuclari dogrulanir.")
    public void db_us06_query_sonuclari_dogrulanir() throws SQLException {
        while(resultSet.next()){

            String  roll_no= resultSet.getString("roll_no");

            System.out.println("roll_no:   "+ roll_no);

        }
    }
    @Given("DB_US013 Query calistirilir ve sonuclari alinir.")
    public void db_us013_query_calistirilir_ve_sonuclari_alinir() throws SQLException {
        resultSet= getStatement().executeQuery(ConfigReader.getProperty("db_us13Query"));
    }
    @Given("DB_US013 Query sonuclari dogrulanir.")
    public void db_us013_query_sonuclari_dogrulanir() throws SQLException {
        while(resultSet.next()){

            String  email= resultSet.getString("email");

            System.out.println("email:   "+ email);

        }
    }
    @Given("DB_US026 Query calistirilir ve sonuclari alinir.")
    public void db_us026_query_calistirilir_ve_sonuclari_alinir() throws SQLException {
        resultSet= getStatement().executeQuery(ConfigReader.getProperty("db_us26Query"));
    }
    @Given("DB_US026 Query sonuclari dogrulanir.")
    public void db_us026_query_sonuclari_dogrulanir() throws SQLException {
        while(resultSet.next()){

            String  firstname= resultSet.getString("firstname");
            String  lastname= resultSet.getString("lastname");
            String  addmission_no= resultSet.getString("admission_no");

            System.out.println("firstname:   "+ firstname+" , lastname   " +lastname+" , admission_no  "+addmission_no);

        }
    }



}
