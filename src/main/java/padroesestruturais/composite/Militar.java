package padroesestruturais.composite;

public class Militar extends Efetivo {

    private int tempoServico;

    public Militar(String descricao, int tempoServico) {
        super(descricao);
        this.tempoServico = tempoServico;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public String getEfetivo() {
        return "Militar: " + this.getDescricao() + " - tempo de serviço: " + this.tempoServico + "\n";
    }

}
