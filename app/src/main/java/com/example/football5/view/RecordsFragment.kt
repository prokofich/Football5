package com.example.football5.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.football5.MAIN
import com.example.football5.R
import kotlinx.android.synthetic.main.fragment_records.*

class RecordsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_records, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var recordEasy = MAIN.getRecordEasy()
        var recordMedium = MAIN.getRecordMedium()
        var recordHard = MAIN.getRecordHard()

        id_record_easy.text = "Record easy: $recordEasy"
        id_record_medium.text = "Record medium: $recordMedium"
        id_record_hard.text = "Record hard: $recordHard"


    }


}