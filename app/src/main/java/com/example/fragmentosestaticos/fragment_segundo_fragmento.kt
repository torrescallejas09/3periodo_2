package com.example.fragmentosestaticos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text


class fragment_segundo_fragmento : Fragment() {

    lateinit var mensaje: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            parentFragmentManager.setFragmentResultListener("key", this){requestKey,bundle ->
                val resultRecieved = bundle.getString("valor_campo").toString()
                mensaje.setText(resultRecieved)
            }

        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_segundo_fragmento, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mensaje = view.findViewById(R.id.txt_texto_recibido)
    }

}