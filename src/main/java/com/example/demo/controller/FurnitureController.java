package com.example.demo.controller;

import com.example.demo.model.Furniture;
import com.example.demo.service.FurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/furniture")
public class FurnitureController {

    private final FurnitureService furnitureService;

    @Autowired
    public FurnitureController(FurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }

    @GetMapping("/all")
    public List<Furniture> getAllFurniture() {
        return furnitureService.getAllFurniture();
    }

    @PostMapping("/add")
    public Furniture addFurniture(@RequestBody Furniture furniture) {
        return furnitureService.addFurniture(furniture);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFurniture(@PathVariable Long id) {
        furnitureService.deleteFurniture(id);
    }
}
