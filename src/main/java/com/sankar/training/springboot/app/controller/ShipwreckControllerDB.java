/**
 * 
 */
package com.sankar.training.springboot.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sankar.training.springboot.app.entities.Shipwreck;
import com.sankar.training.springboot.app.repo.ShipwreckRepositoryIntfc;

/**
 * @author 200984
 *
 */
@RestController
@RequestMapping("/api/v1/")
public class ShipwreckControllerDB {
	
	
	@Autowired
	private ShipwreckRepositoryIntfc shipReckRepo;

	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public Iterable<Shipwreck> list() {
		return shipReckRepo.findAll();
	}
	
	@RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		return shipReckRepo.save(shipwreck);
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Optional<Shipwreck> get(@PathVariable Long id) {
		return shipReckRepo.findById(id);
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
		shipwreck.setId(id); 
		return shipReckRepo.save(shipwreck);
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		shipReckRepo.deleteById(id); 
	}
	

}
