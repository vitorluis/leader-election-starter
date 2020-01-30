package com.vitorvillar.leaderelection.config;


import com.vitorvillar.leaderelection.services.LeaderElectionService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(LeaderElectionService.class)
public class LeaderElectionAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public LeaderElectionService leaderElectionService() {
        return new LeaderElectionService();
    }
}
