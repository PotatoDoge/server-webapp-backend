package io.potatodoge.server.model;

import io.potatodoge.server.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;

@Entity //specifies that the class is an entity and is mapped to a db table
@Data //generates getters (also setters for non final fields)
@Table(name = "server")
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id // primary key of an entity
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "IP Address cannot be empty or null") // validation (for @Valid)
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
}
