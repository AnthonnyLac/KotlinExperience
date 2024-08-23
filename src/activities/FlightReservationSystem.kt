package activities

import interfaces.Executable
import models.Flight
import java.util.Scanner

class FlightReservationSystem : Executable {
    private val flight = Flight("XYZ123") // Número do voo fixo

    override fun execute() {
        val scanner = Scanner(System.`in`)

        println("Digite o número do assento para verificar a disponibilidade:")
        val seatNumber = scanner.nextInt()

        if (flight.reserveSeat(seatNumber)) {
            println("O assento $seatNumber foi reservado.")
        } else {
            println("O assento $seatNumber não está disponível ou já está reservado.")
        }
    }
}
