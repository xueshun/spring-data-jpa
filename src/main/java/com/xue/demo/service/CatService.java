package com.xue.demo.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.xue.demo.bean.Cat;
import com.xue.demo.dao.CatDao;
import com.xue.demo.repository.Cat2Repository;
import com.xue.demo.repository.CatRepository;

@Service
public class CatService {
	
	@Resource
	private CatRepository catRepository;
	@Resource
	private Cat2Repository cat2Repository;
	@Resource
	private CatDao catDao;
	
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
	
	/**
	 * extends Repository 
	 * @param catName
	 * @return
	 */
	public Cat finByCatName(String catName) {
		return cat2Repository.findByCatName(catName);
	}
	
	/**
	 *  extends Repository  JPQL
	 * @param catName
	 * @return
	 */
	public Cat finByCatName2(String catName) {
		return cat2Repository.findMyCatName(catName);
	}
	
	/**
	 * jdbcTemplate 查询数据
	 * @param catName
	 * @return
	 */
	public Cat selectByCatName(String catName) {
		return catDao.selectByCatName(catName);
	}
	
}
