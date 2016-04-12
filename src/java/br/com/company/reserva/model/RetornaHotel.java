package br.com.company.reserva.model;

import br.com.company.reserva.util.CalculaTaxa;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Roseane
 */
public class RetornaHotel {

    public String retornarHotel(ArrayList<Date> datas, String tipoCliente) {

        Bridgewood bw = new Bridgewood();
        Lakewood lw = new Lakewood();
        Ridgewood rw = new Ridgewood();

        String hotelIndicado;
        CalculaTaxa calculo = new CalculaTaxa();
        ArrayList<Hotel> hoteis = new ArrayList<Hotel>();
       

        double valorBridgewood = calculo.calcularTaxa(datas, bw, tipoCliente);
        double valorLakewood = calculo.calcularTaxa(datas, lw, tipoCliente);
        double valorRidgewood = calculo.calcularTaxa(datas, rw, tipoCliente);
        
     //Refafotar URGENTE
        if (valorBridgewood <= valorLakewood && valorBridgewood <= valorRidgewood) {
            hoteis.add(bw); 
        }

        if (valorLakewood <= valorRidgewood && valorLakewood <= valorBridgewood) {
            hoteis.add(lw);

        }
        if (valorRidgewood <= valorBridgewood && valorRidgewood <= valorLakewood) {
            hoteis.add(rw);

        }
          if (hoteis.size() == 2) { //verifica empate
                hotelIndicado = retornarClassificacao(hoteis);
            } else {
                hotelIndicado = hoteis.get(0).getNome();
           }

        return hotelIndicado;
    }

    private String retornarClassificacao(ArrayList<Hotel> hoteis) {

        String maiorClassificacao;
        Hotel hotel1 = hoteis.get(0);
        Hotel hotel2 = hoteis.get(1);

        if (hotel1.getClassificao() > hotel2.getClassificao()) {

            maiorClassificacao = hotel1.getNome();

        } else {
            maiorClassificacao = hotel2.getNome();
        }

        return maiorClassificacao;

    }

}
