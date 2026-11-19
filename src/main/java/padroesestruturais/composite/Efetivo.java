package padroesestruturais.composite;

public abstract class Efetivo {

    private String descricao;

    public Efetivo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getEfetivo();
}
