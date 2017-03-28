package com.jrw.controller;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TeamJDBCTemplate implements TeamDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public Team getTeam(String abbreviation) {
		String SQL = "SELECT * FROM teams where abbreviation = ?";
		Team team = jdbcTemplateObject.queryForObject(SQL,
				new Object[]{abbreviation}, new TeamMapper());
		return team;
	}
	
	public List<Team> listTeams() {
	      String SQL = "SELECT * FROM teams";
	      List <Team> teams = jdbcTemplateObject.query(SQL, new TeamMapper());
	      return teams;
	   }
}
