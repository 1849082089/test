package com.bonc.controller;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bonc.entity.Classes;
import com.bonc.entity.Student;
import com.bonc.repository.CLassRepository;
import com.bonc.repository.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	CLassRepository classRepository;
	
//	@RequestMapping("/show")
//	@ResponseBody
//	public String show(){
//		Set stuSet=studentRepository.findByClassId(1);
//		Iterator<Student> it = stuSet.iterator();
//		while(it.hasNext()){
//			Student stu=it.next();
//			System.out.println(stu);
//		}
//		return "index";
//	}
	
	
	@RequestMapping("/test")
	@ResponseBody
	public void test(){
		Classes classes=new Classes();
		classes.setId(1);
		classes.setName("一班");
		List<Student> classList=new ArrayList<Student>();
		Student s1=new Student();
		s1.setId(1);
		s1.setName("张三");
		s1.setClassesId(1);
		Student s2=new Student();
		s2.setId(2);
		s2.setName("李四");
		s2.setClassesId(1);
		Student s3=new Student();
		s3.setId(3);
		s3.setName("小明");
		s3.setClassesId(1);
		classList.add(s1);
		classList.add(s2);
		classList.add(s3);
		classes.setStudent(classList);
		classRepository.save(classes);
	}
	//查询
	@RequestMapping("/t1")
	@ResponseBody
	public Classes t1(){
		Classes classes=classRepository.findOne(1);
		return classes;
	}
	//删除student
	@RequestMapping("/t2")
	@ResponseBody
	public Classes t2(){
		studentRepository.delete(1);
		Classes classes=classRepository.findOne(1);
		return classes;
	}
	//删除classes
	@RequestMapping("/t3")
	@ResponseBody
	public Classes t3(){
		classRepository.delete(1);
		Classes classes=classRepository.findOne(1);
		return classes;
	}
	//修改
	@RequestMapping("/t4")
	@ResponseBody
	public Classes t4(){
		Student stu=studentRepository.findOne(4);
		stu.setName("david");
		studentRepository.save(stu);
		Classes classes=classRepository.findOne(1);
		return classes;
	}
	@RequestMapping("/test1")
	@ResponseBody
	public Classes test1(){
		Student stu=studentRepository.findOne(5);
		if(null!=stu){
			studentRepository.delete(5);
		}
		Student s1=new Student();
		s1.setName("lily");
		s1.setClassesId(1);
		studentRepository.save(s1);
		Classes classes=classRepository.findOne(1);
		return classes;
	}
}
