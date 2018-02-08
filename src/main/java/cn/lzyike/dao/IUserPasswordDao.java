package cn.lzyike.dao;

import cn.lzyike.entity.UserPassword;
import cn.lzyike.entity.UserPasswordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserPasswordDao {
    long countByExample(UserPasswordExample example);

    int deleteByExample(UserPasswordExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserPassword record);

    int insertSelective(UserPassword record);

    List<UserPassword> selectByExampleWithBLOBs(UserPasswordExample example);

    List<UserPassword> selectByExample(UserPasswordExample example);

    UserPassword selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserPassword record, @Param("example") UserPasswordExample example);

    int updateByExampleWithBLOBs(@Param("record") UserPassword record, @Param("example") UserPasswordExample example);

    int updateByExample(@Param("record") UserPassword record, @Param("example") UserPasswordExample example);

    int updateByPrimaryKeySelective(UserPassword record);

    int updateByPrimaryKeyWithBLOBs(UserPassword record);

    int updateByPrimaryKey(UserPassword record);
}