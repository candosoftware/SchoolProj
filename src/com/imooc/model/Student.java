package com.imooc.model;

public class Student {
	  //������ ѧ�š��������Ա�����
	 private String studentNo;
	 private String studentName;
	 private String studentSex;
	 private int studentAge;
	 private Subject studentSubject;
	 //�޲����Ĺ���
	 public Student(){
		 
	 }
	 //�в����Ĺ��췽��,��ѧ����ţ��������Ա������ĸ����Խ��и�ֵ
	 public Student(String studentNo,String studentName,String studentSex,int studentAge){
		 this.setStudentAge(studentAge);
		 this.setStudentName(studentName);
		 this.setStudentNo(studentNo);
		 this.setStudentSex(studentSex);
	 }
	 //����һ��5�������Ĺ��캯�������������Խ��и�ֵ�����һ������Ϊsubject����
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
    	//��ֵ��ʱ��ֻ���޶�Ϊ "��"����"Ů" ����ǿ���޶�Ϊ"��"
    	if(studentSex.equals("��") || studentSex.equals("Ů"))
    		this.studentSex = studentSex;    		
    	else
    		this.studentSex = "��";
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
     * ��ȡרҵ�������û��ʵ��������ʵ����֮���ٷ���
     * @return  רҵ������Ϣ
     */
    public Subject getStudentSubject(){
    	if(this.studentSubject == null)
    		this.studentSubject = new Subject();
    	return this.studentSubject;
    }
    /**
     * ����ѧ�������Ϣ
     * @return ѧ�ţ��������Ա�����
     */
    public String introduction(){
    	String str = "" ;
    	str = "ѧ����Ϣ���£�\n"+"ѧ��������"+this.getStudentName()+"\nѧ�ţ�"+this.getStudentNo()+
    			"\nѧ���Ա�"+this.getStudentSex()+"\nѧ�����䣺"+this.getStudentAge()+"��"
    			+"\n��ѧרҵ��"+this.getStudentSubject().getSubjectName()+"\nѧ������"
    			+this.getStudentSubject().getSubjectLife()+"��";
    	return str;
    }
    /**
     * ����ѧ�������Ϣ
     * @param subjectName
     * @param subjectLife
     * @return ѧ�ţ��������Ա����䣬��ѧרҵ���ƣ�ѧ������
     */
    public String introduction(String subjectName,int subjectLife){
    	String str = "" ;
    	str = "ѧ����Ϣ���£�\n"+"ѧ��������"+this.getStudentName()+"\nѧ�ţ�"+this.getStudentNo()
    	+"\nѧ���Ա�"+this.getStudentSex()+"\nѧ�����䣺"+this.getStudentAge()+"��"
    	+"\n��ѧרҵ��"+subjectName+"\nѧ�����ޣ�"+subjectLife;
    	return str;
    }
    /**
     * ����ѧ�������Ϣ����subject������Ϊ����
     * @param subject
     * @return ѧ��������ѧ�ţ��Ա����䣬��ѧרҵ��ѧ������
     */
    public String introduction(Subject subject){
    	String str = "" ;
    	str = "ѧ����Ϣ���£�\n"+"ѧ��������"+this.getStudentName()+"\nѧ�ţ�"+this.getStudentNo()
    	+"\nѧ���Ա�"+this.getStudentSex()+"\nѧ�����䣺"+this.getStudentAge()+"��"
    	+"\n��ѧרҵ��"+subject.getSubjectName()+"\nѧ�����ޣ�"+subject.getSubjectLife();
    	return str;
    }
}
