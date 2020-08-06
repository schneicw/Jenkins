package dev.team.enitities;

public class Room {
	private int rId;
	private int sqFt;
	private double rent;

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(int rId, int sqFt, double rent) {
		super();
		this.rId = rId;
		this.sqFt = sqFt;
		this.rent = rent;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public int getSqFt() {
		return sqFt;
	}

	public void setSqFt(int sqFt) {
		this.sqFt = sqFt;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "Room [rId=" + rId + ", sqFt=" + sqFt + ", rent=" + rent + "]";
	}
	
	
}
