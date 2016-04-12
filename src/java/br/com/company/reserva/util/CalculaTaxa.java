package br.com.company.reserva.util;

import br.com.company.reserva.model.Hotel;
import br.com.company.reserva.model.Taxa;
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

    private Double defineTaxa(Date data, Taxa taxa) {

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

        for (Date dia : datas) { //define taxa se é dia de semana 
                                 //soma as taxas e retorna de acordo com o tipo de cliente
            total += defineTaxa(dia, retonarTaxa(tipoCliente, hotel));
        }
       
       return total;
    }
    


}
