package com.example.MockInterview.Service;

import com.example.MockInterview.Model.FoodOrder;
import com.example.MockInterview.Model.Train;
import com.example.MockInterview.Repository.FoodOrderRepository;
import com.example.MockInterview.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FoodOrderService {

    @Autowired
    FoodOrderRepository foodOrderRepository ;

    @Autowired
    TrainRepository trainRepository ;


    public int getTheTrainWithMaxOrder( String date){

        List<Train> trainList = trainRepository.findAll() ;
        int max = Integer.MIN_VALUE ;
        int trainId =  0 ;
        for(Train train : trainList ){
            List<FoodOrder> foodOrderList = train.getOrderList() ;
            if(foodOrderList.size() > max  && train.getDate().equals(date)){
                trainId = train.getId() ;
            }
        }
        return trainId ;
    }
}
