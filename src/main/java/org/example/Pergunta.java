package org.example;

public class Pergunta extends ElementoFormulario{
    private String tipoInput;

    public Pergunta(String texto, String tipoInput) {
        super(texto);
        this.tipoInput = tipoInput;
    }

    public String getTipoInput() {
        return tipoInput;
    }

    public void setTipoInput(String tipoInput) {
        this.tipoInput = tipoInput;
    }

    public String getElementoFormulario() {
        return "Tópico: " + this.getTexto() + " - tipo: " + this.tipoInput + "\n";
    }
}
