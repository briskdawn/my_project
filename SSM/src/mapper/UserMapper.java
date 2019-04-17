package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import pojo.User;

public interface UserMapper {
	List<User> selAll();
	List<User> selOne(int i);
	int selById();
	List<User> page(Map m); 
	
	@Insert("insert into user value(default,#{name},#{pwd},#{mid}")
    void insert(User u);
	@Update("update user set mid=#{mid} where id=#{id}")
    void update(User u);
	@Delete("delete from user where id=#{id}")
    void delete(int i);
    
    List<User> selByAccInAccout(String name,String pwd);
    List<User> selByAnotation(@Param("name") String name,@Param("pwd") String pwd);
}
