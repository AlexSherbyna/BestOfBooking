package com.bob.test;

import com.bob.entity.User;
import com.bob.repo.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {
        // Сохраняем нового пользователя
        User user = new User();
        user.setName("John Doe");
        User savedUser = userRepository.save(user);

        // Проверяем, что пользователь сохранился
        assertEquals("John Doe", savedUser.getName());
    }
}
