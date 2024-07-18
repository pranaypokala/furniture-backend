package com.example.demo.service;

import com.example.demo.model.Furniture;
import com.example.demo.repository.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureService {

    private final FurnitureRepository furnitureRepository;

    @Autowired
    public FurnitureService(FurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }

    public List<Furniture> getAllFurniture() {
        return furnitureRepository.findAll();
    }

    public Furniture addFurniture(Furniture furniture) {
        return furnitureRepository.save(furniture);
    }

    public void deleteFurniture(Long id) {
        furnitureRepository.deleteById(id);
    }
}
