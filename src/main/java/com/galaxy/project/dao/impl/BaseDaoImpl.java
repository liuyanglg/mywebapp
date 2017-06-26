package com.galaxy.project.dao.impl;

import com.galaxy.project.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


@Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDao<T> {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Autowired
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public Serializable save(T o) {
        return this.getHibernateTemplate().save(o);
    }

    @Override
    public void delete(T o) {
        this.getHibernateTemplate().delete(o);
    }

    @Override
    public void update(T o) {
        this.getHibernateTemplate().update(o);
    }

    @Override
    public void saveOrUpdate(T o) {
        this.getHibernateTemplate().saveOrUpdate(o);
    }

    @Override
    public <T1> List<T1> loadAll(Class<T1> entityClass) {
        return this.getHibernateTemplate().loadAll(entityClass);
    }

    @Override
    public T get(String hql) {
        return null;
    }

    @Override
    public T get(String hql, Map<String, Object> params) {
        return null;
    }

    @Override
    public T get(Class<T> c, Serializable id) {
        return this.getHibernateTemplate().get(c,id);
    }

    @Override
    public List<T> find(String hql) {
        return null;
    }

    @Override
    public List<T> find(String queryString, Object... values) {
        return (List<T>)(this.getHibernateTemplate().find(queryString,values));
    }

    @Override
    public List<T> find(String hql, Map<String, Object> params) {
        return null;
    }

    @Override
    public List<T> find(String hql, int page, int rows) {
        return null;
    }

    @Override
    public List<T> find(String hql, Map<String, Object> params, int page, int rows) {
        return null;
    }

    @Override
    public Long count(String hql) {
        return null;
    }

    @Override
    public Long count(String hql, Map<String, Object> params) {
        return null;
    }

    @Override
    public int executeHql(String hql) {
        return 0;
    }


}