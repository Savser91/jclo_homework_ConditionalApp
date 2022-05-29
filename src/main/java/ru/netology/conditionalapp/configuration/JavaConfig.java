package ru.netology.conditionalapp.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.conditionalapp.profile.DevProfile;
import ru.netology.conditionalapp.profile.ProductionProfile;
import ru.netology.conditionalapp.profile.SystemProfile;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
