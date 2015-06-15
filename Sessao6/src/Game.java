
public class Game {
	
	private final Team teamA; // para que não tenhamos troca de equipa
	
	private int goalCounterTeamA;
	
	private final Team teamB;
	
	private int goalCounterTeamB;
	
	private boolean isFinished;
	
	public Game( Team teamA, Team teamB ) {
		this.teamA = teamA;
		this.teamB = teamB;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void finish() {
		this.isFinished = true;
	}
	
	public void teamAScore() {
		if ( !isFinished ){
			goalCounterTeamA++;
		}
	}

	public void teamBScore() {
		if ( !isFinished ){
			goalCounterTeamB++;
		}
	}
	
	public Team getTeamA() {
		return teamA;
	}
	
	public Team getTeamB() {
		return teamB;
	}
	
	public int getGoalCounterTeamA() {
		return goalCounterTeamA;
	}
	
	public int getGoalCounterTeamB() {
		return goalCounterTeamB;
	}
}
