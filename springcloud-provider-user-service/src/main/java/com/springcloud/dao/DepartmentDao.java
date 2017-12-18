package com.springcloud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcloud.entity.Department;

public interface DepartmentDao extends JpaRepository<Department, Long> {

}
