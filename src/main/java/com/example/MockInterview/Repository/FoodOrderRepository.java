package com.example.MockInterview.Repository;

import com.example.MockInterview.Model.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder,Integer> {
}
