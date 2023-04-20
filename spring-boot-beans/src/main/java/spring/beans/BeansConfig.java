package spring.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDateTime;

@Configuration
public class BeansConfig {

    @Bean
    StringBuilder stringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("START");
        return stringBuilder;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    LocalDateTime localDateTimeNow() {
        return LocalDateTime.now();
    }
}
