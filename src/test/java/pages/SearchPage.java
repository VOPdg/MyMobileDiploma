package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    SelenideElement searchContainer = $(AppiumBy.id("org.wikipedia.alpha:id/search_container"));
    SelenideElement searchCard = $(AppiumBy.id("org.wikipedia.alpha:id/search_card"));
    SelenideElement searchField = $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"));
    SelenideElement welcomeText = $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_text"));
    SelenideElement savedArticle = $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_reading_lists"));
    SelenideElement saveArticleButton = $(AppiumBy.id("org.wikipedia.alpha:id/page_save"));
    SelenideElement descriptionSavedArticle = $(AppiumBy.id("org.wikipedia.alpha:id/item_reading_list_statistical_description"));
    ElementsCollection articleList = $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"));
    SelenideElement searchTab = $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_search"));
    SelenideElement emptyHistoryTitle = $(AppiumBy.id("org.wikipedia.alpha:id/history_empty_title"));

    @Step("Search article")
    public SearchPage searchArticle(String value) {
        searchContainer.click();
        searchField.sendKeys(value);
        return this;
    }

    @Step("Verify content found")
    public SearchPage checkCountArticle() {
        articleList.shouldHave(CollectionCondition.sizeGreaterThan(0));
        return this;
    }

    @Step("Open article")
    public SearchPage openArticle() {
        articleList.get(0).click();
        return this;
    }

    @Step("Save article")
    public SearchPage saveArticle() {
        saveArticleButton.click();
        return this;
    }

    @Step("Check article text")
    public SearchPage checkArticleText(String value){
        articleList.get(0).shouldHave(text(value));
        return this;
    }

    @Step("Check welcome page")
    public SearchPage checkWelcomeText() {
        welcomeText.shouldHave(text("Customize your Explore feed You can now choose what to show on your feed"));
        return this;
    }

    @Step("Open saved article")
    public SearchPage openSavedArticle() {
        savedArticle.click();
        return this;
    }

    @Step("Check content from saved article")
    public SearchPage checkDecriptionSavedArticle(String value) {
        descriptionSavedArticle.shouldHave(text(value));
        return this;
    }

    @Step("Return to Search page")
    public SearchPage returnToSearchPage() {
        back();
        back();
        back();
        return this;
    }

    @Step("Open search card")
    public SearchPage openSearchCard(){
        searchCard.click();
        return this;
    }

    @Step("Check history is empty")
    public SearchPage checkEmptyHistory(){
        searchTab.click();
        emptyHistoryTitle.shouldHave(text("No recently viewed articles"));
        return this;
    }
}
