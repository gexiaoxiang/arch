package com.eden.architecture.common.service;

import com.eden.architecture.common.vo.BaseModel;
import com.eden.pageutil.Page;

public interface IBaseService<M,QM extends BaseModel> {
    public  void create(M m);
    public  void update(M m);
    public  void delete(int model);
    public  M getByUuid(int model);
    public  M getByCustomerId(String customerId);
    public Page<M> getByConditionPage(QM qm);
}
