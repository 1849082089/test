package com.bonc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String name;
//	/**
//     * ManyToOne：多对一的配置
//     * cascade(级联)：all(所有)，merge(更新)，refresh(查询)，persistence(保存)，remove(删除)
//     * fetch: eager:立即加载  one的一方默认是立即加载
//     *            lazy:懒加载    many的一方默认是懒加载
//     * optional:是否可选,外键是否允许为空
//     *
//     * JoinColumn:指定外键名
//     *
//     */
//    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},fetch=FetchType.EAGER,optional=false)
//    @JoinColumn(name="classes_class_id")
//    private Classes classes;
	private int classesId;
	
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
//	public Classes getClasses() {
//		return classes;
//	}
//	public void setClasses(Classes classes) {
//		this.classes = classes;
//	}
	public int getClassesId() {
		return classesId;
	}
	public void setClassesId(int classesId) {
		this.classesId = classesId;
	}
   
}
