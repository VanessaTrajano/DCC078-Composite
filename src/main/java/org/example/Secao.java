package org.example;

import java.util.ArrayList;
import java.util.List;

public class Secao extends ElementoFormulario{
    private List<ElementoFormulario> itens;

    public Secao(String texto) {
        super(texto);
        this.itens = new ArrayList<ElementoFormulario>();
    }

    public void addElementoFormulario(ElementoFormulario conteudo) {
        this.itens.add(conteudo);
    }

    public String getElementoFormulario() {
        String saida = "";
        saida = "Seção: " + this.getTexto() + "\n";
        for (ElementoFormulario conteudo : itens) {
            saida += conteudo.getElementoFormulario();
        }
        return saida;
    }
}
