package com.bob.test;

import org.testng.annotations.Test;
import org.testcontainers.containers.PostgreSQLContainer;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PostgresTest {

    @Test
    public void testPostgresContainer() {
        // Создаём PostgreSQL контейнер
        try (PostgreSQLContainer
                     postgres = new PostgreSQLContainer<>("postgres:15.1")) {
            postgres.start();

            assertNotNull(postgres.getJdbcUrl());
            System.out.println("PostgreSQL запущен на " + postgres.getJdbcUrl());
        }
    }
}
