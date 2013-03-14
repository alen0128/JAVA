package service;

import infrastructure.PlayerDAO;
import infrastructure.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Player;

public class PlayerService {
	private PlayerDAO dao = new PlayerDAO();

	public List<String> getTeam() {
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.getTeam(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addPlayer(String name, String position, String number,
			String teamname, int height, int weight, String birthdate) {
		String ADD_PLAYER = "insert into member values('" + name + "','"
				+ teamname + "','" + number + "','" + position + "','" + height
				+ "','" + weight + "','" + birthdate + "')";
		Connection conn = (new DBHelper()).getConnection();

		System.out.println(ADD_PLAYER);
		try {
			dao.addPlayer(conn, ADD_PLAYER);
		} catch (SQLException e) {
		}
	}

	public List<Player> displayPlayerByAll() {
		String FIND_ALL = "select * from member";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.displayByAll(conn, FIND_ALL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Player> displayPlayerByTeam(String teamname) {
		String FIND_BY_TEAM = "select * from member where teamname = '"
				+ teamname + "'";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.displayByAll(conn, FIND_BY_TEAM);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Player> displayPlayerByPosition(String position) {
		String FIND_BY_POSITION = "select * from member where position = '"
				+ position + "'";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.displayByAll(conn, FIND_BY_POSITION);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Player> displayPlayerByName(String name) {
		String FIND_BY_NAME = "select * from member where name = '" + name
				+ "'";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.displayByAll(conn, FIND_BY_NAME);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Player> displayPlayerByDimName(String name) {
		String FIND_BY_DIM_NAME = "select * from member where name like '%"
				+ name + "%'";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.displayByAll(conn, FIND_BY_DIM_NAME);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// public List<Player> displayPlayerByNameAndPosition(String name, String
	// position) {
	// String FIND_BY_DIM_NAME_AND_POSITION =
	// "select * from member where name='"+name+"',position='"+position+"'";
	// Connection conn = new DBHelper().getConnection();
	//
	// try {
	// return dao.displayByAll(conn, FIND_BY_DIM_NAME_AND_POSITION);
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// return null;
	// }

	public List<Player> displayPlayerByNameAndNumber(String teamname,
			String name, String number) {
		String FIND_BY_NAME_AND_POSITION = "select * from member where teamname='"
				+ teamname
				+ "' and name='"
				+ name
				+ "' and number='"
				+ number
				+ "'";

		System.out.println("select * from member where teamname='" + teamname
				+ "' and name='" + name + "' and number='" + number + "'");
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.displayByAll(conn, FIND_BY_NAME_AND_POSITION);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Player> deletePlayerByNameAndNumber(String teamname,
			String name, String number) {
		String DELETE_BY_NAME_AND_POSITION = "delete from member where teamname='"
				+ teamname
				+ "'and name='"
				+ name
				+ "' and number='"
				+ number
				+ "'";
		Connection conn = new DBHelper().getConnection();

		try {
			dao.deletePlayer(conn, DELETE_BY_NAME_AND_POSITION);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Player> searchPlayer(String position, String teamname,
			String heightfrom, String heightto, String weightfrom,
			String weightto, String birthdatefrom, String birthdateto,
			String agefrom, String ageto) {
		boolean flag = false;
		String sql = "select * from member";
		if (!heightfrom.isEmpty() && !heightto.isEmpty()) {
			flag = true;
			sql += " where height between '" + heightfrom + "' and '"
					+ heightto + "'";
		}
		if (!weightfrom.isEmpty() && !weightto.isEmpty()) {
			if (flag)
				sql += " and";
			else {
				flag = true;
				sql += " where";
			}

			sql += " weight between '" + weightfrom + "' and '" + weightto
					+ "'";
		}
		if (!birthdatefrom.isEmpty() && !birthdateto.isEmpty()) {
			if (flag)
				sql += " and";
			else {
				flag = true;
				sql += " where";
			}

			sql += " birthdate between '" + birthdatefrom + "' and '"
					+ birthdateto + "'";
		}
		if (!position.isEmpty()) {
			if (flag)
				sql += " and";
			else {
				flag = true;
				sql += " where";
			}

			sql += " position = '" + position + "'";
		}
		if (!teamname.isEmpty()) {
			if (flag)
				sql += " and";
			else {
				flag = true;
				sql += " where";
			}
			sql += " teamname = '" + teamname + "'";
		}

		if (flag == false) {
			// JOptionPane.showMessageDialog(null, "请输入查询条件", "提示",
			// JOptionPane.INFORMATION_MESSAGE);
			return null;
		} else {
			System.out.println(sql);
			Connection conn = new DBHelper().getConnection();

			try {
				return dao.displayByAll(conn, sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
	}
}
