package br.com.company.reserva.model;

/**
 *
 * @author Roseane
 */
public class Bridgewood implements Hotel {

    private final String nome = "Bridgewood";
    private final int classificacao = 4;
    private final Taxa taxaRegular = new Taxa();
    private final Taxa taxaPremium = new Taxa();

    public Bridgewood() {
        this.taxaRegular.setTaxaFds(60D);
        this.taxaRegular.setTaxaSemana(160D);
        this.taxaPremium.setTaxaFds(50D);
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
