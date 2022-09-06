package deadCode.e_commerce.Ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import deadCode.e_commerce.databinding.ActivityMainPagesBinding

class MainPagesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainPagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainPagesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}