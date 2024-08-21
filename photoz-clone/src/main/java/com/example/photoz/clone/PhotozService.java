package com.example.photoz.clone;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class PhotozService {
	
	private final PhotozRepository photozRepository;
	
	public PhotozService(PhotozRepository photozRepository) {
		this.photozRepository = photozRepository;
	}
	
	private Map<Integer, Photo> db = new HashMap<Integer, Photo>(){{
		put(1, new Photo(1, "hello.jpg"));
	}};
	
	public Iterable<Photo> get(){
		return photozRepository.findAll();
	}
	
	public Photo get(Integer id) {
		return photozRepository.findById(id).orElse(null);
	}
	
	public void remove(Integer id) {
		photozRepository.deleteById(id);
	}
	
	public Photo save(String fileName, String contentType, byte[]data) {
		Photo photo = new Photo();
		
		photo.setFileName(fileName);
		photo.setData(data);
		photo.setContentType(contentType);
		photozRepository.save(photo);
		return photo;
	}
	
	
	
}
