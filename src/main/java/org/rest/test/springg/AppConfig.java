package org.rest.test.springg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Autowired
    private EnvDetails envDetails;

    @Bean
    @Profile("dev")
    public EnvDetails devService() {
        System.out.println("as");
        return envDetails;
    }

    @Bean
    @Profile("test")
    public EnvDetails testService() {
        return envDetails;
    }

    @Bean
    @Profile("prod")
    public EnvDetails prodService() {
        return envDetails;
    }
}
