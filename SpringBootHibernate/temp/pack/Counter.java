package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Counter generated by hbm2java
 */
@Entity
@Table(name = "counter", schema = "public")
public class Counter implements java.io.Serializable {

	private int id;
	private String name;
	private Integer count;

	public Counter() {
	}

	public Counter(int id) {
		this.id = id;
	}

	public Counter(int id, String name, Integer count) {
		this.id = id;
		this.name = name;
		this.count = count;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "count")
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
