fun main(args: Array<String>) {
    val footballPlayer1 = FootballPlayer("Sunil Chetri")
    val footballPlayer2 = FootballPlayer("Ronaldo")
    val cricketPlayer1 = CricketPlayer("Rohit Sharma")
    val cricketPlayer2 = CricketPlayer("Virat Kohli")

    val footballTeam = Team<FootballPlayer>("Football Team", mutableListOf(footballPlayer1))
    footballTeam.addPlayers(footballPlayer2)
    val cricketTeam = Team("Cricket Team", mutableListOf(cricketPlayer1))
    cricketTeam.addPlayers(cricketPlayer2)
}

class Team<T: Player> (val name: String, val players: MutableList<T>){
    fun addPlayers(player: T){
        if (players.contains(player)){
            println("Player: ${(player as Player).name} is already in the ${this.name}")
        } else {
            players.add(player)
            println("Player: ${player.name} was added in the  ${this.name}")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String): Player(name)
class CricketPlayer(name: String): Player(name)