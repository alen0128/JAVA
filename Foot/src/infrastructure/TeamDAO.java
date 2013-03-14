package infrastructure;

import java.sql.*;
import java.util.*;

import domain.Team;

public class TeamDAO {
	public void addTeam(Connection conn, String sql) throws SQLException {
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);

		statement.close();
		conn.close();
	}

	public void deleteTeam(Connection conn, String sql) throws SQLException {
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);

		statement.close();
		conn.close();
	}

	public List<Team> getTeam(Connection conn, String sql) throws SQLException {
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		List<Team> res = new ArrayList<Team>();

		while (rs.next()) {
			Team team = convertRecordToTeam(rs);
			res.add(team);
		}
		rs.close();
		statement.close();
		conn.close();
		return res;
	}

	private Team convertRecordToTeam(ResultSet rs) throws SQLException {
		Team team = new Team();
		team.setName(rs.getString("name"));
		team.setMasterplace(rs.getString("masterplace"));
		team.setCoach(rs.getString("coach"));
		return team;
	}
}
