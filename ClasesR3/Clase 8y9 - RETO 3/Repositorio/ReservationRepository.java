
package com.example.demo.Repositorio;

import com.example.demo.Interface.ReservationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Reservation;
import java.util.Optional;
import java.util.List;/*Se deben agregar los paquetes donde genere falla */

@Repository  /*defino la clase como un repositorio */
public class ReservationRepository {

    @Autowired /*Permite traer métodos de otras clases o interfaces como atributos*/
    private ReservationInterface extensionesCrud;

    public List<Reservation> getAll(){
        return (List<Reservation>) extensionesCrud.findAll();  /*creo un método para encontrar la tabla desde el repositorio a través de los métodos de la interface*/
    }

    public Optional<Reservation> getReservation(int idReservation){
        return extensionesCrud.findById(idReservation);
    }

    public Reservation save(Reservation reservation){
        return extensionesCrud.save(reservation);
    }

  

}