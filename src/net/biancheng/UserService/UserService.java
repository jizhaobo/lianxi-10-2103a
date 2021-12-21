package net.biancheng.UserService;

import net.biancheng.po.User;

public interface UserService {
    boolean login(User user);
    boolean register(User user);
}
