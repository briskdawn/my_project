package pojo;

import java.util.Set;

public class user01 {
	private int id;
	private String name;
	private Manager01 manager01;
	public user01() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Manager01 getManager01() {
		return manager01;
	}
	public void setManager01(Manager01 manager01) {
		this.manager01 = manager01;
	}
	
	
	public user01(int id, String name, Manager01 manager01) {
		super();
		this.id = id;
		this.name = name;
		this.manager01 = manager01;
	}
	@Override
	public String toString() {
		return "user01 [id=" + id + ", name=" + name + ", manager01=" + manager01 + "]";
	}
	
	
	

}
