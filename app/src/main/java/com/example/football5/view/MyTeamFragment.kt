package com.example.football5.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.football5.*
import kotlinx.android.synthetic.main.fragment_my_team.*

class MyTeamFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_team, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var complexity = requireArguments().get(COMPLEXITY).toString()

        var myTeam = ""

        id_logo_mancity.setOnClickListener {
            myTeam = "MCI"
            id_my_team_name.text = "Your Team:Manchester City"
            id_team_next.setBackgroundResource(R.color.orangeMenu)

        }
        id_logo_liverpool.setOnClickListener {
            myTeam = "LIV"
            id_my_team_name.text = "Your Team:Liverpool"
            id_team_next.setBackgroundResource(R.color.orangeMenu)
        }
        id_logo_madrid.setOnClickListener {
            myTeam = "RMA"
            id_my_team_name.text = "Your Team:Real Madrid"
            id_team_next.setBackgroundResource(R.color.orangeMenu)
        }
        id_logo_barcelona.setOnClickListener {
            myTeam = "BAR"
            id_my_team_name.text = "Your Team:Barcelona"
            id_team_next.setBackgroundResource(R.color.orangeMenu)
        }
        id_logo_dortmund.setOnClickListener {
            myTeam = "BOR"
            id_my_team_name.text = "Your Team:Borussia Dortmund"
            id_team_next.setBackgroundResource(R.color.orangeMenu)
        }
        id_logo_bayern.setOnClickListener {
            myTeam = "BAY"
            id_my_team_name.text = "Your Team:Bayern Munchen"
            id_team_next.setBackgroundResource(R.color.orangeMenu)
        }
        id_logo_milan.setOnClickListener {
            myTeam = "MIL"
            id_my_team_name.text = "Your Team:Milan"
            id_team_next.setBackgroundResource(R.color.orangeMenu)
        }
        id_logo_juventus.setOnClickListener {
            myTeam = "JUV"
            id_my_team_name.text = "Your Team:Juventus"
            id_team_next.setBackgroundResource(R.color.orangeMenu)
        }

        id_team_next.setOnClickListener {
            if(myTeam!=""){
                var bundle = Bundle()
                bundle.putString(MY_TEAM_NAME,myTeam)
                bundle.putString(COMPLEXITY,complexity)
                MAIN.navController.navigate(R.id.action_myTeamFragment_to_penaltyFragment,bundle)
            }

        }





    }

}