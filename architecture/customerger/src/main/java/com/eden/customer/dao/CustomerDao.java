package com.eden.customer.dao;

import com.eden.customer.vo.CustomerModel;
import com.eden.customer.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerDao {

    public  void create(CustomerModel model);
    public  void update(CustomerModel model);
    public  void delete(int model);
    public  CustomerModel getByUuid(int model);
    public  CustomerModel getByCustomerId(String customerId);
    public List<CustomerModel> getByConditionPage(CustomerQueryModel model);
}
