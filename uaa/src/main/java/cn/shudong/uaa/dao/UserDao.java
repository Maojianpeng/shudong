package cn.shudong.uaa.dao;

import cn.shudong.uaa.pojo.po.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * 用户 dao
 * @author zhouqi
 * @date 2020/8/24 13:38
 * @version v1.0.0
 * @Description
 *
 */
@Repository
public interface UserDao extends BaseMapper<User> {


}
