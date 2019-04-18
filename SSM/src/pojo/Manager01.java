package pojo;

public class Manager01 {
	private int id;
	private String name;
	public Manager01 () {}
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
	@Override
	public String toString() {
		return "Manager01 [id=" + id + ", name=" + name + "]";
	}
	public Manager01(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
