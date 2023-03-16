package com.example.MockInterview.Repository;

import com.example.MockInterview.Model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TrainRepository extends JpaRepository<Train,Integer> {
}
