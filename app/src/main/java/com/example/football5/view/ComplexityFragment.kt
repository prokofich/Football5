package com.example.football5.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.football5.COMPLEXITY
import com.example.football5.MAIN
import com.example.football5.PENALTY
import com.example.football5.R
import kotlinx.android.synthetic.main.fragment_complexity.*

class ComplexityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_complexity, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        id_complexity_easy.setOnClickListener {
            var bundle = Bundle()
            bundle.putString(COMPLEXITY,"easy")
            MAIN.navController.navigate(R.id.action_complexityFragment_to_myTeamFragment,bundle)
        }

        id_complexity_medium.setOnClickListener {
            var bundle = Bundle()
            bundle.putString(COMPLEXITY,"medium")
            MAIN.navController.navigate(R.id.action_complexityFragment_to_myTeamFragment,bundle)
        }

        id_complexity_hard.setOnClickListener {
            var bundle = Bundle()
            bundle.putString(COMPLEXITY,"hard")
            MAIN.navController.navigate(R.id.action_complexityFragment_to_myTeamFragment,bundle)
        }

    }

}