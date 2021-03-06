package com.dao;

import java.util.List;

public interface GlobalDao {
    public boolean save(Object entity);

    public boolean update(Object entity);

    public boolean delete(Object entity);

    public <T> List<T> getAllData(Class<T> entity);
}
