package in.sp.backrend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import in.sp.backrend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
