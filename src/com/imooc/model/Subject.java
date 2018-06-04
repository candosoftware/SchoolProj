package com.imooc.model;

public class Subject {
             //成员属性有： 学科名称、学制、学科编号、报名学生信息、报名学生的个数
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudent;    //定义一个Student对象数组
	private int studentNum;         //定义一个报名本专业的学生个数   
	//无参的构造方法
	public Subject(){
		
	}
	//带参数的构造方法,实现对专业名称，专业编号，专业学制属性的赋值
	public Subject(String subjectName,String subjectNo,int subjectLife){
	this.setSubjectName(subjectName);
	this.setSubjectNo(subjectNo);
	this.setSubjectLife(subjectLife);		
	}
	/*实现对全部属性的赋值，专业名称，专业编号，专业学制，专业的学生信息
	 * 
	 */
	public Subject(String subjectName,String subjectNo,int subjectLife,Student[] myStudent){
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
		this.setMystudent(myStudent);
		}
	public void setSubjectName(String subjectName){
		this.subjectName = subjectName;
	}
	public String getSubjectName(){
		return this.subjectName;
	}
	public void setSubjectNo(String subjectNo){
		this.subjectNo = subjectNo;
	}
	public String getSubjectNo(){
		return this.subjectNo;
	}
	public void setSubjectLife(int subjectLife){
		if(subjectLife>0)
		{
		this.subjectLife = subjectLife;
		}
	}
	public int getSubjectLife(){
		return this.subjectLife;
	}
	public void setMystudent(Student[] stu){
		this.myStudent = stu;
	}
	public Student[] getMystudent(){
		if (this.myStudent == null)
				{
			this.myStudent = new Student[200];
						}
		return this.myStudent;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	/**
	 * 专业介绍的方法
	 * @return 专业介绍的相关信息，包括名称、编号、学制
	 */
	public String info(){
      String str = "专业信息如下：\n专业名称:"+this.getSubjectName()+"\n专业编号："+this.getSubjectNo()+
				     "\n学制年限:"+this.getSubjectLife()+"年";
		return str;
	}
	/**1、将学生保存到数组中
	 * 2、将学生个数保存到studengNum
	 * @param stu
	 */
	public void addStudent(Student stu){
		//将学生保存到数组中
		for(int i=0;i<this.getMystudent().length;i++){
			if(this.getMystudent()[i] == null)
			{
				this.getMystudent()[i] = stu;
				//将学生个数存放到StudentNum中
				this.studentNum = i+1;
				return;
			}
		}
	}
}
