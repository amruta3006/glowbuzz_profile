package com.globant.glowbuzz.profile.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.globant.glowbuzz.profile")
public class MongoDbConfig {

}
