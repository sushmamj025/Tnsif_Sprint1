package com.tnsif.sm.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService
{
	@Autowired
     private StoreRepository repo;
	
	public List<Store> listAll()
	{
		return repo.findAll();
	}
	
	public Store get(Integer id)
	{
		return repo.findById(id).get();
	}
	
	public void save(Store store)
	{
		repo.save(store);
	}
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
}
