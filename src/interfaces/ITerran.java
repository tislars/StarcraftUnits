package interfaces;

public interface ITerran {
	
	void setName(String name);
	String getName();
	
	void setHealth(int health);
	int getHealth();
	
	void setDamage(int damage);
	int getDamage();
	
	void setTier(int tier);
	int getTier();
	
	void setDescription(String description);
	String getDescription();
	
	void setStimpack(Stimpack hasStimpack);
	String useStimpack();	
}
