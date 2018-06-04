package com.imooc.model;

public class Subject {
             //��Ա�����У� ѧ�����ơ�ѧ�ơ�ѧ�Ʊ�š�����ѧ����Ϣ������ѧ���ĸ���
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudent;    //����һ��Student��������
	private int studentNum;         //����һ��������רҵ��ѧ������   
	//�޲εĹ��췽��
	public Subject(){
		
	}
	//�������Ĺ��췽��,ʵ�ֶ�רҵ���ƣ�רҵ��ţ�רҵѧ�����Եĸ�ֵ
	public Subject(String subjectName,String subjectNo,int subjectLife){
	this.setSubjectName(subjectName);
	this.setSubjectNo(subjectNo);
	this.setSubjectLife(subjectLife);		
	}
	/*ʵ�ֶ�ȫ�����Եĸ�ֵ��רҵ���ƣ�רҵ��ţ�רҵѧ�ƣ�רҵ��ѧ����Ϣ
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
	 * רҵ���ܵķ���
	 * @return רҵ���ܵ������Ϣ���������ơ���š�ѧ��
	 */
	public String info(){
      String str = "רҵ��Ϣ���£�\nרҵ����:"+this.getSubjectName()+"\nרҵ��ţ�"+this.getSubjectNo()+
				     "\nѧ������:"+this.getSubjectLife()+"��";
		return str;
	}
	/**1����ѧ�����浽������
	 * 2����ѧ���������浽studengNum
	 * @param stu
	 */
	public void addStudent(Student stu){
		//��ѧ�����浽������
		for(int i=0;i<this.getMystudent().length;i++){
			if(this.getMystudent()[i] == null)
			{
				this.getMystudent()[i] = stu;
				//��ѧ��������ŵ�StudentNum��
				this.studentNum = i+1;
				return;
			}
		}
	}
}
