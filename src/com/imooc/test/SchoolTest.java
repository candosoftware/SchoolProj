package com.imooc.test;
import com.imooc.model.*;
public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub1 = new  Subject("计算机科学与技术","J0001",4);
		 System.out.println(sub1.info());
		 System.out.println("==================================================");
		 Student stu1 = new Student("S0001","李明","女",35,sub1);
		 System.out.println(stu1.introduction());
		 System.out.println("==================================================");
		 Student stu2 = new Student("s0002","王丽","女",36);
		 System.out.println(stu2.introduction("计算机科学与技术",4));
		 System.out.println("==================================================");
		 Student stu3 = new Student("S0003","张四","男",33);
		 System.out.println(stu3.introduction(sub1));
		 System.out.println("==================================================");
		 //测试指定专业中有几个学生
		 sub1.addStudent(stu1);
		 sub1.addStudent(stu2);
		 sub1.addStudent(stu3);
		 System.out.print(sub1.getSubjectName()+"专业,共有 "+sub1.getStudentNum()+" 个学生报读");			 
	}

	}
