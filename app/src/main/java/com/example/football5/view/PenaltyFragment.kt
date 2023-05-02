package com.example.football5.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.football5.*
import kotlinx.android.synthetic.main.fragment_penalty.*

class PenaltyFragment : Fragment() {

    var currentLevel:Int = 1

    var randomPlaceToGatesEasy:Int = 0

    var randomPlaceToGatesMedium1:Int = 0
    var randomPlaceToGatesMedium2:Int = 0

    var randomPlaceToGatesHard1:Int = 0
    var randomPlaceToGatesHard2:Int = 0
    var randomPlaceToGatesHard3:Int = 0

    var goals:Int = 0

    var complexity:String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_penalty, container, false)
    }

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var myTeamName = requireArguments().get(MY_TEAM_NAME).toString()
        complexity = requireArguments().get(COMPLEXITY).toString()


        var listOpponent = LISTTEAMS
        listOpponent.remove(myTeamName)
        var randomOpponent = listOpponent.shuffled()[1]

        id_penalty_match.text = "$myTeamName vs $randomOpponent"
        id_penalty_goal_or_not.text = "choose a place to strike"

        when(myTeamName){
            "MCI" -> { id_penalty_logo_my_team.setBackgroundResource(R.drawable.mancity) }
            "LIV" -> { id_penalty_logo_my_team.setBackgroundResource(R.drawable.liverpool) }
            "RMA" -> { id_penalty_logo_my_team.setBackgroundResource(R.drawable.madrid) }
            "BAR" -> { id_penalty_logo_my_team.setBackgroundResource(R.drawable.barcelona) }
            "BOR" -> { id_penalty_logo_my_team.setBackgroundResource(R.drawable.dortmund) }
            "BAY" -> { id_penalty_logo_my_team.setBackgroundResource(R.drawable.bayern) }
            "MIL" -> { id_penalty_logo_my_team.setBackgroundResource(R.drawable.milan) }
            "JUV" -> { id_penalty_logo_my_team.setBackgroundResource(R.drawable.juventus) }
        }
        when(randomOpponent){
            "MCI" -> { id_penalty_logo_opponent.setBackgroundResource(R.drawable.mancity) }
            "LIV" -> { id_penalty_logo_opponent.setBackgroundResource(R.drawable.liverpool) }
            "RMA" -> { id_penalty_logo_opponent.setBackgroundResource(R.drawable.madrid) }
            "BAR" -> { id_penalty_logo_opponent.setBackgroundResource(R.drawable.barcelona) }
            "BOR" -> { id_penalty_logo_opponent.setBackgroundResource(R.drawable.dortmund) }
            "BAY" -> { id_penalty_logo_opponent.setBackgroundResource(R.drawable.bayern) }
            "MIL" -> { id_penalty_logo_opponent.setBackgroundResource(R.drawable.milan) }
            "JUV" -> { id_penalty_logo_opponent.setBackgroundResource(R.drawable.juventus) }
        }

        ////////////////////////////////////////////////////////////////////////////////////////////

        if(complexity=="easy"){
            randomPlaceToGatesEasy = listOf(1,2,3,4,5).shuffled()[1]
        }
        if(complexity=="medium"){
            var list = listOf(1,2,3,4,5).shuffled()
            randomPlaceToGatesMedium1 = list[1]
            randomPlaceToGatesMedium2 = list[2]
        }
        if(complexity=="hard"){
            var list = listOf(1,2,3,4,5).shuffled()
            randomPlaceToGatesHard1 = list[1]
            randomPlaceToGatesHard2 = list[2]
            randomPlaceToGatesHard3 = list[3]
        }

        id_vorota_1.setOnClickListener {
            if(complexity=="easy"){
                if(randomPlaceToGatesEasy!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
            if(complexity=="medium"){
                if(randomPlaceToGatesMedium1!=1 && randomPlaceToGatesMedium2!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
            if(complexity=="hard"){
                if(randomPlaceToGatesHard1!=1 && randomPlaceToGatesHard2!=1 && randomPlaceToGatesHard3!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
        }

        id_vorota_2.setOnClickListener {
            if(complexity=="easy"){
                if(randomPlaceToGatesEasy!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
            if(complexity=="medium"){
                if(randomPlaceToGatesMedium1!=1 && randomPlaceToGatesMedium2!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
            if(complexity=="hard"){
                if(randomPlaceToGatesHard1!=1 && randomPlaceToGatesHard2!=1 && randomPlaceToGatesHard3!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
        }

        id_vorota_3.setOnClickListener {
            if(complexity=="easy"){
                if(randomPlaceToGatesEasy!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
            if(complexity=="medium"){
                if(randomPlaceToGatesMedium1!=1 && randomPlaceToGatesMedium2!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
            if(complexity=="hard"){
                if(randomPlaceToGatesHard1!=1 && randomPlaceToGatesHard2!=1 && randomPlaceToGatesHard3!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
        }

        id_vorota_4.setOnClickListener {
            if(complexity=="easy"){
                if(randomPlaceToGatesEasy!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
            if(complexity=="medium"){
                if(randomPlaceToGatesMedium1!=1 && randomPlaceToGatesMedium2!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
            if(complexity=="hard"){
                if(randomPlaceToGatesHard1!=1 && randomPlaceToGatesHard2!=1 && randomPlaceToGatesHard3!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
        }

        id_vorota_5.setOnClickListener {
            if(complexity=="easy"){
                if(randomPlaceToGatesEasy!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
            if(complexity=="medium"){
                if(randomPlaceToGatesMedium1!=1 && randomPlaceToGatesMedium2!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
            if(complexity=="hard"){
                if(randomPlaceToGatesHard1!=1 && randomPlaceToGatesHard2!=1 && randomPlaceToGatesHard3!=1){
                    setGreenColor(currentLevel)
                    updateLevelGoal()
                }else{
                    setRedColor(currentLevel)
                    updateLevelNotGoal()
                }
            }
        }

        id_penalty_again.setOnClickListener {

            currentLevel = 1
            goals = 0

            //randomPlaceToGatesEasy = listOf(1,2,3,4,5).shuffled()[1]
            if(complexity=="easy"){
                randomPlaceToGatesEasy = listOf(1,2,3,4,5).shuffled()[1]
            }
            if(complexity=="medium"){
                var list = listOf(1,2,3,4,5).shuffled()
                randomPlaceToGatesMedium1 = list[1]
                randomPlaceToGatesMedium2 = list[2]
            }
            if(complexity=="hard"){
                var list = listOf(1,2,3,4,5).shuffled()
                randomPlaceToGatesHard1 = list[1]
                randomPlaceToGatesHard2 = list[2]
                randomPlaceToGatesHard3 = list[3]
            }

            id_penalty_again.isVisible = false

            id_vorota_1.isEnabled = true
            id_vorota_2.isEnabled = true
            id_vorota_3.isEnabled = true
            id_vorota_4.isEnabled = true
            id_vorota_5.isEnabled = true

            id_penalty_pr1.setBackgroundResource(R.color.white)
            id_penalty_pr2.setBackgroundResource(R.color.white)
            id_penalty_pr3.setBackgroundResource(R.color.white)
            id_penalty_pr4.setBackgroundResource(R.color.white)
            id_penalty_pr5.setBackgroundResource(R.color.white)

            id_penalty_goal_or_not.text = "choose a place to strike"

        }

    }

    private fun setRedColor(level:Int){
        when(level){
            1 -> { id_penalty_pr1.setBackgroundResource(R.color.redNotGoal) }
            2 -> { id_penalty_pr2.setBackgroundResource(R.color.redNotGoal) }
            3 -> { id_penalty_pr3.setBackgroundResource(R.color.redNotGoal) }
            4 -> { id_penalty_pr4.setBackgroundResource(R.color.redNotGoal) }
            5 -> { id_penalty_pr5.setBackgroundResource(R.color.redNotGoal) }
        }
    }

    private fun setGreenColor(level:Int){
        when(level){
            1 -> { id_penalty_pr1.setBackgroundResource(R.color.greenGoal) }
            2 -> { id_penalty_pr2.setBackgroundResource(R.color.greenGoal) }
            3 -> { id_penalty_pr3.setBackgroundResource(R.color.greenGoal) }
            4 -> { id_penalty_pr4.setBackgroundResource(R.color.greenGoal) }
            5 -> { id_penalty_pr5.setBackgroundResource(R.color.greenGoal) }
        }
    }

    private fun updateLevelNotGoal(){
        id_penalty_goal_or_not.text = "NOT GOAL"
        if(currentLevel!= 5){
            currentLevel+=1
            if(complexity=="easy"){
                randomPlaceToGatesEasy = listOf<Int>(1,2,3,4,5).shuffled()[1]
            }
            if(complexity=="medium"){
                var list = listOf(1,2,3,4,5).shuffled()
                randomPlaceToGatesMedium1 = list[1]
                randomPlaceToGatesMedium2 = list[2]
            }
            if(complexity=="hard"){
                var list = listOf(1,2,3,4,5).shuffled()
                randomPlaceToGatesHard1 = list[1]
                randomPlaceToGatesHard2 = list[2]
                randomPlaceToGatesHard3 = list[3]
            }
            //Toast.makeText(requireContext(),"$goals",Toast.LENGTH_SHORT).show()
        }else{
            if(goals>=3){
                id_penalty_goal_or_not.text = "You win!"
            }else{
                id_penalty_goal_or_not.text = "You've lost..."
            }
            id_penalty_again.isVisible = true
            id_vorota_1.isEnabled = false
            id_vorota_2.isEnabled = false
            id_vorota_3.isEnabled = false
            id_vorota_4.isEnabled = false
            id_vorota_5.isEnabled = false
            //Toast.makeText(requireContext()," итого $goals",Toast.LENGTH_SHORT).show()

            if(complexity=="easy"){
                if(MAIN.getRecordEasy()<goals){
                    MAIN.setRecordEasy(goals)
                }
            }
            if(complexity=="medium"){
                if(MAIN.getRecordMedium()<goals){
                    MAIN.setRecordMedium(goals)
                }
            }
            if(complexity=="hard"){
                if(MAIN.getRecordHard()<goals){
                    MAIN.setRecordHard(goals)
                }
            }

        }
    }

    private fun updateLevelGoal(){
        id_penalty_goal_or_not.text = "GOAL!"
        if(currentLevel!= 5){
            goals+=1
            currentLevel+=1
            if(complexity=="easy"){
                randomPlaceToGatesEasy = listOf<Int>(1,2,3,4,5).shuffled()[1]
            }
            if(complexity=="medium"){
                var list = listOf(1,2,3,4,5).shuffled()
                randomPlaceToGatesMedium1 = list[1]
                randomPlaceToGatesMedium2 = list[2]
            }
            if(complexity=="hard"){
                var list = listOf(1,2,3,4,5).shuffled()
                randomPlaceToGatesHard1 = list[1]
                randomPlaceToGatesHard2 = list[2]
                randomPlaceToGatesHard3 = list[3]
            }
            //Toast.makeText(requireContext(),"$goals",Toast.LENGTH_SHORT).show()
        }else{
            goals+=1
            if(goals>=3){
                id_penalty_goal_or_not.text = "You win!"
            }else{
                id_penalty_goal_or_not.text = "You've lost..."
            }
            id_penalty_again.isVisible = true
            id_vorota_1.isEnabled = false
            id_vorota_2.isEnabled = false
            id_vorota_3.isEnabled = false
            id_vorota_4.isEnabled = false
            id_vorota_5.isEnabled = false
            //Toast.makeText(requireContext(),"итого $goals",Toast.LENGTH_SHORT).show()

            if(complexity=="easy"){
                if(MAIN.getRecordEasy()<goals){
                    MAIN.setRecordEasy(goals)
                }
            }
            if(complexity=="medium"){
                if(MAIN.getRecordMedium()<goals){
                    MAIN.setRecordMedium(goals)
                }
            }
            if(complexity=="hard"){
                if(MAIN.getRecordHard()<goals){
                    MAIN.setRecordHard(goals)
                }
            }

        }
    }


}