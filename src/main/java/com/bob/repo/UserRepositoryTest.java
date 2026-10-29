package com.bob.repo;

import com.bob.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {

        User user = new User();
        user.setName("Test name");

        User savedUser = userRepository.save(user);

        assertNotNull(savedUser.getId());
        assertEquals("Test User", savedUser.getName());
    }
}
