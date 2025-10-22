package tests;

import Page.MenuPage;
import core.BaseTest;
import core.Propriedades;
import org.junit.Assert;
import org.junit.Test;

import Page.ContasPage;



    public class RemoverMovimentacaoContaTest extends BaseTest {

        MenuPage menuPage = new MenuPage();
        ContasPage contasPage = new ContasPage();

        @Test
        public void testExcluirContaComMovimentacao(){
            menuPage.acessarTelaListarConta();

            contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);

            Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
        }
    }

