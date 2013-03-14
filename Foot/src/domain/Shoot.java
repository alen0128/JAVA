package domain;

public class Shoot {
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getBallnumber() {
		return ballnumber;
	}

	public void setBallnumber(int ballnumber) {
		this.ballnumber = ballnumber;
	}

	String rank;
	String name;
	String teamname;
	String number;
	int ballnumber;
}
