package com.tnsif.sm.store;

import java.util.List;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StoreController
{
	@Autowired
    private StoreService service;
	
	//Restful API methods for retrieval
	
	@GetMapping("/stores")
	public List<Store> list()
	{
		return service.listAll();
	}
	@GetMapping("/stores/{id}")
	public ResponseEntity<Store> get(@PathVariable Integer id)
	{
		try
		{
			Store store = service.get(id);
			return new ResponseEntity<Store>(store,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Store>(HttpStatus.NOT_FOUND);
		}
	}
	
	 @PostMapping("/stores")
	public void add(@RequestBody  Store store)
   {
	service.save(store);
  }
	 //Restful API update method
	 @PutMapping("/stores/{id}")
	 public ResponseEntity<?>update(@RequestBody Store store,@PathVariable Integer id)
	 {
		 try
		 {
			 Store existStore = service.get(id);
			 service.save(store);
			 return new ResponseEntity<>(HttpStatus.OK);
			 
		 }
		 catch(NoSuchElementException e)
		 {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 }
	 }
	 //Restful API delete
	 @DeleteMapping("stores/{id}")
	 public void delete(@PathVariable Integer id)
	 {
		 service.delete(id);
	 }

}
