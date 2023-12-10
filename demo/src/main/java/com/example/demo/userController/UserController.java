package com.example.demo.userController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.User;
import com.example.demo.userRepo.UserRepo;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired
  private UserRepo userRepo;

  @GetMapping("/")
  public List<User> getAllUser() {
    return userRepo.findAll();
  }

  @GetMapping("/{id}")
  public User getUserById(@PathVariable Long id) {
    return userRepo.findById(id).get();
  }

  @PostMapping("/")
  public User createUser(@RequestBody User user) {
    return userRepo.save(user);
  }

  @PutMapping("/{id}")
  public User updateUserById(@PathVariable Long id, @RequestBody User user) {
    User exiUser = userRepo.findById(id).get();
    exiUser.setName(user.getName());
    exiUser.setEmail(user.getEmail());
    return userRepo.save(exiUser);
  }

  @DeleteMapping("/id")
  public String deleteUserById(@PathVariable Long id) {
    try {
      userRepo.deleteById(id);
      return "User deleted";
    } catch (Exception e) {
      return e.getMessage();
    }
  }
}
