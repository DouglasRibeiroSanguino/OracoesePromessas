package oracoes.e.promessasnew

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import oracoes.e.promessasnew.databinding.ActivityOracaoDoPaiNossoBinding

class Oracao_do_Pai_Nosso : AppCompatActivity() {

    private lateinit var binding: ActivityOracaoDoPaiNossoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOracaoDoPaiNossoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shareOracao.setOnClickListener {
            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.type="text/plain"
            shareIntent.putExtra(
                Intent.EXTRA_TEXT, getString(R.string.share_app)
                        + "\n\n" + getString(R.string.Oracao_do_Pai_Nosso_text)
            )
            startActivity(shareIntent)
        }

        binding.navigateBack.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }

    override fun onBackPressed() {
        val i = Intent(this, MainActivity::class.java)
        i.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(i)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        super.onBackPressed()
    }
}