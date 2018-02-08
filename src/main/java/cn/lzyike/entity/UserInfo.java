package cn.lzyike.entity;

public class UserInfo {
	private int uid;
	private String name;
	private String pwd;
	private int age;
	private String sex;
	private double salary;
	private String address;
	@Override
	public String toString() {
		return "UserInfo [uid=" + uid + ", name=" + name + ", pwd=" + pwd
				+ ", age=" + age + ", sex=" + sex + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	public UserInfo() {
		super();
	}
	public UserInfo(String name, String pwd, int age, String sex,
			double salary, String address) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
		this.address = address;
	}
	public UserInfo(int uid, String name, String pwd, int age, String sex,
			double salary, String address) {
		super();
		this.uid = uid;
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
		this.address = address;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
