package mobile.tests.tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WikiTests extends TestBase{
    @Test
    void searchMatchingTest() {
        back();
        step("Сlick on the search bar", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
        });
            step("Enter the name of the city", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Huanghua");
        });
        step("The result must match the search", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(text("Huanghua")));

}
 @Test
    void test(){

 }

}

