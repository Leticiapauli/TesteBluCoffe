package com.grupo01.blucoffe.dto;

import com.grupo01.blucoffe.entities.User;

public class ClientDTO {

	private Long id;
	private String name;
	
	public ClientDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ClientDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
