package deadCode.e_commerce.Ui.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import deadCode.e_commerce.R
import deadCode.e_commerce.Ui.mainPagesFragments.MainPagesFragment
import deadCode.e_commerce.databinding.ActivityMainPagesBinding

@Suppress("DEPRECATION")
class MainPagesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainPagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainPagesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
        currentFragment(MainPagesFragment())
        toggleBetweenFragments()
    }

    private fun toggleBetweenFragments() {
        binding.bnvMainPages.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                  currentFragment(MainPagesFragment())
                }
                R.id.shop -> {
                    Toast.makeText(this, "Shop", Toast.LENGTH_SHORT).show()
                }
                R.id.bag -> {
                    Toast.makeText(this, "Bag", Toast.LENGTH_SHORT).show()
                }
                R.id.fav -> {
                    Toast.makeText(this, "FAV", Toast.LENGTH_SHORT).show()
                }
                R.id.profile -> {
                    Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
                }


            }
            true
        }
    }



   private fun currentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flMainPagesFragment, fragment)
            commit()
        }

    }
}