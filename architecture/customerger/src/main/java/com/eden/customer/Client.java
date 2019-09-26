package com.eden.customer;

import com.eden.customer.dao.CustomerDao;
import com.eden.customer.vo.CustomerModel;
import com.eden.customer.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Client {

    @Autowired
    private CustomerDao dao ;

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Client t = (Client) ac.getBean("client");
        CustomerModel cm = new CustomerModel();
        cm.setCustomerId("c1");
        cm.setPwd("c1");
        cm.setRegisterTime("");
        cm.setTrueName("c1");
        cm.setTrueName("99");

        t.dao.create(cm);
        List<CustomerModel> byConditionPage = t.dao.getByConditionPage(new CustomerQueryModel());
        System.out.println("list"+byConditionPage);
    }
}
