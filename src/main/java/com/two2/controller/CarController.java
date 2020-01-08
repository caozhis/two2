package com.two2.controller;

import com.two2.bean.Car;
import com.two2.serice.Carservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    Carservice cc;
    @PostMapping("/add")
    public String add(Car car){
      cc.add( car);
        return "redirect:/lst";
    }
    @GetMapping("/toAdd")
    public String toAdd(Car car){
        return "add";
    }

     @PostMapping("update")
    public String updata( Car ca){
             cc.updata(ca);
        return "redirect:/lst";
    }

     @GetMapping("toEdit/{cid}")
    public String toEdit(@PathVariable(name = "cid") int cid,Model model){
         Car car = cc.findCar(cid);
         model.addAttribute("car", car);
         return "edit";
    }

     @GetMapping("delete/{cid}")
    public String del(@PathVariable(name = "cid") int cid){
        cc.del(cid);
        return "redirect:/lst";
    }

    public String  findCar(int cid){
        return "";
    }

    /**
     * 获取列表
     * @return
     */
    @GetMapping("lst")
    public String findCarList(Model model){
        List<Car> carList = cc.findCarList();
        model.addAttribute("car", carList);
        return "list";
    }


}
