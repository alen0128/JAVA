package service;

import infrastructure.DBHelper;
import infrastructure.TeamDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import domain.Team;

public class TeamService {
	private TeamDAO dao = new TeamDAO();

	public void addTeam(String name, String masterplace, String coach) {
		String ADD_TEAM = "insert into team values('" + name + "','"
				+ masterplace + "','" + coach + "')";
		Connection conn = new DBHelper().getConnection();

		try {
			dao.addTeam(conn, ADD_TEAM);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteTeam(String name) {
		String DELETE_TEAM = "delete from team where NAME='" + name + "'";
		Connection conn = new DBHelper().getConnection();

		try {
			dao.deleteTeam(conn, DELETE_TEAM);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateTeam(String oldName, String newName, String masterplace,
			String coach) {
		Connection conn = new DBHelper().getConnection();
		try {
			conn.setAutoCommit(false);
			deleteTeam(oldName);
			addTeam(newName, masterplace, coach);
			conn.commit();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Team> findTeam(String name) {
		String FIND_NAME = "select * from team where NAME = '" + name + "'";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.getTeam(conn, FIND_NAME);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Team> findTeamDim(String name) {
		String FIND_NAME_DIM = "select * from team where NAME like '%" + name
				+ "%'";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.getTeam(conn, FIND_NAME_DIM);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Team> findAll() {
		String FIND_ALL = "select * from team";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.getTeam(conn, FIND_ALL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
