package dao;
import entities.User;
import java.util.List;

public interface UserDAO {
    void add(User u);
    List<User> findAll();
}
