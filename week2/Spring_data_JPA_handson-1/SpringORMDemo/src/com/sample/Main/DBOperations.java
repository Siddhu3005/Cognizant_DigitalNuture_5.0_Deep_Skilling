package com.sample.Main;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.Config.AppConfig;
import com.sample.DAO.EmployeeDAO;
import com.sample.Models.Employee;
;

public class DBOperations {
	public static ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	public static EmployeeDAO dao=context.getBean(EmployeeDAO.class);
	public static Scanner sc=new Scanner(System.in);
	public static void Insert() {
		System.out.println("Enter Name:");
		String name=sc.next();
		
		System.out.println("Enter Designation:");
		String designation=sc.next();
		sc.nextLine();
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Location:");
		String city=sc.next();
		
		dao.Save(new Employee(0,name,designation,age,city));
		
		
	}
	
	public static void Update() {
		System.out.println("Enter the id:");
		int id=sc.nextInt();
		
		System.out.println("Enter Name:");
		String name=sc.next();
		
		System.out.println("Enter Designation:");
		String designation=sc.next();
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Location:");
		String city=sc.next();
		
		dao.Update(new Employee(id,name,designation,age,city));
		
	}
	
	public static void Delete() {
		System.out.println("Enter the id to be deleted:");
		int id =sc.nextInt();
		dao.Delete(id);
	}
	
	public static void GetData() {
		System.out.println(dao.GetAll());
	}
	
	public static void main(String[] args) {
		boolean flag=true;
		System.out.println("----Testing ORM-----");
		while(flag) {
			
			System.out.println("1.Add\n2.Delete\n3.Update\n4.GetAll\n5.Exit");
			int op=sc.nextInt();
			switch(op) {
			case 1:Insert();GetData();break;
			case 2:GetData();;Delete();GetData();break;
			case 3:GetData();Update();GetData();break;
			case 4:GetData();break;
			case 5:flag=false;System.out.println("Okay byee....");
			break;
			}
		}
	}
}
