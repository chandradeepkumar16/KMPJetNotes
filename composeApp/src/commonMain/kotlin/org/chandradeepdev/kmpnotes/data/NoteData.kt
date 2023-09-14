package org.chandradeepdev.kmpnotes.data

import kotlinx.datetime.DatePeriod
import org.chandradeepdev.kmpnotes.model.Note

class NotesDataSource{


    fun loadNotes(): List<Note>{
        return listOf(
            Note(id = 12, title = "heheh12 " , description = "descrp 12" , entryDate = "DatePeriod()"),
            Note(id = 14, title = "heheh14 " , description = "descrp 14" , entryDate = "DatePeriod()"),
            Note(id = 15, title = "heheh15 " , description = "descrp 15" , entryDate = "DatePeriod()"),
            Note(id = 16, title = "heheh16 " , description = "descrp 16" , entryDate = "DatePeriod()"),
            Note(id = 17, title = "heheh17 " , description = "descrp 17" , entryDate = "DatePeriod()"),
            Note(id = 18, title = "heheh18 " , description = "descrp 18" , entryDate = "DatePeriod()"),
            Note(id = 19, title = "heheh19 " , description = "descrp 19" , entryDate = "DatePeriod()"),
            Note(id = 13, title = "heheh13 " , description = "descrp 13" , entryDate = "DatePeriod()"),
            Note(id = 10, title = "heheh10 " , description = "descrp 10" , entryDate = "DatePeriod()"),
            Note(id = 11, title = "heheh11 " , description = "descrp 11" , entryDate = "DatePeriod()"),
        )
    }
}