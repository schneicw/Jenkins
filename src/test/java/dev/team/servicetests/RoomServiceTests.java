package dev.team.servicetests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import dev.team.enitities.Room;
import dev.team.services.RoomService;

class RoomServiceTests {

	@Test
	void changeRentTest() {
		Room room = new Room(0,120,15000);
		double rent = 20000;
		RoomService mockService = Mockito.mock(RoomService.class);
		Mockito.when(mockService.changeRoomRent(room, rent)).thenReturn(room);
		Room room2 = new Room(0,120,3434);
		room2 = mockService.changeRoomRent(room, rent);
		
		Assertions.assertEquals(room.getRent(),room2.getRent());
	}

}
