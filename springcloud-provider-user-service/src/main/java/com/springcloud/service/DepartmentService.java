package com.springcloud.service;

import com.springcloud.entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    Department getDepartmentById(Long id);
}
