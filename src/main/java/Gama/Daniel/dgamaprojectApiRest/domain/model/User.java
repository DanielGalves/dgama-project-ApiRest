package Gama.Daniel.dgamaprojectApiRest.domain.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name= "tb_user")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 100)
	private String name;
	
	private String avatarUrl;
	
	private Boolean status;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Post post;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private UserNames userNames;
	
	public long getId() {return id;}
	
	public void setId(long id) {this.id = id;}
	
	public String getName() {return name;}
	
	public void setName(String name) {this.name = name;}
	
	public String getAvatarUrl() {return avatarUrl;}
	
	public void setAvatarUrl(String avatarUrl) {this.avatarUrl = avatarUrl;}
	
	public Boolean getStatus() {return status;}
	
	public void setStatus(Boolean status) {this.status = status;}

	public Post getPost() {return post;}

	public void setPost(Post post) {this.post = post;}

	public UserNames getUserNames() {return userNames;}

	public void setUserNames(UserNames userNames) {this.userNames = userNames;}
	
}
