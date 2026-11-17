package org.example;

public abstract class ElementoFormulario {
    private String texto;

    public ElementoFormulario(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public abstract String getElementoFormulario();
}
