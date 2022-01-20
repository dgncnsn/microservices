package com.dsen.UserDataServer.dal;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsen.UserDataServer.dal.model.UserDataModel;

public interface UserDataRepository extends MongoRepository<UserDataModel, String>  {

}

