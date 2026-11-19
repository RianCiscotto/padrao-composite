package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartelTest {

    @Test
    void deveRetornarEfetivoQuartel() {
        UnidadeMilitar pelotao1 = new UnidadeMilitar("1º Pelotão");

        UnidadeMilitar pelotao2 = new UnidadeMilitar("2º Pelotão");
        Militar militar21 = new Militar("Sargento Silva", 12);
        pelotao2.addEfetivo(militar21);

        UnidadeMilitar pelotao3 = new UnidadeMilitar("3º Pelotão");
        Militar militar31 = new Militar("Cabo Souza", 6);
        Militar militar32 = new Militar("Soldado Lima", 2);
        pelotao3.addEfetivo(militar31);
        pelotao3.addEfetivo(militar32);

        UnidadeMilitar batalhao = new UnidadeMilitar("1º Batalhão de Infantaria");
        batalhao.addEfetivo(pelotao1);
        batalhao.addEfetivo(pelotao2);
        batalhao.addEfetivo(pelotao3);

        Quartel quartel = new Quartel();
        quartel.setEfetivo(batalhao);

        assertEquals("Unidade: 1º Batalhão de Infantaria\n" +
                "Unidade: 1º Pelotão\n" +
                "Unidade: 2º Pelotão\n" +
                "Militar: Sargento Silva - tempo de serviço: 12\n" +
                "Unidade: 3º Pelotão\n" +
                "Militar: Cabo Souza - tempo de serviço: 6\n" +
                "Militar: Soldado Lima - tempo de serviço: 2\n", quartel.getEfetivo());
    }

    @Test
    void deveRetornarExecacaoQuartelSemEfetivo() {
        try {
            Quartel quartel = new Quartel();
            quartel.getEfetivo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Quartel sem efetivo", e.getMessage());
        }
    }
}
