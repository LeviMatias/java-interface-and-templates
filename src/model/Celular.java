package model;

public class Celular implements Precedable<Celular> {

    private String titular;
    private int numero;

    public Celular(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public int precedeA(Celular celular) {
        return (this.numero < celular.getNumero()) ? 1 : 0;
    }
}
