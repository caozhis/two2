package com.two2.serice;

import com.two2.bean.Car;
import com.two2.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarserviceImpl implements Carservice {

     @Autowired
     CarDao cd;


    @Override
    public void add(Car car) {
        cd.save( car);
    }

    @Override
    public void updata(Car car) {
          cd.saveAndFlush( car);
    }

    @Override
    public void del(int cid) {
          cd.deleteById(cid);
    }

    @Override
    public Car findCar(int cid) {
        Optional<Car> byId = cd.findById(cid);
        if (byId.isPresent()){
            return byId.get();
        } else{
            return null;
        }


    }

    @Override
    public List<Car> findCarList() {
        List<Car> all = cd.findAll();
        return all;
    }
}
