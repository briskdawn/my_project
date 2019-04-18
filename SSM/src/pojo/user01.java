package pojo;

import java.util.Set;

public class user01 {
	private int id;
	private String name;
	
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
	public user01(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "user01 [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
