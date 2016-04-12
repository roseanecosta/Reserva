package br.com.thoughtworks.reserva.model;

/**
 *
 * @author Roseane
 */
public class Taxa {

    private Double taxaFds = 0.0;
    private Double taxaSemana = 0.0;

    public Double getTaxaFds() {
        return taxaFds;
    }

    public void setTaxaFds(Double taxaFds) {
        this.taxaFds = taxaFds;
    }

    public Double getTaxaSemana() {
        return taxaSemana;
    }

    public void setTaxaSemana(Double taxaSemana) {
        this.taxaSemana = taxaSemana;
    }
}
