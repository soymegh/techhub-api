package com.megh.techhub.dev.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.megh.techhub.dev.models.Users;
import com.megh.techhub.dev.repositorys.UsersRepository;

@Service
public class UsersService implements BaseService<Users> {

	@Autowired
	UsersRepository userRepository;
	
	
	@Override
	@Transactional
	public List<Users> findAll() {
		List<Users> b = userRepository.findAll();
		return b;
	}

	
	@Override
	public Users save(Users entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users update(Integer id, Users entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Users findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
