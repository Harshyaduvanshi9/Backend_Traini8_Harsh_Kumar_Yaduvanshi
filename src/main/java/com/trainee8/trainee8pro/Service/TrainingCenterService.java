package com.trainee8.trainee8pro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainee8.trainee8pro.Model.TrainingCenter;
import com.trainee8.trainee8pro.Repo.TrainingCenterRepository;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCenterRepository repository;

    public TrainingCenter saveTrainingCenter(TrainingCenter center) {
        center.setCreatedOn(System.currentTimeMillis());
        System.out.println("***************   "+center.getCreatedOn());
        return repository.save(center);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}

