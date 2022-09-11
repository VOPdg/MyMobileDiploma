package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;

public class OnBoardingPage {
    SelenideElement nextButton = $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));
    SelenideElement textView = $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"));

    @Step("Check text on page")
    public OnBoardingPage checkText(String value) {
        textView.shouldHave(text(value));
        return this;
    }

    @Step("Next page click")
    public OnBoardingPage openNextPage() {
        nextButton.click();
        return this;
    }

    public OnBoardingPage skip() {
        back();
        return this;
    }
}
