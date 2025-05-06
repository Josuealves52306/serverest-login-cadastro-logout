package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;




@DisplayName("Teste de login")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CadastroLogin {

    private static WebDriver driver;

    @BeforeAll

    public static void setUP() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    }

    @BeforeEach
    public void abrirAplicacao() {
        driver.get("https://front.serverest.dev/login");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    @Order(1)
    @DisplayName("Este é seu sistema para administrar seu ecommerce")
    public void cadastroTest() {

        driver.findElement(By.linkText("Cadastre-se")).click();
        driver.findElement(By.id("nome")).click();
        driver.findElement(By.id("nome")).sendKeys("josue0010");
        driver.findElement(By.id("email")).sendKeys("josue0010@gmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("123");

        assertEquals("Cadastrar", driver.findElement(By.cssSelector(".btn-primary")).getText(), "Texto esperado 'Cadastrar com sucesso'");
        driver.findElement(By.cssSelector(".form-check")).click();
        driver.findElement(By.cssSelector(".btn-primary")).click();
        assertEquals("Cadastro realizado com sucesso", driver.findElement(By.cssSelector("a.alert-link")).getText(), "Texto esperado 'Cadastro realizado com sucesso', mas foi exibido outro texto");

    }

    @Test
    @Order(2)
    @DisplayName("Login realizado com sucesso")

    public void testLogin() {

        driver.findElement(By.id("email")).sendKeys("josue0010@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.cssSelector("[data-testid='entrar']")).click();
        assertEquals("Este é seu sistema para administrar seu ecommerce.", driver.findElement(By.cssSelector("p.lead")).getText(), "Texto esperado 'Cadastro realizado com sucesso', mas foi exibido outro texto");


    }

    @Test
    @Order(3)
    @DisplayName("Login")

    public void testLogout(){

        driver.findElement(By.id("email")).sendKeys("josue0010@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.cssSelector("[data-testid='entrar']")).click();


        assertEquals("Este é seu sistema para administrar seu ecommerce.",
                driver.findElement(By.cssSelector("p.lead")).getText());

        driver.findElement(By.cssSelector("[data-testid='logout']")).click();

        Assertions.assertTrue(driver.getCurrentUrl().contains("/login"),
                "Usuário não foi redirecionado para a tela de login");


    }

}






