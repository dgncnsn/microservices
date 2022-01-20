package com.dsen.UserDataServer.dal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "database_sequences")
@Data
@NoArgsConstructor
public class DatabaseSequenceModel {
    @Id
    private String id;
    private long seq;

}