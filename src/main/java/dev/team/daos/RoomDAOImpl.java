package dev.team.daos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import dev.team.enitities.Room;

public class RoomDAOImpl implements RoomDAO{

	private static RoomDAOImpl rdao = null;
	private Map<Integer,Room> roomTable = new HashMap<Integer, Room>();
	private int count = 1;
	
	private RoomDAOImpl(){
		
	}
	
	public static RoomDAO getRoomDAO() {
		if(rdao == null) {
			rdao = new RoomDAOImpl();
			return rdao;
		}
		return rdao;
	}
		
	public Room createRoom(Room room) {
		room.setrId(count);
		this.roomTable.put(room.getrId(), room);
		this.count++;
		return room;
	}

	public Set<Room> getAllRooms() {
		Set<Room> rooms = new HashSet<Room>(roomTable.values());
		return rooms;
	}

	public Room getRoomByrId(int id) {
		return roomTable.get(id);
	}

	public Room updateRoom(Room room) {
		roomTable.put(room.getrId(), room);
		return room;
	}
	
}
