package mobile.tests.configs;
import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:local.properties"
})

public interface LocalConfig extends Config {

    @Key("platformName")
    @DefaultValue("android")
    String platformName();

    @Key("deviceName")
    @DefaultValue("Samsung Galaxy S21")
    String deviceName();

    @Key("osVersion")
    @DefaultValue("12.0")
    String osVersion();
}
