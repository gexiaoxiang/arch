package com.eden.customer.service;

import com.eden.architecture.common.service.BaseService;
import com.eden.customer.dao.CustomerDao;
import com.eden.customer.vo.CustomerModel;
import com.eden.customer.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CustomerService extends BaseService<CustomerModel, CustomerQueryModel> implements  ICustomerService {


    private CustomerDao dao=null;
    @Autowired
    private void setDao(CustomerDao dao){
        this.dao=dao;
        super.setDao(dao);
    }



}
