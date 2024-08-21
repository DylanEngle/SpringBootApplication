package com.example.photoz.clone;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotEmpty;

@Table("PHOTOZ")
public class Photo {
	
	@Id
	private Integer id;
	
	@NotEmpty
	private String fileName;
	
	private String contentType;
	
	@JsonIgnore
	private byte[] data;

	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
	

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Photo() {
		
	}

	public Photo(Integer id, String fileName) {
		this.id = id;
		this.fileName = fileName;
	}
	
	
	
	//raw data
	
	
	

}
