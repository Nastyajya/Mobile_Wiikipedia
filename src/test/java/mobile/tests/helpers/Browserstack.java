package mobile.tests.helpers;
import mobile.tests.configs.RemoteConfig;
import org.aeonbits.owner.ConfigFactory;


import static io.restassured.RestAssured.given;


public class Browserstack {
    public static String getVideoUrl(String sessionId) {
        RemoteConfig config = ConfigFactory.create(RemoteConfig.class);

        return given()
                .auth().basic("nastyajyanastyaj_SG57dx", "cEhLXsyeaqGxAbAyQH1s")
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");
    }
}



