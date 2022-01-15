package oracoes.e.promessas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pedido_a_santa_rita.*

class Pedido_a_Santa_Rita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido_a_santa_rita)

    share_pedido.setOnClickListener {
        val shareIntent = Intent()
        shareIntent.action = Intent.ACTION_SEND
        shareIntent.type="text/plain"
        shareIntent.putExtra(
            Intent.EXTRA_TEXT, getString(R.string.share_app)
                + "\n\n" + getString(R.string.Oracao_do_pedido)
            )
        startActivity(shareIntent)
        }

    navigate_back.setOnClickListener {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}