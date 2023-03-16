package com.example.MockInterview.Service;

import com.example.MockInterview.Model.Passenger;
import com.example.MockInterview.Model.Train;
import com.example.MockInterview.Repository.PassengerRepository;
import com.example.MockInterview.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository ;

    @Autowired
    TrainRepository trainRepository ;

    public String addPassenger(Passenger passenger ){
        int trainId = passenger.getTrainNo() ;
        Train train = trainRepository.findById(trainId).get() ;

        passenger.setTrain(train);
        train.getPassengerList().add(passenger) ;
        passengerRepository.save(passenger) ;

        trainRepository.save(train) ;
        return "Passenger added successfully" ;
    }

}
