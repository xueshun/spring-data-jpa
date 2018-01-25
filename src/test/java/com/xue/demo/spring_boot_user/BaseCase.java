package com.xue.demo.spring_boot_user;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xue.demo.bean.Cat;
import com.xue.demo.repository.CatRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseCase {
		
	@Resource
	private CatRepository repository;
	
	@Test
	public void save() {
		Cat cat = new Cat();
		cat.setCatAge(18);
		cat.setCatName("lisa");
		repository.save(cat);
	}
}
