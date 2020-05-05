package com.pdw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdw.entity.DiagnosticCenter;

public interface CenterDaoI extends JpaRepository<DiagnosticCenter,String> {

}
