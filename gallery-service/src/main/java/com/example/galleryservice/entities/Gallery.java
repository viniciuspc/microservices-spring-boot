package com.example.galleryservice.entities;

import java.util.List;

public class Gallery {
	
	private long id;
	private List<Object> images;
	
	public Gallery(long id) {
		super();
		this.id = id;
	}
	
	public Gallery() {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Object> getImages() {
		return images;
	}
	public void setImages(List<Object> images) {
		this.images = images;
	}
	
	

}
