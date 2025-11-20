import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Configuration.pageLoadStrategy;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.pageLoadTimeout;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {

    @BeforeAll
    public static void setup() {
        pageLoadStrategy = "eager"; // не ждем полной загрузки страницы
        Configuration.timeout = 10000; // таймаут 10 сек для загрузки страницы
    }
    @Test
    void successfulSearchTest() {
        //Configuration.holdBrowserOpen = true; // оставляем браузер открытым
        open("https://qa.guru/");
        $(".text-block-14").shouldBe(visible).click();
        switchTo().window(1);
        $(byName("email")).shouldBe(visible).setValue("specialforcross1@gmail.com");
        $(byName("password")).shouldBe(visible).setValue("specialforcross1@gmail.com");
        $("#xdgetr4464_1_1").click();

    }
}