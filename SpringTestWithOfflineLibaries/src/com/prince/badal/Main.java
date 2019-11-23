package com.prince.badal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = context.getBean(Student.class);
		student.showStudent();
		Collage collage = context.getBean(Collage.class);
		collage.showCollage();
		Teacher t = student.getTeacher();
		t.getTeacher();

	}
}
