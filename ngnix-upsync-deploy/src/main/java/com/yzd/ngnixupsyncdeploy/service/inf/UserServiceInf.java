package com.yzd.ngnixupsyncdeploy.service.inf;

import com.yzd.ngnixupsyncdeploy.model.User;

import java.util.List;

public interface UserServiceInf {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
