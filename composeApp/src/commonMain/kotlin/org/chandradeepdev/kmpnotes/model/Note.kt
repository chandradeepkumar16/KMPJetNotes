package org.chandradeepdev.kmpnotes.model

import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Int,
    val title:String,
    val description:String,
    val entryDate: String
)
