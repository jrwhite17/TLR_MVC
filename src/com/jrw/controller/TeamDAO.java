package com.jrw.controller;

import java.util.List;
import javax.sql.DataSource;

public interface TeamDAO {
	/**
	 * This is the method to be used to initialize database resources ie.
	 * connection.
	 */
	public void setDataSource(DataSource ds);

	/**
	 * This is the method to be used to list down a record from the Student
	 * table corresponding to a passed student id.
	 */
	public Team getTeam(String abbreviation);

	/**
	 * This is the method to be used to list down all the records from the
	 * Student table.
	 */
	public List<Team> listTeams();
}
