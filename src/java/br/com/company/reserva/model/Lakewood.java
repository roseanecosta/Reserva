package br.com.company.reserva.model;

/**
 *
 * @author Roseane
 */
public class Lakewood implements Hotel {

    private final int classificacao = 3;
    private final Taxa taxaRegular = new Taxa();
    private final Taxa taxaPremium = new Taxa();
    private final String nome = "Lakewood";

    public Lakewood() {
        this.taxaRegular.setTaxaFds(350D);
        this.taxaRegular.setTaxaSemana(420D);
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
