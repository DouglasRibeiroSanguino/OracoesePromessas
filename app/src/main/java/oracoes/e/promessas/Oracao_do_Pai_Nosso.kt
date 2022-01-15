package oracoes.e.promessas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_oracao_do_pai_nosso.*
import kotlinx.android.synthetic.main.activity_pedido_a_santa_rita.*
import kotlinx.android.synthetic.main.activity_pedido_a_santa_rita.navigate_back

class Oracao_do_Pai_Nosso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oracao_do_pai_nosso)

        share_oracao.setOnClickListener {
            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.type="text/plain"
            shareIntent.putExtra(
                Intent.EXTRA_TEXT, getString(R.string.share_app)
                        + "\n\n" + getString(R.string.Oracao_do_Pai_Nosso_text)
            )
            startActivity(shareIntent)
        }

        navigate_back.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }

    override fun onBackPressed() {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        super.onBackPressed()
    }
}