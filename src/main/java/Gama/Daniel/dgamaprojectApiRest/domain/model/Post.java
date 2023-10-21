package Gama.Daniel.dgamaprojectApiRest.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name= "tb_user")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 100)
	private String title;
	
	private String content;
	
	private String imageUrl;
	
	public long getId() {return id;}
	
	public void setId(long id) {this.id = id;}
	
	public String getTitle() {return title;}
	
	public void setTitle(String title) {this.title = title;}
	
	public String getContent() {return content;}
	
	public void setContent(String content) {this.content = content;}
	
	public String getImageUrl() {return imageUrl;}
	
	public void setImageUrl(String imageUrl) {this.imageUrl = imageUrl;}
	
}
