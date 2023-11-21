package com.newage.pomodoro_initial.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.timers.stopwatch.core.common.android.StopwatchFragment
import com.timers.stopwatch.feature.pomodoro_initial.presentation.R
import com.timers.stopwatch.feature.pomodoro_initial.presentation.databinding.FragmentPomodoroInitialBinding

class PomodoroInitialFragment :
    StopwatchFragment<FragmentPomodoroInitialBinding, PomodoroInitialViewModel>(
        FragmentPomodoroInitialBinding::inflate,
    ) {

    override val viewModel: PomodoroInitialViewModel by viewModels()

    private val pomodoroList = listOf(
        PomodoroScheduleModel("Focus duration", 25, 0),
        PomodoroScheduleModel("Short brake duration", 5, 0),
        PomodoroScheduleModel("Long brake duration", 15, 0),
        PomodoroScheduleModel("Long brake after", 0, 4),
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpAppBar()
        setUpCards()
    }

    private fun setUpAppBar() {

        binding.topAppBar.setNavigationOnClickListener {
        }

        binding.topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.recent -> {
                    true
                }

                else -> false
            }
        }
    }

    private fun setUpCards() {
        with(binding) {
            item1.apply {
                title.text = pomodoroList[0].title
                minuteTime.text = pomodoroList[0].schedule.toString()
                plusButton.setOnClickListener {

                }
                minusButton.setOnClickListener {

                }
            }
            item2.apply {
                title.text = pomodoroList[1].title
                minuteTime.text = pomodoroList[1].schedule.toString()
                plusButton.setOnClickListener {

                }
                minusButton.setOnClickListener {

                }
            }
            item3.apply {
                title.text = pomodoroList[2].title
                minuteTime.text = pomodoroList[2].schedule.toString()
                plusButton.setOnClickListener {

                }
                minusButton.setOnClickListener {

                }
            }
            item4.apply {
                title.text = pomodoroList[3].title
                pomodoroCount.text = pomodoroList[3].pomodoro.toString()
                plusButton.setOnClickListener {

                }
                minusButton.setOnClickListener {

                }
            }
        }
    }
}
