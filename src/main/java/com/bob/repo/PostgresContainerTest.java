package com.bob.repo;
import org.testng.annotations.Test;
import org.testcontainers.containers.PostgreSQLContainer;

import static org.junit.Assert.assertEquals;

public class PostgresContainerTest {

    @Test
    void testPostgresContainer() {

        try (PostgreSQLContainer
                     postgresContainer = new PostgreSQLContainer<>("postgres:latest")) {
            postgresContainer.start();


            String jdbcUrl = postgresContainer.getJdbcUrl();
            String username = postgresContainer.getUsername();
            String password = postgresContainer.getPassword();

            System.out.println("JDBC URL: " + jdbcUrl);
            System.out.println("User: " + username);
            System.out.println("Password: " + password);

            assertEquals("test", username);
        }
    }
}