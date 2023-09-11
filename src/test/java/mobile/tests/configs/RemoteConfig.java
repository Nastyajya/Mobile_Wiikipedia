package mobile.tests.configs;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:remote.properties",
        "classpath:browserstack_credentials.properties"
})

public interface RemoteConfig extends Config {
    @Key("login")
    String login();

    @Key("password")
    String password();

    @Key("app")
    @DefaultValue("bs://5fa8f217888f854c02af03a318a102227aa2750b")
    String getApp();

    @Key("deviceName")
    @DefaultValue("Google Pixel 5")
    String getDeviceName();

    @Key("version")
    @DefaultValue("12.0")
    String getVersion();

    @Key("baseURL")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String getRemoteWebDriver();

}



