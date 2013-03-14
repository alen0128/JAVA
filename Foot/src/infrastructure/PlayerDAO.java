package infrastructure;

import java.sql.*;
import java.util.*;

import domain.Player;

public class PlayerDAO {
	private static final String FIND_BY_NAME = "select name from team";

	public List<String> getTeam(Connection conn) throws SQLException {

		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(FIND_BY_NAME);
		List<String> teamlist = new ArrayList<String>();

		while (rs.next()) {
			teamlist.add(rs.getString("NAME"));
		}
		rs.close();
		statement.close();
		conn.close();
		return teamlist;
	}

	public void addPlayer(Connection conn, String sql) throws SQLException {
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);

		statement.close();
		conn.close();
	}

	public void deletePlayer(Connection conn, String sql) throws SQLException {
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);

		statement.close();
		conn.close();
	}

	// public void updateTeam(Connection conn, String sql) throws SQLException {
	// Statement statement = conn.createStatement();
	// statement.executeUpdate(sql);
	// statement.close();
	// conn.close();
	// }

	// public List<Player> getPlayer(Connection conn, String sql) throws
	// SQLException {
	// Statement statement = conn.createStatement();
	// ResultSet rs = statement.executeQuery(sql);
	// List<Player> res = new ArrayList<Player>();
	//
	// while (rs.next()) {
	// Player player = convertRecordToPlayer(rs);
	// res.add(player);
	// }
	// rs.close();
	// statement.close();
	// conn.close();
	// return res;
	// }

	public List<Player> displayByAll(Connection conn, String sql)
			throws SQLException {
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		List<Player> res = new ArrayList<Player>();

		// int i = 0;
		while (rs.next()) {
			Player player = convertRecordToPlayer(rs);
			res.add(player);
			// System.out.println(res.get(i++).name);
		}
		rs.close();
		statement.close();
		conn.close();
		return res;
	}

	private Player convertRecordToPlayer(ResultSet rs) throws SQLException {
		Player player = new Player();

		player.setName(rs.getString("name"));
		player.setTeamname(rs.getString("teamname"));
		player.setNumber(rs.getString("number"));
		player.setPosition(rs.getString("position"));
		player.setHeight(rs.getString("height"));
		player.setWeight(rs.getString("weight"));
		player.setBirthdate(rs.getString("birthdate"));
		return player;
	}
}