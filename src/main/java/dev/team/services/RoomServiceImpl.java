package dev.team.services;

import java.util.Set;

import dev.team.daos.RoomDAO;
import dev.team.daos.RoomDAOImpl;
import dev.team.enitities.Room;

public class RoomServiceImpl implements RoomService {

	private RoomDAO rdao;
	
	public RoomServiceImpl() {
		super();
		this.rdao = RoomDAOImpl.getRoomDAO();
	}
	
	public RoomServiceImpl(RoomDAO rdao) {
		super();
		this.rdao=rdao;
	}
	
	@Override
	public Room createRoom(Room room) {
		return this.rdao.createRoom(room);
	}

	@Override
	public Set<Room> getAllRooms() {
		return this.rdao.getAllRooms();
	}

	@Override
	public Room changeRoomRent(Room room, double rent) {
		room.setRent(rent);
		return this.rdao.updateRoom(room);
	}

}
