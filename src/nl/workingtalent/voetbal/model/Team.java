package nl.workingtalent.voetbal.model;

import java.util.List;

// Dit werkt dus wel straks in Spring Boot => @Entity
public class Team {
	
	// Dit werkt dus wel straks in Spring Boot => @Id
	private long id;
	
	private String teamName;
	
	// Dit werkt dus wel straks in Spring Boot => @OneToMany
	private List<Voetballer> voetballers;

}
