package com.dsen.UserDataServer.dal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document("user_collection")
@Data
@AllArgsConstructor
public class UserDataModel {

	@Transient
	public static final String SEQUENCE_NAME = "user_collection";

	@Id
	private String userId;
	
	private String email;

	private String username;

	private String password;

	private String picture;

	private int type;

	private boolean enabled;

}
