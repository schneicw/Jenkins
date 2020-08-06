package dev.team.services;

import java.util.Set;

import dev.team.enitities.Room;

public interface RoomService {
	
	Room createRoom(Room room);
	Set<Room> getAllRooms();
	Room changeRoomRent(Room room, double rent);
	

}
