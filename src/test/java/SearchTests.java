import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Configuration.pageLoadStrategy;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {

    @BeforeAll
    public static void setup() {
        pageLoadStrategy = "eager"; // не ждем полной загрузки страницы
    }
    @Test
    void successfulSearchTest() {
        open("https://qa.guru/");
        $(".text-block-14").shouldBe(visible).click();



    }
}