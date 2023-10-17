import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class PlayerActivity : AppCompatActivity() {
    private var playerScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        val drawCardButton = findViewById<Button>(R.id.drawCardButton)
        val playerScoreTextView = findViewById<TextView>(R.id.playerScoreTextView)

        drawCardButton.setOnClickListener {
            // Simule a lógica de receber uma carta e atualizar a pontuação do jogador.
            playerScore += 10 // Por exemplo, adicione 10 pontos.

            // Envie a pontuação atualizada para a atividade do croupier.
            val intent = Intent(this, CroupierActivity::class.java)
            intent.putExtra("playerScore", playerScore)
            startActivity(intent)
        }
    }
}
