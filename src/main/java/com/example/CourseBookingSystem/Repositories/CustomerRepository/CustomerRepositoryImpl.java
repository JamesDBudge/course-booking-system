package com.example.CourseBookingSystem.Repositories.CustomerRepository;

import com.example.CourseBookingSystem.Models.Customer;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl {

//    @Autowired
//    EntityManager entityManager;
//
//
//    @Override
//    @Transactional
//    public List<Customer> findCustomersOnCourse(String courseName){
//
//        List<Customer> result  =  null;
//
//        Session session = entityManager.unwrap(Session.class);
//
//       try{
//        Criteria cr = session.createCriteria(Customer.class);
//        cr.createAlias("customers","customerAlias");
//        cr.add(Restrictions.eq("customerAlias.booking_id", booking));
//        result = cr.list();
//    }catch (HibernateException ex){
//        ex.printStackTrace();
//    } finally {
//
//    }
//
//       return result;
//}
}
