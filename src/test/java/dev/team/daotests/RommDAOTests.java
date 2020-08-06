package dev.team.daotests;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

import dev.team.daos.RoomDAO;
import dev.team.daos.RoomDAOImpl;
import dev.team.enitities.Room;

@TestMethodOrder(OrderAnnotation.class)
public class DaoTest {

	public static RoomDAO rdao = new RoomDAOImpl();
	
	@BeforeAll
	static void setUp() {
		Map<Integer, Room> room_table = new HashMap<Integer, Room>();
		
		int idMaker = 0;
	}
	
	@Test
	@Order(1)
	void createRoom() {
		Room room1 = new Room(0, 800, 600);
		Room room2 = new Room(0,1000, 1000);
		
		rdao.createRoom(room1);
		rdao.createRoom(room2);
		
		Assertions.assertNotEquals(0, room.getrId());		
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
		Room room = rdao.getRoomByRid(1);
		
		Assertions.assertEquals(1, room.getRid());
	}
	
	@Test
	@Order(2)
	void updateRoom() {
		Room room = rdao.getRoomByRid(1);
		
		room.setRent(900);
		rdao.updateRoom(room);
		
		Assertions.assertEquals(900, room.getRent());
	}

}
