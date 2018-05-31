package com.imooc.model;

public class Student {
	  //属性有 学号、姓名、性别、年龄
	 private String studentNo;
	 private String studentName;
	 private String studentSex;
	 private int studentAge;
	 private Subject studentSubject;
	 //无参数的构造
	 public Student(){
		 
	 }
	 //有参数的构造方法,对学生编号，姓名，性别，年龄四个属性进行赋值
	 public Student(String studentNo,String studentName,String studentSex,int studentAge){
		 this.setStudentAge(studentAge);
		 this.setStudentName(studentName);
		 this.setStudentNo(studentNo);
		 this.setStudentSex(studentSex);
	 }
	 //定义一个5个参数的构造函数，对所以属性进行赋值，最后一个参数为subject对象
	 public Student(String studentNo,String studentName,String studentSex,int studentAge,Subject studentSubject){
		 this.setStudentAge(studentAge);
		 this.setStudentName(studentName);
		 this.setStudentNo(studentNo);
		 this.setStudentSex(studentSex);
		 this.setStudentSubject(studentSubject);
	 }
	 public void setStudentNo(String studentNo){
		 this.studentNo = studentNo;
	 }
    public String getStudentNo(){
    	return this.studentNo;
    }
    public void setStudentName(String studentName){
    	this.studentName = studentName;
    }
    public String getStudentName(){
    	return this.studentName;
    }
    public void setStudentSex(String studentSex){
    	//赋值的时候只能限定为 "男"或者"女" 否则强制限定为"男"
    	if(studentSex.equals("男") || studentSex.equals("女"))
    		this.studentSex = studentSex;    		
    	else
    		this.studentSex = "男";
    }
    public String getStudentSex(){
    	return this.studentSex;
    }
    public void setStudentAge(int studentAge){
    	if(studentAge>=0)
    	{
    	this.studentAge = studentAge;
    	}
    }
    public int getStudentAge(){
    	return this.studentAge;
    }
    public void setStudentSubject(Subject studentSubject){
    	this.studentSubject = studentSubject;  	
    }
    /**
     * 获取专业对象，如果没有实例化，则实例化之后再返回
     * @return  专业对象信息
     */
    public Subject getStudentSubject(){
    	if(this.studentSubject == null)
    		this.studentSubject = new Subject();
    	return this.studentSubject;
    }
    /**
     * 介绍学生相关信息
     * @return 学号，姓名，性别，年龄
     */
    public String introduction(){
    	String str = "" ;
    	str = "学生信息如下：\n"+"学生姓名："+this.getStudentName()+"\n学号："+this.getStudentNo()+
    			"\n学生性别："+this.getStudentSex()+"\n学生年龄："+this.getStudentAge()+"岁"
    			+"\n所学专业："+this.getStudentSubject().getSubjectName()+"\n学制年限"
    			+this.getStudentSubject().getSubjectLife()+"年";
    	return str;
    }
    /**
     * 介绍学生相关信息
     * @param subjectName
     * @param subjectLife
     * @return 学号，姓名，性别，年龄，所学专业名称，学制年限
     */
    public String introduction(String subjectName,int subjectLife){
    	String str = "" ;
    	str = "学生信息如下：\n"+"学生姓名："+this.getStudentName()+"\n学号："+this.getStudentNo()
    	+"\n学生性别："+this.getStudentSex()+"\n学生年龄："+this.getStudentAge()+"岁"
    	+"\n所学专业："+subjectName+"\n学制年限："+subjectLife;
    	return str;
    }
    /**
     * 结束学生相关信息，以subject对象作为参数
     * @param subject
     * @return 学生姓名，学号，性别，年龄，所学专业，学制年限
     */
    public String introduction(Subject subject){
    	String str = "" ;
    	str = "学生信息如下：\n"+"学生姓名："+this.getStudentName()+"\n学号："+this.getStudentNo()
    	+"\n学生性别："+this.getStudentSex()+"\n学生年龄："+this.getStudentAge()+"岁"
    	+"\n所学专业："+subject.getSubjectName()+"\n学制年限："+subject.getSubjectLife();
    	return str;
    }
}
