package dao;

import model.User;

import java.util.List;
import java.util.UUID;

public interface FakeRepoInterface {
//    double deposit(double accountBalance);
//    double withdraw(double accountBalance);
//    double interestRate(double accountBalance,double annualInterestRate);
//    double bankCharges(double accountBalance,double amount);

    User addUser(User user);
    List<User> getUsers();
    User deleteUser(UUID accountNumber);
    User updateUser(User user);
}
