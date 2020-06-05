package es.codeurjc.daw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String author;
	private String message;

	@ManyToOne
	private Post post;
	
	public Comment() {}

	public Comment(String author, String message) {
		this.author = author;
		this.message = message;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Post getPost() {
        return post;
	}
	
	public void setPost(Post post) {
        this.post = post;
    }

	@Override
	public String toString() {
		return this.author + ": " + this.message;
	}

}
