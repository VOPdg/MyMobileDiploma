package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:local.properties"
})
public interface LocalConfig extends Config {
    @DefaultValue("http://localhost:4723/wd/hub")
    String url();

    @DefaultValue("Android")
    String platformName();

    @DefaultValue("Pixel 4 API 30")
    String deviceName();

    @DefaultValue("11.0")
    String platformVersion();
}
