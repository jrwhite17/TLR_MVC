package com.jrw.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class TeamMapper implements RowMapper<Team>{
	public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
		Team team = new Team();
		team.setCity(rs.getString("city"));
		team.setName(rs.getString("name"));
		team.setPrimaryColor(rs.getString("primaryColor"));
		team.setSecondaryColor(rs.getString("secondaryColor"));
		
		return team;
	}
}
