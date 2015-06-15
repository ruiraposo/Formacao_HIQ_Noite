
public class Championship {
	
	private final int id;
	private Team[] teams;
	private int teamsIndex;
	private Game[] games;
	private int gamesIndex;
	
	public Championship( int id, int teamNumber, int gameNumber){
		this.id = id;
		teams = new Team[teamNumber];
		games = new Game[gameNumber];
	}
	
	// ao devolver a referencia da Team criada estamos a associar que a equipa criada jogo num determinado Championship
	public Team addNewTeam( int id, String name ) {
		if ( teamsIndex == teams.length ) {
			return null;
		}
		Team newTeam = new Team( id, name );
		teams[teamsIndex++] = newTeam;
		return newTeam;
	}
	
	public Game sceduleGame( Team teamA, Team teamB ){
		if ( gamesIndex == games.length ) {
			return null;
		}
		Game game = new Game(teamA, teamB);
		games[gamesIndex++] = game;
		return game;
	}
	
	public int getUnfinishedGames(){
		int unfinishedGamesCounter = 0;
		for (Game game : games) {
			if ( game != null && game.isFinished() ) {
				unfinishedGamesCounter++;
			}
		}
		return unfinishedGamesCounter;
	}
	
	
	private class TeamGoal {
		private Team team;
		private int goals;
	}
}
