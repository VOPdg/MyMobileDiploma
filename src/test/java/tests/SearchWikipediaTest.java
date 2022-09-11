package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("android")
public class SearchWikipediaTest extends TestBase {
    @Test
    @DisplayName("Check search history")
    void welcomeTest() {
        onBoardingPage.skip();
        searchPage.checkWelcomeText();
    }

    @Test
    @DisplayName("Search article")
    void searchTest() {
        onBoardingPage.skip();
        searchPage.checkWelcomeText()
                .searchArticle("Portugal")
                .checkCountArticle()
                .openArticle();
    }

    @Test
    @DisplayName("Save article")
    void saveTest() {
        onBoardingPage.skip();
        searchPage.checkWelcomeText()
                .searchArticle("Portugal")
                .checkCountArticle()
                .openArticle()
                .saveArticle()
                .returnToSearchPage()
                .openSavedArticle()
                .checkDecriptionSavedArticle("1 article");
    }

    @Test
    @DisplayName("Check onboarding page")
    void onBoardingTest() {
        onBoardingPage
                .checkText("The Free Encyclopedia …in over 300 languages")
                .openNextPage()
                .checkText("New ways to explore")
                .openNextPage()
                .checkText("Reading lists with sync")
                .openNextPage()
                .checkText("Send anonymous data");
    }

    @Test
    @DisplayName("Check search history")
    void historyTest() {
        onBoardingPage.skip();
        searchPage.checkEmptyHistory()
                .openSearchCard()
                .searchArticle("Portugal")
                .checkCountArticle()
                .openArticle()
                .returnToSearchPage()
                .checkArticleText("Portugal");
    }
}
