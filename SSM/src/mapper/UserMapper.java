package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import pojo.User;

public interface UserMapper {
	List<User> selAll();
	List<User> selOne(int i);
	int selById();
	List<User> page(Map m); 
	
    void insert(User u);
    void update(User u);
    void delete(int i);
    
    List<User> selByAccInAccout(String name,String pwd);
    List<User> selByAnotation(@Param("name") String name,@Param("pwd") String pwd);
}
