<<<<<<< HEAD
package com.ensi.ilsi.TechnicalTesting.Web;

import com.ensi.ilsi.TechnicalTesting.Domain.TechnicalTest;
import com.ensi.ilsi.TechnicalTesting.Service.TechnicalTestService;
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import Domain.TechnicalTest;
import Service.TechnicalTestService;
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hajer
 */
@RestController
@RequestMapping("/TechnicalTest")
public class TechnicalResource {

    private final TechnicalTestService technicalTestService;

    public TechnicalResource(TechnicalTestService technicalTestService) {
<<<<<<< HEAD
        this.technicalTestService = technicalTestService;
=======
        this.technicalTestService = productService;
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a
    }

    @GetMapping
    public List<TechnicalTest> findAll() {
        return this.technicalTestService.findAll();
    }

    @GetMapping("/{id}")
<<<<<<< HEAD
    public TechnicalTest findById(@PathVariable int id) {
=======
    public TechnicalTest findById(@PathVariable Long id) {
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a
        return this.technicalTestService.findById(id);
    }

    @PostMapping
    public TechnicalTest create(@RequestBody TechnicalTest t) {
        return this.technicalTestService.create(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.technicalTestService.delete(id);
    }
    
<<<<<<< HEAD
}
=======
}
>>>>>>> e54dbb6c2fa57a6fc4206cffd4787bda95651b4a
