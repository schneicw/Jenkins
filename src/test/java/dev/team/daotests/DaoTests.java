package dev.team.daotests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import dev.team.daos.RoomDAO;
import dev.team.daos.RoomDAOImpl;
import dev.team.enitities.Room;

@TestMethodOrder(OrderAnnotation.class) 
class DaoTests {

	public static RoomDAO rdao = RoomDAOImpl.getRoomDAO();
	
	
	@Test
	@Order(1)
	void createRoom() {
		Room room1 = new Room(1, 800, 600);
		Room room2 = new Room(0,1000, 1000);
		
		rdao.createRoom(room1);
		rdao.createRoom(room2);
		
		Assertions.assertNotEquals(0, room1.getrId());		
	}
	
	@Test
	@Order(2)
	void getAllRooms() {
		Set<Room> rooms = rdao.getAllRooms();
		
		Assertions.assertEquals(2, rooms.size());
	}
	
	@Test
	@Order(2)
	void getRoomByRid() {
		Room room = rdao.getRoomByrId(1);
		
		Assertions.assertEquals(1, room.getrId());
	}
	
	@Test
	@Order(2)
	void updateRoom() {
		Room room = rdao.getRoomByrId(1);
		
		room.setRent(900);
		rdao.updateRoom(room);
		
		Assertions.assertEquals(900, room.getRent());
	}
}
