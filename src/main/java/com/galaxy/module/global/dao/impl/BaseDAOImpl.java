package com.galaxy.module.global.dao.impl;

import com.galaxy.module.global.dao.BaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.io.Serializable;
import java.util.List;

public class BaseDAOImpl<T> implements BaseDAO<T> {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public Serializable save(T o) {
        return hibernateTemplate.save(o);
    }

    public void remove(T o) {
        hibernateTemplate.delete(o);
    }

    public void update(T o) {
        hibernateTemplate.update(o);
    }

    public T get(Class<T> entityClass, Serializable id) {
        return hibernateTemplate.get(entityClass, id);
    }

    public T load(Class<T> entityClass, Serializable id) {
        return hibernateTemplate.load(entityClass,id);
    }

    public List<T> loadAll(Class<T> entityClass) {
        return hibernateTemplate.loadAll(entityClass);
    }

    public List<T> find(String hql, Object... values) {
        return (List<T>) hibernateTemplate.find(hql,values);
    }
}
