package com.imooc.test;
import com.imooc.model.*;
public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub1 = new  Subject("�������ѧ�뼼��","J0001",4);
		 System.out.println(sub1.info());
		 System.out.println("==================================================");
		 Student stu1 = new Student("S0001","����","Ů",35,sub1);
		 System.out.println(stu1.introduction());
		 System.out.println("==================================================");
		 Student stu2 = new Student("s0002","����","Ů",36);
		 System.out.println(stu2.introduction("�������ѧ�뼼��",4));
		 System.out.println("==================================================");
		 Student stu3 = new Student("S0003","����","��",33);
		 System.out.println(stu3.introduction(sub1));
		 
				 
	}

	}
