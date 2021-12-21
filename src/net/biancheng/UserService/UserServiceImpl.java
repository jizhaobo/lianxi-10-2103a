package net.biancheng.UserService;

import net.biancheng.po.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(User user) {
        if ("biancheng".equals(user.getName()) && "123456".equals(user.getPwd())){
            return true;
        }
        return false;
    }

    @Override
    public boolean register(User user) {
        if ("biancheng".equals(user.getName()) && "123456".equals(user.getPwd())){
            return true;
        }
        return false;
    }
}
