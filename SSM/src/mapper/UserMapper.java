package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pojo.User;

public interface UserMapper {
	@Select("select * from user")
	List<User> selAll();
	
	List<User> selOne(int i);
	int selById();
	List<User> page(Map m); 
	
	
    
    List<User> selByAccInAccout(String name,String pwd);
    List<User> selByAnotation(@Param("name") String name,@Param("pwd") String pwd);
}
