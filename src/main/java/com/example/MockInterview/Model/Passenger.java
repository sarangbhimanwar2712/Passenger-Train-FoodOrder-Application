package com.example.MockInterview.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.aop.target.LazyInitTargetSource;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Passengers")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private int trainNo ;
    private String date ;
    private int age ;
    private String gender ;

    //Passenger is child wrt train
    @ManyToOne
    @JoinColumn
    private Train train ;

    //passenger is parent wrt order
    @OneToMany
    List<FoodOrder> orderList =new ArrayList<>() ;
}
