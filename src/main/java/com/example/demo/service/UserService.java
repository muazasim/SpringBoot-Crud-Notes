package com.example.demo.service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user)
    {
        return repository.save(user);
    }

     public List<User> getAllUser()
    {
        return repository.findAll();
    }
      public User getUserbyId(int id)
    {
        return repository.findById(id).orElse(null);
    }
       public String deleteUser(int id)
    {
        repository.deleteById(id);
        return "User With ID : "+ id + " Deleted !";
    }
    public User updateUser(User user){
        User existingUser = repository.findById(user.getId()).orElse(null);

        existingUser.setUsername(user.getUsername());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
 

        return repository.save(existingUser);

    }
    
}
