package com.example.reactivespringboot.mongodb;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class SampleDataInitializer {

    private final ReservationRepository reservationRepository;

    SampleDataInitializer(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }
    @EventListener(ApplicationReadyEvent.class)
    public void ready(){
        Flux<Reservation> names = Flux
                .just("Madura", "Josh", "Olga", "Marcin", "Ria", "Stephane", "Violetta", "Dr. Syer")
                .map( name -> new Reservation(null, name))
                .flatMap(r -> this.reservationRepository.save(r));

        // ..
        names.subscribe();
    }

}
