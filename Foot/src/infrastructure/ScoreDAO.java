package infrastructure;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Player;
import domain.Score;

public class ScoreDAO {
	public List<Player> getPlayer(Connection conn, String sql)
			throws SQLException {
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		List<Player> playerlist = new ArrayList<Player>();

		while (rs.next()) {
			Player player = convertRecordToPlayer(rs);
			playerlist.add(player);
		}

		// System.out.println(playerlist.get(20).name);
		rs.close();
		statement.close();
		conn.close();
		return playerlist;
	}

	public void addScore(Connection conn, String sql) throws SQLException {
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);

		statement.close();
		conn.close();
	}

	public void updateScore(Connection conn, String sql) throws SQLException {
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);

		statement.close();
		conn.close();
	}

	public List<Score> getScore(Connection conn, String sql)
			throws SQLException {
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		List<Score> res = new ArrayList<Score>();

		while (rs.next()) {
			Score score = convertRecordToTeam(rs);
			res.add(score);
		}
		rs.close();
		statement.close();
		conn.close();
		return res;
	}

	public void clearScore(Connection conn, String sql) throws SQLException {
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);

		statement.close();
		conn.close();
	}

	private Player convertRecordToPlayer(ResultSet rs) throws SQLException {
		Player player = new Player();

		player.setName(rs.getString("name"));
		player.setNumber(rs.getString("number"));
		return player;
	}

	private Score convertRecordToTeam(ResultSet rs) throws SQLException {
		Score score = new Score();

		score.setPlace(rs.getString("place"));
		score.setName(rs.getString("name"));
		score.setTurn(rs.getString("turn"));
		score.setWon(rs.getString("won"));
		score.setEven(rs.getString("even"));
		score.setBeaten(rs.getString("beaten"));
		score.setGoal(rs.getString("goal"));
		score.setLost(rs.getString("lost"));
		score.setNet(rs.getString("net"));
		score.setPoint(rs.getInt("point"));
		return score;
	}
}
