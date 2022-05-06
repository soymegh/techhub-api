package com.megh.techhub.dev.services;

import java.util.List;


public interface BaseService<E> {

	 public List<E> findAll();
	 public E findById(Integer id);
	 public E save(E entity);
	 public E update(Integer id, E entity);
	 public boolean delete(Integer id);
	
}
