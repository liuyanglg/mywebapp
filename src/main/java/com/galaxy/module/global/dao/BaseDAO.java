package com.galaxy.module.global.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T> {

    Serializable save(T o);

    void remove(T o);

    void update(T o);

    T get(Class<T> entityClass, Serializable id);

    T load(Class<T> entityClass, Serializable id);

    List<T> loadAll(final Class<T> entityClass);

    List<T> find(final String hql, Object... values);
}
