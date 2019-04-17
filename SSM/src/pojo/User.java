package pojo;

public class User {
    private int id;
    private String name;
    private String pwd;
    private Manager manager;
    User(){}
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

	public User(int id, String name, String pwd, Manager manager) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.manager = manager;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", manager=" + manager + "]";
	}
    
}
