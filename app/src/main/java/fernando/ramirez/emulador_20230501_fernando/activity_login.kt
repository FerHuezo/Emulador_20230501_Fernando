package fernando.ramirez.emulador_20230501_fernando

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn = findViewById<ImageButton>(R.id.btnSingIn)
        val txt = findViewById<TextView>(R.id.txtSingIn)

        btn.setOnClickListener {
            val pantalla = Intent(this, MainActivity::class.java)
            startActivity(pantalla)
        }
        txt.setOnClickListener {
            val pantalla = Intent(this, MainActivity::class.java)
            startActivity(pantalla)
        }

    }
}