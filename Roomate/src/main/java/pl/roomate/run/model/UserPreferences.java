package pl.roomate.run.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import pl.roomate.run.enums.Frequency;
import pl.roomate.run.enums.Preference;

@Entity
public class UserPreferences {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	private Preference smoking;
	private Preference animals;
	private Frequency party;
	private Frequency alkohol;
	
	
	public long getId() {
		return Id;
	}
	
	public void setId(long id) {
		Id = id;
	}
	public Preference getSmoking() {
		return smoking;
	}
	public void setSmoking(Preference smoking) {
		this.smoking = smoking;
	}
	public Preference getAnimals() {
		return animals;
	}
	public void setAnimals(Preference animals) {
		this.animals = animals;
	}
	public Frequency getParty() {
		return party;
	}
	public void setParty(Frequency party) {
		this.party = party;
	}
	public Frequency getAlkohol() {
		return alkohol;
	}
	public void setAlkohol(Frequency alkohol) {
		this.alkohol = alkohol;
	}
}
