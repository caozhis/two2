package com.two2.dao;

import com.two2.bean.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<Car,Integer> {

}
