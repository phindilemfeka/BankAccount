package service;

import model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface UserService {

//    double depositing();
//    double withdrawing();
//    double interestRating();
//    double bankCharging();
//    double invest();

    User insertUser(User user);
    List<User> getPeople();
    User removeUser(UUID accountNumber);
    User updatePerson(User user);



}
