package com.springcloud.dao;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcloud.entity.User;

public interface UserDAO extends JpaRepository<User, Long> {

    /**
     * and
     * 
     * @param id
     * @param name
     * @return
     */
    User findByIdAndName(Long id, String name);

    User findByNameAndPassword(String name, String password);

    /**
     * or
     * 
     * @param id
     * @param name
     * @return
     */
    User findByIdOrName(Long id, String name);

    /**
     * between
     * 
     * @param start
     * @param end
     * @return
     */
    List<User> findByCreateTimeBetween(Date start, Date end);

    /**
     * lessThan
     * 
     * @param start
     * @return
     */
    List<User> getByCreateTimeLessThan(Date start);

    /**
     * Greater Than
     * 
     * @param start
     * @return
     */
    List<User> findByCreateTimeGreaterThan(Date start);

    /**
     * is null
     * 
     * @return
     */
    List<User> findByNameIsNull();

    /**
     * in
     * 
     * @param nameList
     * @return
     */
    List<User> findByNameIn(Collection<String> nameList);
}
