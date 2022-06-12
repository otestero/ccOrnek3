import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import utilities.ConfigReader;
import utilities.Driver;

public class stepDefinations {
    HMCUrlPages hmcUrlPages=new HMCUrlPages();

    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String HMCUrl) {

    }
    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        hmcUrlPages.loginButonu.click();

    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
       hmcUrlPages.usernameKutusu.sendKeys(ConfigReader.getProperties("HMCValidUsername"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
      hmcUrlPages.passwordKutusu.sendKeys(ConfigReader.getProperties("HMCValidPassword"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcUrlPages.login2Butonu.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {

        Assert.assertTrue(hmcUrlPages.addButtonu.isEnabled());
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.getDriver().close();

    }

}
