package com.imooc.model;

public class Subject {
             //��Ա�����У� ѧ�����ơ�ѧ�ơ�ѧ�Ʊ��
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	//�޲εĹ��췽��
	public Subject(){
		
	}
	//�������Ĺ��췽��,ʵ�ֶ����Ե�ȫ����ֵ
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
	 * רҵ���ܵķ���
	 * @return רҵ���ܵ������Ϣ���������ơ���š�ѧ��
	 */
	public String info(){
      String str = "רҵ��Ϣ���£�\nרҵ����:"+this.getSubjectName()+"\nרҵ��ţ�"+this.getSubjectNo()+
				     "\nѧ������:"+this.getSubjectLife()+"��";
		return str;
	}
}
