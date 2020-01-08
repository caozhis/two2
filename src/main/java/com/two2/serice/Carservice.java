package com.two2.serice;

import com.two2.bean.Car;

import java.util.List;

public interface Carservice {

    public void add(Car car);
    public void updata(Car car);
    public void del(int cid);

    public Car findCar(int cid);
    public List<Car> findCarList();


}
