package br.com.company.reserva.model;

/**
 *
 * @author Roseane
 */
public interface Hotel {

    public String getNome();

    public int getClassificao();

    public Taxa getTaxaPremium();

    public Taxa getTaxaRegular();

}
