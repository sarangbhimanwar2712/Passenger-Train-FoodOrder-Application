package com.example.MockInterview.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="FoodOrders")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private int ticketId ;
    private int trainId ;

    //foodOrder is child for both train as well as for the passenger
    @ManyToOne
    @JoinColumn
    private Train train ;

    @ManyToOne
    @JoinColumn
    private Passenger passenger ;
}
