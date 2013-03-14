package service;

import infrastructure.DBHelper;
import infrastructure.ShootDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import domain.Shoot;

public class ShootService {
	private ShootDAO dao = new ShootDAO();

	public List<Shoot> displayShootByAll() {
		String FIND_ALL = "select * from shoot order by ballnumber desc";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.getShoot(conn, FIND_ALL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Shoot> findShoot(String name) {
		String FIND_BY_NAME = "select * from shoot where name='" + name + "'";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.getShoot(conn, FIND_BY_NAME);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addShoot(String rank, String name, String teamname,
			String number, int ballnumber) {
		String ADD_SHOOT = "insert into shoot values('" + rank + "','" + name
				+ "','" + teamname + "','" + number + "','" + ballnumber + "')";
		Connection conn = new DBHelper().getConnection();

		try {
			dao.addShoot(conn, ADD_SHOOT);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateShoot(String rank, String name, String teamname,
			String number, int ballnumber) {
		String UPDATE_SHOOT = "update shoot set rank='" + rank
				+ "', teamname='" + teamname + "', number='" + number
				+ "', ballnumber='" + ballnumber + "' where name='" + name
				+ "'";
		Connection conn = new DBHelper().getConnection();

		try {
			dao.updateShoot(conn, UPDATE_SHOOT);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void clearShoot() {
		String CLEAR_SHOOT = "delete from shoot";
		Connection conn = new DBHelper().getConnection();

		try {
			dao.clearShoot(conn, CLEAR_SHOOT);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void sortShoot(List<Shoot> res) {
		clearShoot();
		res.get(0).setRank("1");
		addShoot(res.get(0).getRank(), res.get(0).getName(), res.get(0)
				.getTeamname(), res.get(0).getNumber(), res.get(0)
				.getBallnumber());

		int irank = 1;
		for (int i = 1; i < res.size(); ++i) {
			++irank;
			if (res.get(i).getBallnumber() == res.get(i - 1).getBallnumber()) {
				res.get(i).setRank(res.get(i - 1).getRank());
				addShoot(res.get(i).getRank(), res.get(i).getName(), res.get(i)
						.getTeamname(), res.get(i).getNumber(), res.get(i)
						.getBallnumber());
			} else {
				res.get(i).setRank(String.valueOf(irank));
				addShoot(res.get(i).getRank(), res.get(i).getName(), res.get(i)
						.getTeamname(), res.get(i).getNumber(), res.get(i)
						.getBallnumber());
			}
		}
	}
}
