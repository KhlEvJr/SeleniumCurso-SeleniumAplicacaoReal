

import Page.ContasPage;
import Page.MenuPage;
import org.junit.Assert;
import org.junit.Test;
import core.BasePage;



public class ContaTest extends BasePage {

    MenuPage menuPage;
    ContasPage contasPage;

    @Test
    public void testInserirConta()
    {
        menuPage.acessarTelaInserirConta();

        contasPage.setNome("Conta do Teste");
        contasPage.salvar();

        Assert.assertEquals("Conta adcionada com suecesso",contasPage.obterMensagemSucesso());

    }

    @Test
    public void testAlterarConta() {
        menuPage.acessarTelaInserirConta();

        contasPage.clicarAlterarConta("Conta teste");
        contasPage.setNome("Conta do teste alterado");
        contasPage.salvar();

        Assert.assertEquals("Conta alterada com sucesso",contasPage.obterMensagemSucesso());
    }

}
