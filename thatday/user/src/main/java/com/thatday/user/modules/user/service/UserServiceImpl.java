package com.thatday.user.modules.user.service;

import com.thatday.user.modules.user.dao.UserDao;
import com.thatday.user.modules.user.entity.User;
import com.thatday.user.modules.user.vo.LoginPhoneVo;
import com.thatday.user.modules.user.vo.LoginWeChatVo;
import com.thatday.user.service.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, String, UserDao> implements UserService {

    public User loginByPhone(LoginPhoneVo loginPhoneVo) {
        return null;
    }

    public User loginByWeChat(LoginWeChatVo loginWeChatVo) {
        return null;
    }


    @Override
    public String customDatabaseId() {
        return null;
    }
}
