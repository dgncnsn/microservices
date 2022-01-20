package com.dsen.UserServer.DAL;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsen.UserServer.DAL.model.UserModel;

public interface UserRepository extends MongoRepository<UserModel, String>  {

}

