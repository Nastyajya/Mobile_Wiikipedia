package drivers;

import com.codeborne.selenide.WebDriverProvider;
import configs.RemoteConfig;
import lombok.SneakyThrows;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {
    static RemoteConfig config = ConfigFactory.create(RemoteConfig.class, System.getProperties());

    public static URL getBrowserstackUrl() {
        try {
            return new URL(config.baseURL());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @SneakyThrows
    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        RemoteConfig config = ConfigFactory.create(RemoteConfig.class, System.getProperties());
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        mutableCapabilities.setCapability("browserstack.user", "nastyajyanastyaj_SG57dx");
        mutableCapabilities.setCapability("browserstack.key", "cEhLXsyeaqGxAbAyQH1s");

        mutableCapabilities.setCapability("app", config.app());

        mutableCapabilities.setCapability("device", "Google Pixel 3");
        mutableCapabilities.setCapability("os_version", "9.0");

        mutableCapabilities.setCapability("project", "First Java Project");
        mutableCapabilities.setCapability("build", "browserstack-build-3");
        mutableCapabilities.setCapability("browserstack.networkLogs", "true");
        mutableCapabilities.setCapability("name", "first_test");

        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }

}
