package pokemon;

public class Pokemon {
	
	private int health;
	private int strength;
	private int speed;
	private String name;
	private final int INITIAL_HEALTH = 301;
	private final int INITIAL_STRENGTH = 51;
	private final int INITIAL_SPEED = 201;
	
	public Pokemon() {
		health = (int) (Math.random() * (INITIAL_HEALTH + 1));
		strength = (int) (Math.random() * (INITIAL_STRENGTH + 1));
		speed = (int) (Math.random() * (INITIAL_SPEED + 1));
		name = "";
	}
	
	public Pokemon(int health, int strength, int speed, String name) {
		this.health = health;
		this.strength = strength;
		this.speed = speed;
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public int getStrength() {
		return strength;
	}

	public int getSpeed() {
		return speed;
	}

	public String getName() {
		return name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
