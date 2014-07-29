package Entities;

public class Room {
	
	public int id;
	public int size_chair;
	public int quality;
	public boolean acessible;
	
	public Room(int id, int size_chair, int quality, boolean acessible) {
		this.id = id;
		this.size_chair = size_chair;
		this.quality = quality;
		this.acessible = acessible;
	}
	
}
