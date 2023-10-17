import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CroupierActivity : AppCompatActivity() {
    private var croupierScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_croupier)

        val intent = intent
        val playerScore = intent.getIntExtra("playerScore", 0)

        // Atualize a pontuação do croupier com base na lógica do jogo.
        croupierScore = playerScore + 5 // Exemplo simples.

        val croupierScoreTextView = findViewById<TextView>(R.id.croupierScoreTextView)
        croupierScoreTextView.text = "Croupier Score: $croupierScore"
    }
}
