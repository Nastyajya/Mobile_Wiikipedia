package mobile.tests.tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WikiTests extends TestBase {
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
    void savedItemTest() {
        back();
        step("Сlick on the search bar", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
        });
        step("Enter Perseids", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Perseids");
        });
        step("Go to first result", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
        });
        step("Add to saved and return to the main page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/page_save")).click();
            back();
            $(AppiumBy.className("android.widget.ImageButton")).click();
        });
        step("Go to saved", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_reading_lists")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/item_image_1")).click();
        });

        step("Make sure the page is saved and the title is displayed correctly", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/buttonView")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(text("Perseids"));
        });
    }
        @Test
        void addLanguageTest () {
            back();
            step("Сlick on the search bar", () -> {
                $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            });
            step("Go to language change tab", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_lang_button")).click();
            $(AppiumBy.className("android.widget.ImageView")).click();
            });
            step("Select language", () -> {
            $$(AppiumBy.id("org.wikipedia.alpha:id/localized_language_name")).findBy(text("Français")).click();
            });
            step("Make sure the selected language is added", () -> {
            $$(AppiumBy.className("android.widget.TextView")).findBy(text("Français")).shouldBe(visible);
            });
    }
    }

