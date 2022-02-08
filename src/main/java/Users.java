import java.util.List;

public interface Users {
    User findByUserName(String username);
    Long insert(User user);
}
