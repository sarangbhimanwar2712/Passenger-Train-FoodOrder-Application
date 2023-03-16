package com.example.MockInterview.Controller;


import com.example.MockInterview.Model.Passenger;
import com.example.MockInterview.Service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    PassengerService passengerService ;

    @PostMapping("/add")
    public String addPassenger(@RequestBody()Passenger passenger ){

        return passengerService.addPassenger(passenger) ;
    }
}
