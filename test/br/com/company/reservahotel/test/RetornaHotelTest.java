package br.com.company.reservahotel.test;

import br.com.company.reserva.model.Bridgewood;
import br.com.company.reserva.model.Hotel;
import br.com.company.reserva.model.RetornaHotel;
import br.com.company.reserva.model.Ridgewood;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Roseane
 */
public class RetornaHotelTest {

    RetornaHotel retornaHotel;
    Bridgewood bridgewood;
    Ridgewood ridgewood;

    public RetornaHotelTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        retornaHotel = new RetornaHotel();
        bridgewood = new Bridgewood();
        ridgewood = new Ridgewood();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void retornarHotelClienteRegular() throws ParseException {

        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date data1 = (Date) formatter.parse("16/10/2014"); // qui valor: 160
        Date data2 = (Date) formatter.parse("17/10/2014"); // sex valor: 160
        Date data3 = (Date) formatter.parse("18/10/2014");// sab valor: 60
        ArrayList<Date> datas = new ArrayList<Date>();
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);

        assertEquals("Bridgewood", retornaHotel.retornarHotel(datas, "REGULAR"));

    }

    @Test
    public void retornarHotelClientePremium() throws ParseException {

        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date data1 = (Date) formatter.parse("16/10/2014"); // qui valor: 160
        Date data2 = (Date) formatter.parse("17/10/2014"); // sex valor: 160
        Date data3 = (Date) formatter.parse("18/10/2014");// sab valor: 60
        ArrayList<Date> datas = new ArrayList<Date>();
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);

        assertEquals("Ridgewood", retornaHotel.retornarHotel(datas, "PREMIUM"));

    }

    @Test
    public void verificaEmpate() throws ParseException {

        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date data1 = (Date) formatter.parse("01/12/2014"); 
        Date data2 = (Date) formatter.parse("17/10/2014"); // sex valor: 160
        Date data3 = (Date) formatter.parse("18/10/2014");// sab valor: 60
        ArrayList<Date> datas = new ArrayList<Date>();
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);

        assertEquals("Ridgewood", retornaHotel.retornarHotel(datas, "PREMIUM"));

    }


}
