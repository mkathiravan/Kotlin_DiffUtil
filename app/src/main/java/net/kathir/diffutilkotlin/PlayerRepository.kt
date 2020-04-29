package net.kathir.diffutilkotlin

class PlayerRepository
{
    private val players = listOf(
        Player(1, "Rooney", 10, 1986),
        Player(2, "Antio Greezeman", 9, 1987),
        Player(3, "Gerrrad", 8, 1985),
        Player(4, "Robin Van Persie", 7, 1986),
        Player(5, "Ronoldo-Brazil", 6, 1985),
        Player(6, "Henry", 5, 1977),
        Player(7, "Messi", 4, 1987),
        Player(8, "Ronoldo(CR7)", 3, 1985),
        Player(9, "Beckham", 2, 1975),
        Player(10, "Zidane", 1, 1972)
    )

    val actorsSortedByRating: List<Player>
        get() = players.sortedByDescending { it.rating }

    val actorsSortedByName: List<Player>
        get() = players.sortedBy { it.name }

    val actorsSortedByYearOfBirth: List<Player>
        get() = players.sortedBy { it.yearOfBirth }
}