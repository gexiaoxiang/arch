package com.eden.customer.dao;

import com.eden.architecture.common.dao.BaseDao;
import com.eden.customer.vo.CustomerModel;
import com.eden.customer.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerDao extends BaseDao<CustomerModel, CustomerQueryModel> {

   }
