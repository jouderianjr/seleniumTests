package br.unifor.testExamples;

import com.sun.tools.javac.util.List;

public class Database {

    public List<User> getAllUsers() {
        return List.of(
                new User("user1", "test"),
                new User("user2", "123"),
                new User("user3", "456")
        );
    }

    public User findUserByUsername (String username) {
        return getAllUsers()
                .stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);

    }
}
