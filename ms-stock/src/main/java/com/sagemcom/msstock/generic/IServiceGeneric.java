package com.sagemcom.msstock.generic;


import java.util.List;
import java.util.Map;

public interface IServiceGeneric <T,ID>{
    T save(T entity);
    List<T> findAll();
    T getId(ID id);

    T update(ID id, Map<Object, Object> fields);
    void delete(ID id);
}
