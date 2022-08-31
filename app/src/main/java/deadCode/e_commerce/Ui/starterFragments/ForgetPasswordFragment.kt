package deadCode.e_commerce.Ui.starterFragments


import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context.NOTIFICATION_SERVICE
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import deadCode.e_commerce.databinding.FragmentForgetPasswordBinding


class ForgetPasswordFragment : Fragment() {

    private lateinit var binding: FragmentForgetPasswordBinding

    val CHANNEL_ID = "CHANNEL_ID"
    val CHANNEL_NAME = "CHANNEL_NAME"
    val NOYIF_ID = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentForgetPasswordBinding.inflate(inflater)
        sendPassword()
        return binding.root
    }


    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                CHANNEL_NAME,
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                lightColor = Color.BLUE
                enableLights(true)
                enableVibration(true)
            }

            val manager =
                this.activity?.getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }

    }


    private fun sendPassword() {
        binding.apply {
            btnSend.setOnClickListener {
                if (IdForgetPassword.text!!.isEmpty()) {
                    Toast.makeText(activity, "PLEASE ENTER YOUR MAIL", Toast.LENGTH_LONG).show()
                } else {
                    createNotificationChannel()
                    Log.d("noyi", "clicled")
                }

            }
        }
    }


}