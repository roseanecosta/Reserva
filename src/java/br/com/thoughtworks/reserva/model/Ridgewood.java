package br.com.thoughtworks.reserva.model;

/**
 *
 * @author Roseane
 */
public class Ridgewood implements Hotel {

    private final int classificacao = 5;
    private Taxa taxaRegular = new Taxa();
    private Taxa taxaPremium = new Taxa();
    private final String nome = "Ridgewood";

    public Ridgewood() {
        this.taxaRegular.setTaxaFds(150D);
        this.taxaRegular.setTaxaSemana(220D);
        this.taxaPremium.setTaxaFds(40D);
        this.taxaPremium.setTaxaSemana(110D);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getClassificao() {
        return classificacao;
    }

    @Override
    public Taxa getTaxaPremium() {
        return taxaPremium;
    }

    @Override
    public Taxa getTaxaRegular() {
        return taxaRegular;
    }

}
