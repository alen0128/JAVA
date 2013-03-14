package service;

import infrastructure.DBHelper;
import infrastructure.ScoreDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import domain.Player;
import domain.Score;
import domain.Shoot;

public class ScoreService {
	private ScoreDAO dao = new ScoreDAO();

	public List<Player> getPlayer(String teamname) {
		String FIND_PLAYER = "select name,number from member where teamname='"
				+ teamname + "'";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.getPlayer(conn, FIND_PLAYER);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Score> displayScoreByAll() {
		String FIND_ALL = "select * from score order by point desc";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.getScore(conn, FIND_ALL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateScore(String name, String turn, String won, String even,
			String beaten, String goal, String lost, String net, int point) {
		String UPDATE_SCORE = "update score set turn='" + turn + "',won='"
				+ won + "',even='" + even + "',beaten='" + beaten + "',goal='"
				+ goal + "',lost='" + lost + "',net='" + net + "',point='"
				+ point + "' where name='" + name + "'";
		Connection conn = (new DBHelper()).getConnection();

		try {
			dao.updateScore(conn, UPDATE_SCORE);
		} catch (SQLException e) {
		}
	}

	public List<Score> findScore(String name) {
		String FIND_SCORE_BY_NAME = "select * from score where name='" + name
				+ "'";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.getScore(conn, FIND_SCORE_BY_NAME);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Score> findScoreByJudge(String name, String turn) {
		String FIND_SCORE_BY_NAME = "select * from score where name='" + name
				+ "' and turn='" + turn + "'";
		Connection conn = new DBHelper().getConnection();

		try {
			return dao.getScore(conn, FIND_SCORE_BY_NAME);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addScore(String place, String name, String turn, String won,
			String even, String beaten, String goal, String lost, String net,
			int point) {
		String ADD_SCORE = "insert into score values('" + place + "','" + name
				+ "','" + turn + "','" + won + "','" + even + "','" + beaten
				+ "','" + goal + "','" + lost + "','" + net + "','" + point
				+ "')";
		Connection conn = (new DBHelper()).getConnection();

		try {
			dao.addScore(conn, ADD_SCORE);
		} catch (SQLException e) {
		}
	}

	public void clearScore() {
		String CLEAR_SCORE = "delete from score";
		Connection conn = new DBHelper().getConnection();

		try {
			dao.clearScore(conn, CLEAR_SCORE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void sortScore(List<Score> res) {
		clearScore();
		res.get(0).setPlace("1");
		addScore(res.get(0).getPlace(), res.get(0).getName(), res.get(0)
				.getTurn(), res.get(0).getWon(), res.get(0).getEven(),
				res.get(0).getBeaten(), res.get(0).getGoal(), res.get(0)
						.getLost(), res.get(0).getNet(), res.get(0).getPoint());

		int iplace = 1;
		for (int i = 1; i < res.size(); ++i) {
			++iplace;
			if (res.get(i).getPoint() == res.get(i - 1).getPoint()) {
				res.get(i).setPlace(res.get(i - 1).getPlace());
				addScore(res.get(i).getPlace(), res.get(i).getName(), res
						.get(i).getTurn(), res.get(i).getWon(), res.get(i)
						.getEven(), res.get(i).getBeaten(), res.get(i)
						.getGoal(), res.get(i).getLost(), res.get(i).getNet(),
						res.get(i).getPoint());
			} else {
				res.get(i).setPlace(String.valueOf(iplace));
				addScore(res.get(i).getPlace(), res.get(i).getName(), res
						.get(i).getTurn(), res.get(i).getWon(), res.get(i)
						.getEven(), res.get(i).getBeaten(), res.get(i)
						.getGoal(), res.get(i).getLost(), res.get(i).getNet(),
						res.get(i).getPoint());
			}
		}
	}
}
