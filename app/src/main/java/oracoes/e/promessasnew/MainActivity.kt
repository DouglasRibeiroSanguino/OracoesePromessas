package oracoes.e.promessasnew

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import oracoes.e.promessasnew.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.btnSantaRita.setOnClickListener {
        binding.progressBar.visibility = View.VISIBLE // para exibir o loading
        binding.textpleasewait.visibility = View.VISIBLE

        Handler(Looper.getMainLooper()).postDelayed(
            {
                binding.progressBar.visibility = View.GONE // para ocultar o loading  // This method will be executed once the timer is over
                binding.textpleasewait.visibility = View.GONE

                val i = Intent(this, Pedido_a_Santa_Rita::class.java)
                startActivity(i)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

            },
            2000 // value in milliseconds
        )

    }

    binding.btnPaiNosso.setOnClickListener {
        binding.progressBar.visibility = View.VISIBLE // para exibir o loading
        binding.textpleasewait.visibility = View.VISIBLE

        Handler(Looper.getMainLooper()).postDelayed(
            {
                binding.progressBar.visibility = View.GONE // para ocultar o loading  // This method will be executed once the timer is over
                binding.textpleasewait.visibility = View.GONE

                val i = Intent(this, Oracao_do_Pai_Nosso::class.java)
                startActivity(i)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

            },
            2000 // value in milliseconds
        )

    }

}
    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }

}