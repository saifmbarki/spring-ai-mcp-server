package com.saif.mcp;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservationServiceImpl {



    @McpTool(name = "get_all_reservations", description = "reservations from ulyses proj")
    public List<String> getReservations(@McpToolParam(description = "The chain ID to count properties for", required = true) Integer chainId) {
        return List.of(
                "Réservation #1 - Hôtel Paris",
                "Réservation #2 - Restaurant Lyon",
                "Réservation #3 - Vol Marseille"
        );
    }

    @McpTool(name = "update_a_reservation", description = "update a reservation based on it's ID")
    public String updateReservations(@McpToolParam(description = "The chain ID to count properties for", required = true) Integer reservationID) {
        return "reservation #" + reservationID + " updated";
    }
}
