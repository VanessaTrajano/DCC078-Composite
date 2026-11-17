package org.example;

public class Formulario {
    private ElementoFormulario itemFormulario;

    public void setItemFormulario(ElementoFormulario itemFormulario) {
        this.itemFormulario = itemFormulario;
    }

    public String getItemFormulario() {
        if (this.itemFormulario == null) {
            throw new NullPointerException("Formulário sem itens");
        }
        return this.itemFormulario.getElementoFormulario();
    }
}
