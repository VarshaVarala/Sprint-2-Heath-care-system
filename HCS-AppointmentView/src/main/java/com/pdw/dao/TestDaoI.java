package com.pdw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdw.entity.Tests;

public interface TestDaoI extends JpaRepository<Tests,String>{

}
