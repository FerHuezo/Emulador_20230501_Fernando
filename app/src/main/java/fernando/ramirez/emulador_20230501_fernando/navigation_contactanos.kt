package fernando.ramirez.emulador_20230501_fernando

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class navigation_contactanos : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_navigation_contactanos, container, false)

        val correo = root.findViewById<TextView>(R.id.lblCorreo)
        val btn = root.findViewById<Button>(R.id.btnCorreo)

        btn.setOnClickListener {
            val text = "Contactanos por este medio:20230501@ricaldone.edu.sv"
            correo.text = text
        }
        return root;
    }

}