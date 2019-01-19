package ua.com.qqq.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.qqq.models.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
