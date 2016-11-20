package models;

import javax.persistence.*;

@Entity
public class Person {

    public static final String TABLE_NAME = "Person";

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer id;

    public String name;
    public String address;
}
