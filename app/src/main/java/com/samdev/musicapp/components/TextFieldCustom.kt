package com.samdev.musicapp.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.samdev.musicapp.R
import com.samdev.musicapp.ui.theme.Blue900

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldCustom(
    value: String,
    onValueChange: (String) -> Unit,
    hint: String,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    icon: Int = R.drawable.ic_username
){

    TextField(
        value,
        onValueChange,
        modifier,
        label = {
            Text(text = hint, color = Color.White)
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Blue900,
            cursorColor = Color.White
        ),
        maxLines = 1,
        textStyle = TextStyle(
            color = Color.White,
            fontSize = 18.sp
        ),
        keyboardActions = keyboardOptions,
        leadingIcon = {
            Icon(
                painter = painterResource(id = icon),
                contentDescription =
            )
        }
    )

}

@Composable
@Preview
private fun TextFieldCustomPreview(){

    var username by remember{
        mutableStateOf("")
    }

    TextFieldCustom(
        value = username,
        onValueChange = {
            username = it
        },
        hint = "Username"
    )
}