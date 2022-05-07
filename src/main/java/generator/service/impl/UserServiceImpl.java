package generator.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import generator.domain.User;
import generator.service.UserService;
import generator.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 16267
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-05-07 10:39:00
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}
