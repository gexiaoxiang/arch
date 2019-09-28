package com.eden.architecture.common.dao;

import java.util.List;

public interface BaseDao<M,QM> {
    public  void create(M m);
    public  void update(M m);
    public  void delete(int model);
    public  M getByUuid(int model);
    public  M getByCustomerId(String customerId);
    public List<M> getByConditionPage(QM qm);

}
