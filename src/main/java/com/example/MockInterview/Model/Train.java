package com.example.MockInterview.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trains")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String trainNo ;
    private String source ;
    private String destination ;

    private String date ;

    //train is parent wrt passenger
    @OneToMany(mappedBy = "train",cascade = CascadeType.ALL)
    List<Passenger> passengerList = new ArrayList<>() ;

    //train is parent wrt foodOrders
    @OneToMany(mappedBy = "train" ,cascade = CascadeType.ALL)
    private List<FoodOrder> orderList = new ArrayList<>() ;
}
