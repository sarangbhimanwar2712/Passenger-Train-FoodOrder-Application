package com.example.MockInterview.Controller;


import com.example.MockInterview.Model.Train;
import com.example.MockInterview.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trains")
public class TrainController {

    @Autowired
    TrainService trainService ;


    @PostMapping("/add")
    public Train addTrain(@RequestBody() Train train){
        return trainService.addTrain(train) ;
    }
}
