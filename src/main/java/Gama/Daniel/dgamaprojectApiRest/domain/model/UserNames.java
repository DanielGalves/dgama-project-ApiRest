package Gama.Daniel.dgamaprojectApiRest.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name= "tb_user")
public class UserNames {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String xboxUser;
	
	private String playstationUser;
	
	private String steamUser;
	
	private String epicUser;
	
	public long getId() {return id;}
	
	public void setId(long id) {this.id = id;}
	
	public String getXboxUser() {return xboxUser;}
	
	public void setXboxUser(String xboxUser) {this.xboxUser = xboxUser;}
	
	public String getPlaystationUser() {return playstationUser;}
	
	public void setPlaystationUser(String playstationUser) {this.playstationUser = playstationUser;}

	public String getSteamUser() {return steamUser;}
	
	public void setSteamUser(String steamUser) {this.steamUser = steamUser;}
	
	public String getEpicUser() {return epicUser;}
	
	public void setEpicUser(String epicUser) {this.epicUser = epicUser;}
	
	
}
