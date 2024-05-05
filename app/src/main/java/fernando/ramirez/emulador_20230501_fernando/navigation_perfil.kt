package fernando.ramirez.emulador_20230501_fernando

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class navigation_perfil : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_navigation_perfil, container, false)

        val name = root.findViewById<TextView>(R.id.lblName)
        val btn = root.findViewById<Button>(R.id.btnName)

       btn.setOnClickListener {
           val nombre = "¡Hola, mi nombre es Fernando!"
           name.text = nombre
       }
        return root;
    }


}