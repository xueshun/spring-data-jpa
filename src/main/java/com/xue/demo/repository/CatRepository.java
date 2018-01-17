package com.xue.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.xue.demo.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer>{

}
