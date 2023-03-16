package com.example.MockInterview.Service;

import com.example.MockInterview.Model.Train;
import com.example.MockInterview.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {

    @Autowired
    TrainRepository trainRepository ;

    public Train addTrain(Train train){
        trainRepository.save(train) ;

        return train ;
    }


}
