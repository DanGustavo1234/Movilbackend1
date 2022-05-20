/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cordova.movilbackend1.dao;

import com.cordova.movilbackend1.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author danyg
 */
@Repository
public interface PersonRepository extends  JpaRepository<Person, String>{
    
}
