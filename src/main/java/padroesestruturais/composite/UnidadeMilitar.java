package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class UnidadeMilitar extends Efetivo {

    private List<Efetivo> efetivos;

    public UnidadeMilitar(String descricao) {
        super(descricao);
        this.efetivos = new ArrayList<Efetivo>();
    }

    public void addEfetivo(Efetivo efetivo) {
        this.efetivos.add(efetivo);
    }

    public String getEfetivo() {
        String saida = "";
        saida = "Unidade: " + this.getDescricao() + "\n";
        for (Efetivo efetivo : efetivos) {
            saida += efetivo.getEfetivo();
        }
        return saida;
    }
}
