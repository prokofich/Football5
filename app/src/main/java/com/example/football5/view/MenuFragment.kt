package com.example.football5.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import com.example.football5.MAIN
import com.example.football5.PENALTY
import com.example.football5.PENALTY_RECORD
import com.example.football5.R
import kotlinx.android.synthetic.main.fragment_menu.*

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    @SuppressLint("FragmentBackPressedCallback")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        id_menu_p1.setOnClickListener {
            MAIN.navController.navigate(R.id.action_menuFragment_to_complexityFragment)
        }


        id_menu_records.setOnClickListener {
            MAIN.navController.navigate(R.id.action_menuFragment_to_recordsFragment)
        }

        id_menu_exit.setOnClickListener {
            MAIN.finish()
        }


        requireActivity().onBackPressedDispatcher.addCallback(this){
            MAIN.finish()
        }

    }


}