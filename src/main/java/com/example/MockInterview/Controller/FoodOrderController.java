package com.example.MockInterview.Controller;

import com.example.MockInterview.Repository.FoodOrderRepository;
import com.example.MockInterview.Service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class FoodOrderController {

    @Autowired
    FoodOrderService foodOrderService;

    @GetMapping("/getTrainId")
    public int getTheTrainWithMaxOrder(@RequestParam()String date){
        return foodOrderService.getTheTrainWithMaxOrder(date) ;
    }
}
