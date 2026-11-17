import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormularioTest {

    @Test
    void deveRetornarEstruturaFormulario() {
        Secao secao1 = new Secao("Dados Pessoais");

        Secao secao2 = new Secao("Contato");
        Pergunta pergunta21 = new Pergunta("E-mail", "text");
        secao2.addElementoFormulario(pergunta21);

        Secao secao3 = new Secao("Endereço");
        Pergunta pergunta31 = new Pergunta("Rua", "text");
        Pergunta pergunta32 = new Pergunta("CEP", "number");
        secao3.addElementoFormulario(pergunta31);
        secao3.addElementoFormulario(pergunta32);

        Secao principal = new Secao("Cadastro de Cliente");
        principal.addElementoFormulario(secao1);
        principal.addElementoFormulario(secao2);
        principal.addElementoFormulario(secao3);

        Formulario formulario = new Formulario();
        formulario.setItemFormulario(principal);

        assertEquals("Seção: Cadastro de Cliente\n" +
                "Seção: Dados Pessoais\n" +
                "Seção: Contato\n" +
                "Tópico: E-mail - tipo: text\n" +
                "Seção: Endereço\n" +
                "Tópico: Rua - tipo: text\n" +
                "Tópico: CEP - tipo: number\n", formulario.getItemFormulario());
    }

    @Test
    void deveRetornarExcecaoFormularioSemItens() {
        try {
            Formulario formulario = new Formulario();
            formulario.getItemFormulario();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Formulário sem itens", e.getMessage());
        }
    }
}