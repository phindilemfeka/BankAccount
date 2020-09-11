package api;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserServiceImpl;

import java.util.List;

@RequestMapping("api/v1/User")
@RestController
public class userController {
    private final UserServiceImpl userServiceImpl;

@Autowired
    public userController(UserServiceImpl userServiceImpl) {
    this.userServiceImpl = userServiceImpl;
    }
//
//@PostMapping
//    public double depositing(User accountBalance) {
//        return userServiceImpl.depositing();
//    }
//
//@PostMapping
//    public double withdrawing(User accountBalance) {
//        return userServiceImpl.withdrawing();
//    }
//
//@PostMapping
//    public void interestRating(User accountBalance) {
//    }
//
//@PostMapping
//    public double bankCharging(User accountBalance, User amount) {
//        return userServiceImpl.bankCharging();
//    }
//
//@PostMapping
//    public double invest(){
//        return userServiceImpl.invest();
//    }

    @PostMapping
    public User insertUser(@RequestBody User user){
        return userServiceImpl.insertUser(user);
    }

    @GetMapping
    public List<User> getPeople(){
        return userServiceImpl.getPeople();
    }
}
