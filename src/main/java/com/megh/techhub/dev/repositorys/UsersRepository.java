package com.megh.techhub.dev.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megh.techhub.dev.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
