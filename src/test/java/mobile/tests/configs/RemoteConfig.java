package mobile.tests.configs;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:remote.properties"
})

public interface RemoteConfig extends Config {

    String username();

    String password();

    @Key("app")
    @DefaultValue("bs://b3a8c2e8fd6c9705ba6c622b7db55ac194c0e36b")
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



