package com.lvsom.carbooking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="roles")
public class Role {
	  @Id
	  // @GenerateValue generates the value for the column of the database table.
	  //GenerateType.IDENTITY : Value is set by table itself that should be unique.
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;

	  @Enumerated(EnumType.STRING)
	  @Column(length = 20)
	  private ERole name;

	  public Role() {

	  }

	  public Role(ERole name) {
	    this.name = name;
	  }

	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }

	  public ERole getName() {
	    return name;
	  }

	  public void setName(ERole name) {
	    this.name = name;
	  }
}
