package pojo;

import java.util.List;

public class Manager {
	private int id;
	private String name;
	private String pwd;
	private List<User> list;
	public Manager() {}
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public Manager(int id, String name, String pwd, List<User> list) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.list = list;
	}
	@Override
	public String toString() {
		return "manager [id=" + id + ", name=" + name + ", pwd=" + pwd + ", list=" + list + "]";
	}
	
}
