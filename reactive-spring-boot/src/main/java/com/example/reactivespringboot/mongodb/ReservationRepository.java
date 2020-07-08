package com.example.reactivespringboot.mongodb;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

interface ReservationRepository extends ReactiveCrudRepository<Reservation, String> {


    Flux<Reservation> findByName(String name);

}
