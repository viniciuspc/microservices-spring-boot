package com.example.imageservice.entities;

public class Image {
	
	private long id;
	private String title;
	private String url;
	
	public Image(long id, String title, String url) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
