package dao;

import model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeRepoImpl implements FakeRepoInterface {
    private  ArrayList<User> db = new ArrayList<>();

    //testing with postman
    @Override
    public User addUser(User user) {
        db.add(new User(user.getName(),user.getSurname(),user.getIdNumber(),UUID.randomUUID()));

        return null;
    }

    @Override
    public List<User> getUsers() {
        return db;
    }

    @Override
    public User deleteUser(UUID accountNumber) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}

