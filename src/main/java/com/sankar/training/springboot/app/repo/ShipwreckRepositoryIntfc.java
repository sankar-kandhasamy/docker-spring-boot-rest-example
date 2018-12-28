/**
 * 
 */
package com.sankar.training.springboot.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sankar.training.springboot.app.entities.Shipwreck;

/**
 * @author sanka
 *
 */
public interface ShipwreckRepositoryIntfc extends CrudRepository<Shipwreck, Long> {

}
