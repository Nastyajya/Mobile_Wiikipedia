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
    @DefaultValue("bs://06bbfdd1b3bc401b7dbfb49bb490bb60be182b63")
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



