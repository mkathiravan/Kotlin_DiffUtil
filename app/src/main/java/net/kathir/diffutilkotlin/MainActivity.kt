package net.kathir.diffutilkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val repository = PlayerRepository()
    private val playerAdapter = PlayerAdapter(repository.actorsSortedByRating)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = playerAdapter
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.sort_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.sort_by_name -> {
                playerAdapter.swap(repository.actorsSortedByName)
                true
            }
            R.id.sort_by_rating -> {
                playerAdapter.swap(repository.actorsSortedByRating)
                true
            }
            R.id.sort_by_birth -> {
                playerAdapter.swap(repository.actorsSortedByYearOfBirth)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
