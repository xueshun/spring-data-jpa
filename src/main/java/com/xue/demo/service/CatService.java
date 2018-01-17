package com.xue.demo.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.xue.demo.bean.Cat;
import com.xue.demo.repository.CatRepository;

@Service
public class CatService {
	
	@Resource
	private CatRepository catRepository;
	
	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}
	
	@Transactional
	public void delete(int id){
		catRepository.delete(id);
	}
	
	//查询数据.
	public Iterable<Cat> getAll(){
		return catRepository.findAll();
	}
}
