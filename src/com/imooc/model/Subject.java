package com.imooc.model;

public class Subject {
             //成员属性有： 学科名称、学制、学科编号
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	//无参的构造方法
	public Subject(){
		
	}
	//带参数的构造方法,实现对属性的全部赋值
	public Subject(String subjectName,String subjectNo,int subjectLife){
	this.setSubjectName(subjectName);
	this.setSubjectNo(subjectNo);
	this.setSubjectLife(subjectLife);		
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
	/**
	 * 专业介绍的方法
	 * @return 专业介绍的相关信息，包括名称、编号、学制
	 */
	public String info(){
      String str = "专业信息如下：\n专业名称:"+this.getSubjectName()+"\n专业编号："+this.getSubjectNo()+
				     "\n学制年限:"+this.getSubjectLife()+"年";
		return str;
	}
}
