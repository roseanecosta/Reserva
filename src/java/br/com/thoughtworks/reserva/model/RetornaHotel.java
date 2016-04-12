package br.com.thoughtworks.reserva.model;

import br.com.thoughtworks.reserva.util.CalculaTaxa;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Roseane
 */
public class RetornaHotel {

    CalculaTaxa calculo;

    public String retornarHotel(ArrayList<Date> datas, String tipoCliente) {

        Bridgewood bw = new Bridgewood();
        Lakewood lw = new Lakewood();
        Ridgewood rw = new Ridgewood();
        String hotelIndicado = "";
        CalculaTaxa calculo = new CalculaTaxa();
        ArrayList<Hotel> hoteis = new ArrayList<Hotel>();

        double valorBridgewood = calculo.calcularTaxa(datas, new Bridgewood(), tipoCliente);
        double valorLakewood = calculo.calcularTaxa(datas, new Lakewood(), tipoCliente);
        double valorRidgewood = calculo.calcularTaxa(datas, new Ridgewood(), tipoCliente);

        if (valorBridgewood < valorLakewood || valorBridgewood < valorRidgewood) {
            hoteis.add(bw);
        }

        if (valorLakewood < valorRidgewood || valorLakewood < valorBridgewood) {
            hoteis.add(lw);

        }
        if (valorRidgewood < valorBridgewood || valorRidgewood < valorLakewood) {
            hoteis.add(rw);

        } 
        if (hoteis.size() == 2) {
            hotelIndicado = retornarClassificacao(hoteis);
        }

        return hotelIndicado;
    }

    public String retornarClassificacao(ArrayList<Hotel> hoteis) {

        String maiorClassificacao = "";
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
