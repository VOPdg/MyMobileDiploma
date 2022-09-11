# Автоматизация тестирования android-приложения  "Wikipedia"

<p align="center">
<img title="Wiki img" src="images/picture/gettyimages-1235659297_custom-1ac40115b6832166e561a5c258236e703b6684a1.jpeg">
</p> 
<a target="_blank" href="https://github.com/wikimedia/apps-android-wikipedia/releases">Ссылка на репозиторий приложения</a>

## :page_with_curl: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#keyboard-запуск-из-терминала">Запуск из терминала</a>
- <a href="#robot-сборки-в-Jenkins">Сборка в Jenkins</a>
- <a href="#classical_building-отчет-browserstack">Отчет BrowserStack</a>
- <a href="#bar_chart-allure-отчет">Allure отчет</a>
- <a href="#hammer-Allure-Test-Ops-отчет">Allure Test Ops отчет</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_projector-видео-пример-прохождения-тестов">Видео пример прохождения тестов</a>

## :computer: Технологии и инструменты

<p align="center">
<img width="8%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="8%" title="Java" src="images/logo/Java.svg">
<img width="8%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="8%" title="Selenide" src="images/logo/Selenide.svg">
<img width="8%" title="Gradle" src="images/logo/Gradle.svg">
<img width="8%" title="GitHub" src="images/logo/GitHub.svg">
<img width="8%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="8%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="8%" title="Allure TestOps" src="images/logo/AllureTestOps.svg">
<img width="8%" title="Telegram" src="images/logo/Telegram.svg">
<img width="8%" title="Telegram" src="images/logo/appium.svg">
</p>

## :keyboard: Запуск из терминала

Локальный запуск:

```
gradle clean test -Dhost=local
```

Запуск в Jenkins:

```
gradle clean test -Dhost=browserstack
```

## :robot: Сборки в Jenkins

### <a target="_blank" href="https://jenkins.autotests.cloud/job/qa_guru_Jenkinsjob_MyMobileDiploma/">Параметризированная сборка в Jenkins со всеми тестами</a>

<p align="center">
<img title="Jenkins Job" src="images/screenshots/Screenshot 2022-09-11 at 19.11.44.png">
</p>

## :gear: Запуск тестов с выбором параметров

<p align="center">
<img title="Jenkins Job Run with parameters" src="images/screenshots/Screenshot 2022-09-11 at 19.21.17.png">
</p>

## :classical_building: Отчет BrowserStack

<p align="center">
<img title="BrowserStack" src="images/screenshots/Screenshot 2022-09-11 at 19.27.06.png">
</p>

## :bar_chart: Allure отчет

- ### Главный экран отчета

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/Screenshot 2022-09-11 at 19.28.41.png">
</p>

- ### Страница с проведенными тестами

<p align="center">
<img title="Allure Test Page" src="images/screenshots/Screenshot 2022-09-11 at 19.30.04.png">
</p>

## :hammer: Allure Test Ops отчет

<p align="center">
<img title="Allure Test Ops Launch" src="images/screenshots/Screenshot 2022-09-11 at 19.32.19.png">
</p>

## :robot: Отчет в Telegram

- ### Telegram notification message (all results)

<p align="center">
<img title="Telegram notification message" src="images/screenshots/Screenshot 2022-09-11 at 19.36.35.png">
</p>

## :film_projector: Видео пример прохождения тестов

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/ezgif.com-gif-maker (1).gif">
</p>
