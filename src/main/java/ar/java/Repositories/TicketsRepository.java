package ar.java.Repositories;

import org.springframework.data.repository.CrudRepository;

import ar.java.Models.Tickets;

public interface TicketsRepository extends CrudRepository<Tickets, Integer> {

}
