package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mapper.UserMapper;
import pojo.User;

public class test {

	public static void main(String[] args) throws IOException {
		InputStream is =Resources.getResourceAsStream("MybatisConf.xml");
				//使用工厂设计模式
				SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
				//生产 SqlSession
				SqlSession session=factory.openSession();
				
				//----------------------------------------------------------------------
				List<User> list =session.selectList("mapper.UserMapper.selAll");
				System.out.println("查询所有:");
				for (User user : list) {
					System.out.println("	"+user.toString());
				}
				
				//----------------------------------------------------------------------
			    list = session.selectList("mapper.UserMapper.selOne",1);
				for (User user : list) {
					System.out.println("单个查询:"+user.toString());
				}
				
				//----------------------------------------------------------------------
				System.out.println("查询总数:"+session.selectList("mapper.UserMapper.selById"));
				
				//----------------------------------------------------------------------
				int pageSize=2,pageNumber=2;
				Map<String,Object> map = new HashMap<>();
				map.put("pageSize", pageSize);
				map.put("pageStart", pageSize*(pageNumber-1));
				list =session.selectList("mapper.UserMapper.page",map);
				System.out.println("分页查询:");
				for (User user : list) {
					System.out.println("	"+user.toString());
				}
				//----------------------------------------------------------------------
				UserMapper um = session.getMapper(UserMapper.class);
				list = um.selByAccInAccout("李师师", "456");
				
				for (User user : list) {
					System.out.println("多参数查询："+user.toString());
				}
//				Map<Object, Object> map = session.selectMap("mapper.UserMapper.c","name123");
//						System.out.println(map);
				session.close();

	}

}
