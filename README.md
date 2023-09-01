<h1 >Wikipedia mobile app test automation project

<p align="center">
  <img src="media/Wikipedia-logo.png" alt="Wiki" width="800">
</p>

- <a href="#tools">Stack of technologies</a>
- <a href="#tests">List of checks</a>
- <a href="#run">Running tests from the terminal</a>
- <a href="#jenkins-report">Running tests in Jenkins</a>
- <a href="#remote">Remote running tests</a>
- <a href="#allure-report">Test results report in Allure Report</a>
- <a href="#allure-testops">Integration with Allure TestOps</a>
- <a href="#telegram">Integration with Telegram</a>
<a id="tools"></a>

## :computer: Stack of technologies
<code><img width="5%" title="IntelliJ IDEA" src="media/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="media/logo/Java.svg"></code>
<code><img width="5%" title="Junit5" src="media/logo/Junit5.svg"></code>
<code><img width="5%" title="Gradle" src="media/logo/Gradle.svg"></code>
<code><img width="5%" title="GitHub" src="media/logo/GitHub.svg"></code>
<code><img width="5%" title="Jenkins" src="media/logo/Jenkins.svg"></code>
<code><img width="5%" title="Allure Report" src="media/logo/Allure.svg"></code>
<code><img width="5%" title="Allure TestOps" src="media/logo/Allure_TO.svg"></code>
<code><img width="5%" title="Telegram" src="media/logo/Telegram.svg"></code>
</p>

## Checks carried out:
- [x] Checking if search results are displayed correctly
- [x] Checking if the page is saved
- [x] Checking the addition of a language

<a id="run"></a>
## :computer: Running tests from the terminal
### Running Tests Locally


```bash
gradle clean test
-DtestType=local
```

### Remote running tests

```
gradle clean test  
```

<a id="jenkins-report"></a>
## <img width="4%" title="Jenkins" src="media/logo/Jenkins.svg"> Running tests in [Jenkins](https://jenkins.autotests.cloud/job/Mobile_Wikipedia_Zelenskaia/)

To start assembly click on <code><strong>*Собрать*</strong></code>.

<p align="center">
  <img src="media/screenshots/start_jenkins.png" alt="Jenkins" width="800">
</p>

<a id="allure-report"></a>
## <img width="4%" title="Allure Report" src="media/logo/Allure.svg"> Test results report in [Allure Report](https://jenkins.autotests.cloud/job/Mobile_Wikipedia_Zelenskaia/allure/)

With <code><strong>Jenkins</strong></code> reports are generated in <code><strong>Allure</strong></code>

<p align="center">
  <img src="media/screenshots/rest_report.png" alt="jenkins-allure" width="800">
</p>
<a id="allure-testops"></a>
## <img width="4%" title="Allure TestOPS" src="media/logo/Allure_TO.svg"> Integration with [Allure TestOps](https://allure.autotests.cloud/launch/29400)

<p align="center">
  <img src="media/screenshots/rest__allure.png" alt="testops" width="700">
</p>

### Test-cases

<p align="center">
  <img src="media/screenshots/rest_allure.png" alt="testops" width="700">
</p>


<a id="telegram"></a>
## <img width="4%" title="Telegram" src="media/logo/Telegram.svg"> Telegram notifications using a bot
After passing all the tests, an automatic report is sent to the <code>Telegram</code> messenger

<p align="center">
<img title="Telegram Notifications" src="media//screenshots/telegram_rest.png" width="500">
</p>



 
