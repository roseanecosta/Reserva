package br.com.thoughtworks.reserva.model;

/**
 *
 * @author Roseane
 */
public class Lakewood implements Hotel {

    private final int classificacao = 3;
    private Taxa taxaRegular = new Taxa();
    private Taxa taxaPremium = new Taxa();
    private final String nome = "Lakewood";

    public Lakewood() {
        this.taxaRegular.setTaxaFds(90D);
        this.taxaRegular.setTaxaSemana(110D);
        this.taxaPremium.setTaxaFds(80D);
        this.taxaPremium.setTaxaSemana(80D);
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
