package com.oh29oh29.jpa.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackages = ["com.oh29oh29.jpa"])
class JpaConfig