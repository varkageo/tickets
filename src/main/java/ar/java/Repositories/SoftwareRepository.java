package ar.java.Repositories;

import org.springframework.data.repository.CrudRepository;

import ar.java.Models.Software;

public interface SoftwareRepository extends CrudRepository<Software, Integer> {

}
