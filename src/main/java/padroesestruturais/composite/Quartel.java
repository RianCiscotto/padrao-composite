package padroesestruturais.composite;

public class Quartel {

    private Efetivo efetivo;

    public void setEfetivo(Efetivo efetivo) {
        this.efetivo = efetivo;
    }

    public String getEfetivo() {
        if (this.efetivo == null) {
            throw new NullPointerException("Quartel sem efetivo");
        }
        return this.efetivo.getEfetivo();
    }
}
