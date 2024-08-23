package models

class Flight(val flightNumber: String) {
    private val seats = MutableList(10) { 0 } // 0 = disponível, 1 = reservado

    fun reserveSeat(seat: Int): Boolean {
        if (seat in seats.indices && seats[seat] == 0) {
            seats[seat] = 1
            return true
        }
        return false
    }
}
