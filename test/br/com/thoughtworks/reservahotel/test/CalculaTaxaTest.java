package br.com.thoughtworks.reservahotel.test;

import br.com.thoughtworks.reserva.model.Bridgewood;
import br.com.thoughtworks.reserva.model.Taxa;
import br.com.thoughtworks.reserva.util.CalculaTaxa;
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
public class CalculaTaxaTest {

    Taxa taxa;
    CalculaTaxa calculaTaxa;
    String tipo;
    Bridgewood bridgewood;

    public CalculaTaxaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        taxa = new Taxa();
        calculaTaxa = new CalculaTaxa();
        bridgewood = new Bridgewood();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void retonarTaxaClienteRegular() {

        assertEquals(bridgewood.getTaxaRegular(), calculaTaxa.retonarTaxa("REGULAR", bridgewood));

    }

    @Test
    public void retonarTaxaClientePremium() {

        assertEquals(bridgewood.getTaxaPremium(), calculaTaxa.retonarTaxa("PREMIUM", bridgewood));
    }

    @Test
    public void defineTaxaSemana() throws ParseException {

        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date data = (Date) formatter.parse("17/10/2014");

        assertEquals(taxa.getTaxaSemana(), calculaTaxa.defineTaxa(data, taxa));
    }

    @Test
    public void defineTaxaFds() throws ParseException {

        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date data = (Date) formatter.parse("18/10/2014");

        assertEquals(taxa.getTaxaFds(), calculaTaxa.defineTaxa(data, taxa));
    }

    @Test
    public void calcularTaxasRegular() throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");

        Date data1 = (Date) formatter.parse("16/10/2014"); // qui valor: 160
        Date data2 = (Date) formatter.parse("17/10/2014"); // sex valor: 160
        Date data3 = (Date) formatter.parse("18/10/2014");// sab valor: 60
        ArrayList<Date> datas = new ArrayList<Date>();
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);
        Double total = 380D;
        assertEquals(total, calculaTaxa.calcularTaxa(datas, bridgewood, "REGULAR"));

    }

    @Test
    public void calcularTaxasPremium() throws ParseException {

        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");

        Date data1 = (Date) formatter.parse("16/10/2014"); // qui  valor: 110
        Date data2 = (Date) formatter.parse("17/10/2014"); // sex valor: 110
        Date data3 = (Date) formatter.parse("18/10/2014");// sab  valor: 50
        ArrayList<Date> datas = new ArrayList<Date>();
        datas.add(data1);
        datas.add(data2);
        datas.add(data3);

        Double total = 270D;

        assertEquals(total, calculaTaxa.calcularTaxa(datas, bridgewood, "PRIMIUM"));

    }

}
