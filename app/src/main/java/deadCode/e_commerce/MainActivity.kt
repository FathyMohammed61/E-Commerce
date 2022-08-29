package deadCode.e_commerce

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import deadCode.e_commerce.Ui.SignUpFragment
import deadCode.e_commerce.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
        toggleFragment()
    }

    private fun toggleFragment() {

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flMainFragment, SignUpFragment())
                .commit()
        }
    }

}