package Suites;

import Page.LoginPage;
import core.DriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;







@RunWith(Suite.class)
@SuiteClasses({
        ContaTest.class,
        MovimentacaoTest.class,
        RemoverMovimentacaoContaTest.class,
        SaldoTest.class,
        ResumoTest.class
})

public class SuiteGeral {
    private static LoginPage page = new LoginPage();

    @BeforeClass
    public static void inicializa(){
        page.acessarTelaInicial();

        page.setEmail("wagner@costa");
        page.setSenha("123456");
        page.entrar();
    }

    @AfterClass
    public static void finaliza(){
        DriverFactory.killDriver();
    }
}
