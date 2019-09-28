package com.eden.architecture.common.service;

import com.eden.architecture.common.dao.BaseDao;
import com.eden.architecture.common.vo.BaseModel;
import com.eden.pageutil.Page;

import java.util.List;

public class BaseService<M, QM extends BaseModel> implements IBaseService<M, QM> {
    private BaseDao dao = null;

    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public void create(M m) {
        dao.create(m);

    }

    @Override
    public void update(M m) {
        dao.update(m);
    }

    @Override
    public void delete(int model) {
        dao.delete(model);
    }

    @Override
    public M getByUuid(int model) {
        return (M) dao.getByUuid(model);
    }

    @Override
    public M getByCustomerId(String customerId) {
        return (M) dao.getByCustomerId(customerId);
    }

    @Override
    public Page<M> getByConditionPage(QM qm) {
        List<M> list = dao.getByConditionPage(qm);
        qm.getPage().setResult(list);
        return qm.getPage();
    }
}
