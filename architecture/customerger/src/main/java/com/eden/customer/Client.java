package com.eden.customer;

import com.eden.customer.service.ICustomerService;
import com.eden.customer.vo.CustomerModel;
import com.eden.customer.vo.CustomerQueryModel;
import com.eden.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    @Autowired
    private ICustomerService service;

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Client t = (Client) ac.getBean("client");
        CustomerModel cm = new CustomerModel();
        cm.setCustomerId("c1");
        cm.setPwd("c1");
        cm.setRegisterTime("");
        cm.setTrueName("c1");
        cm.setTrueName("99");

//        t.service.create(cm);
        CustomerQueryModel customerQueryModel = new CustomerQueryModel();
        customerQueryModel.getPage().setNowPage(1);
        customerQueryModel.getPage().setPageShow(3);

        Page<CustomerModel> byConditionPage = t.service.getByConditionPage(customerQueryModel);
        System.out.println(customerQueryModel.getPage());
        System.out.println("list"+byConditionPage);
    }
}
