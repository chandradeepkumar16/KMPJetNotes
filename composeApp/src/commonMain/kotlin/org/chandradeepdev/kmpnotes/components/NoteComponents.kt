package org.chandradeepdev.kmpnotes.components

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import org.chandradeepdev.kmpnotes.theme.md_theme_light_background
import kotlin.math.max

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun NoteInputText(modifier: Modifier = Modifier,
text:String,
label:String,
maxLine:Int =1,
ontextChange :(String) -> Unit,
onItemAction: () -> Unit = {}
){

    val keyboardController = LocalSoftwareKeyboardController.current

    TextField(
        value = text,
        onValueChange = ontextChange,
        colors = TextFieldDefaults.textFieldColors(Color.Blue),
        maxLines = maxLine,
        label = { Text(text = label) },
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions(onDone ={
            keyboardController?.hide()
        }),
        modifier=modifier
    )

}


@Composable
fun NoteButton(
    modifier: Modifier=Modifier,
    text: String,
    onClick : () -> Unit,
    enabled : Boolean = true)
{
    Button(onClick = onClick,
    shape = CircleShape,
    enabled = enabled,
    modifier = modifier)
    {

        Text(text = text)

    }

}