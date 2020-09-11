package service;

import dao.FakeRepoInterface;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private final FakeRepoInterface fakeRepoInterface;

    @Autowired
    public UserServiceImpl(@Qualifier("fakeDao") FakeRepoInterface fakeRepoInterface) {
        //"fakeDao" -> Be able to differentiate between various implementations.
        this.fakeRepoInterface = fakeRepoInterface;
    }

//    @Override
//    public double depositing() {
//        return fakeRepoInterface.deposit(0.00);
//    }
//
//    @Override
//    public double withdrawing() {
//        return fakeRepoInterface.withdraw(0.00);
//    }
//
//    @Override
//    public double interestRating() {
//        return fakeRepoInterface.interestRate(0.00,10);
//    }
//
//    @Override
//    public double bankCharging() {
//        return fakeRepoInterface.bankCharges(0.00,0);
//    }
//
//    @Override
//    public double invest() {
//        return investmentAccount.investing(0.00,0.00);
//    }

    @Override
    public User insertUser(User user) {
       return fakeRepoInterface.addUser(user);
    }

    @Override
    public List<User> getPeople() {
        return fakeRepoInterface.getUsers();
    }

    @Override
    public User removeUser(UUID accountNumber) {
        return fakeRepoInterface.deleteUser(UUID.randomUUID());
    }

    @Override
    public User updatePerson(User user) {
        return fakeRepoInterface.updateUser(user);
    }
}
