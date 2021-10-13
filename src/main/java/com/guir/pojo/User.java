package com.guir.pojo;

import javax.persistence.*;

/**
 * Description：
 * Author: Guir
 * Create: 2021/10/13 1:44
 * @Entity：表示实体类
 * @Table(nmae="user")：表示表名
 * 绑定到一起，操作实体类，相当于在操作表
 **/

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private String username;
	private Integer age;
	private String password;
	private String email;
	private String sex;

	public User() {
	}

	public User(Integer id, String username, Integer age, String password, String email, String sex) {
		this.id = id;
		this.username = username;
		this.age = age;
		this.password = password;
		this.email = email;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", age=" + age +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", sex='" + sex + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public Integer getAge() {
		return age;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getSex() {
		return sex;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}