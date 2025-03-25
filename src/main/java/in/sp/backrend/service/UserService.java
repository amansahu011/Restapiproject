package in.sp.backrend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import in.sp.backrend.model.User;
import in.sp.backrend.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // ✅ User Insert Karna
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // ✅ Sare Users Fetch Karna
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
