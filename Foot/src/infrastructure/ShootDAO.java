package infrastructure;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Shoot;

public class ShootDAO {
	public List<Shoot> getShoot(Connection conn, String sql)
			throws SQLException {
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		List<Shoot> res = new ArrayList<Shoot>();

		while (rs.next()) {
			Shoot shoot = convertRecordToShoot(rs);
			res.add(shoot);
		}
		rs.close();
		statement.close();
		conn.close();
		return res;
	}

	public void addShoot(Connection conn, String sql) throws SQLException {
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);

		statement.close();
		conn.close();
	}

	public void updateShoot(Connection conn, String sql) throws SQLException {
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);

		statement.close();
		conn.close();
	}

	public void clearShoot(Connection conn, String sql) throws SQLException {
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);

		statement.close();
		conn.close();
	}

	private Shoot convertRecordToShoot(ResultSet rs) throws SQLException {
		Shoot shoot = new Shoot();

		shoot.setRank(rs.getString("rank"));
		shoot.setName(rs.getString("name"));
		shoot.setTeamname(rs.getString("teamname"));
		shoot.setNumber(rs.getString("number"));
		shoot.setBallnumber(rs.getInt("ballnumber"));
		return shoot;
	}
}
