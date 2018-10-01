package org.wecancodeit.bookReview;

public class Review {

	private long id;
	private String title;
	private String author;
	private String genre;
	private String content;
	private String imageUrl;

	
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
	public String getContent() {
		return content;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public Review(long id, String title, String author, String genre, String content, String imageUrl) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.content = content;
		this.imageUrl = imageUrl;
	}
	
	
	
}
