package com.chainsys.sample.model;

public class Student {

	private int rollno;
	private String name;
	private Mark mark;
	public Student() {}
	
	public Student(int rollno, String name, Mark mark) {
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
	
	public void showStudDetails() {
		System.out.println("Name :" + this.name);
		System.out.println("Roll no :" + this.rollno);
		System.out.println("Marks :" + this.mark);
	}
	
//		private int id;
//		private String name;
//		private Mark mark;//
//		public Student() {}
//
//		public Student(int id, String name, Mark mark) {
//			super();
//			this.id = id;
//			this.name = name;
//			this.mark = mark;
//		}
//
//		public void show(){
//			System.out.println(id+" "+name);
//			System.out.println(mark);
//		}
}
