package com.sample.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.Models.Employee;

import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EmployeeDAOImp1 implements EmployeeDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void Save(Employee emp) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.persist(emp);//--persist is used to insert the data--
		System.out.println("Employee Details Saved Successsfully..!");
	}

	@Override
	public void Update(Employee emp) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.merge(emp);//--merge is used to update the existing data--
		System.out.println("Employee Details Updated Successsfully..!");
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Employee emp=session.get(Employee.class, id);
		if(emp!=null) {
			session.remove(emp);
			System.out.println("Employee Data Deleted Successfully.!!");
		}
		else {
			System.out.println("No Data Found with the Given Id");
		}
	}

	@Override
	public List<Employee> GetAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return session.createQuery("from Employee",Employee.class).list();
	}

}
