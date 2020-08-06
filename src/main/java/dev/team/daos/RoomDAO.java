package dev.team.daos;

import java.util.Set;

import dev.team.enitities.Room;

public interface RoomDAO {
	Room createRoom(Room room);
	Set<Room> getAllRooms();
	Room getRoomByrId(int id);
	Room updateRoom(Room room);
}
