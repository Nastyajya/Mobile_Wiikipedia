package mobile.tests.helpers;
import mobile.tests.configs.RemoteConfig;
import org.aeonbits.owner.ConfigFactory;


import static io.restassured.RestAssured.given;
import static java.lang.String.format;


public class Browserstack {
    static RemoteConfig config = ConfigFactory.create(RemoteConfig.class, System.getProperties());
    public static String getVideoUrl(String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);
        return given()
                .auth().basic(config.login(), config.password())
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");
    }
}



