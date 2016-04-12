package br.com.thoughtworks.reserva.util;

import br.com.thoughtworks.reserva.model.Hotel;
import br.com.thoughtworks.reserva.model.Taxa;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Roseane
 */
public class CalculaTaxa {

    public Taxa retonarTaxa(String tipo, Hotel hotel) {

        if (tipo.equals("REGULAR")) {
            return hotel.getTaxaRegular();
        } else {
            return hotel.getTaxaPremium();
        }

    }

    public Double defineTaxa(Date data, Taxa taxa) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        int dia = cal.get(Calendar.DAY_OF_WEEK);

        if (dia == 7 || dia == 1) {
            return taxa.getTaxaFds();
        } else {
            return taxa.getTaxaSemana();
        }
    }

    public Double calcularTaxa(List<Date> datas, Hotel hotel, String tipoCliente) {

        Double total = 0D;

        for (Date dia : datas) {
            total += defineTaxa(dia, retonarTaxa(tipoCliente, hotel));
        }

        return total;
    }

}
