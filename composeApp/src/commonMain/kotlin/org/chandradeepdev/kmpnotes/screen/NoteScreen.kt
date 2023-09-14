package org.chandradeepdev.kmpnotes.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.chandradeepdev.kmpnotes.components.NoteButton
import org.chandradeepdev.kmpnotes.components.NoteInputText
import org.chandradeepdev.kmpnotes.data.NotesDataSource
import org.chandradeepdev.kmpnotes.model.Note

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(

    notes:List<Note>,
    onAddNote: (Note) -> Unit,
    onRemove: (Note) ->Unit

){

    var title by remember {
        mutableStateOf("")
    }

    var description by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.padding(6.dp)) {
        TopAppBar(title = {
                         Text(text = "JetNotes")
        },
            actions = {
                Icon(imageVector = Icons.Rounded.Notifications,
                contentDescription = "Icon image")
            })

        //Content
        Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally){
            NoteInputText(
                modifier=Modifier.padding(
                    top = 9.dp,
                    bottom = 9.dp
                ),
                text = title ,
                label = "Title" ,
                ontextChange = {
                    if (it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        }) title=it
                })

            NoteInputText(
                modifier=Modifier.padding(
                    top = 9.dp,
                    bottom = 9.dp
                ),
                text = description ,
                label = "Add a note" ,
                ontextChange = {
                    if (it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        }) description=it
                })


            NoteButton(text = "Save" ,
            onClick = {
                if(title.isNotEmpty() && description.isNotEmpty()){
                    //save or add to list
                    onAddNote(Note(12 , title=title , description=description, entryDate = ""))
                    title=""
                    description=""


                }
            })
        }

        Divider(modifier = Modifier.padding(10.dp))
        LazyColumn {
            items(notes){note ->
                NoteRow(note=note, onNoteClicked = {
                    onRemove(note)
                })
            }
        }

    }
}


@Composable
fun NotesScreenPreview(){
    NoteScreen(notes = NotesDataSource().loadNotes() , onAddNote = {} , onRemove = {})
}

@Composable
fun NoteRow(
    modifier: Modifier=Modifier,
    note: Note,
    onNoteClicked : (Note) -> Unit){
    Surface(modifier.padding(4.dp)
        .clip(RoundedCornerShape(topEnd = 33.dp , bottomStart = 33.dp))
        .fillMaxWidth(),
        color = Color(0xFFDFE6EB),
    shadowElevation = 6.dp) {
        Column(
            modifier.clickable {onNoteClicked(note)  }.padding(horizontal = 14.dp , vertical = 6.dp),
            horizontalAlignment = Alignment.Start
        ) {

            Text(text = note.title, style = MaterialTheme.typography.headlineSmall)
            Text(text = note.description, style = MaterialTheme.typography.bodyMedium)

        }

    }

}

