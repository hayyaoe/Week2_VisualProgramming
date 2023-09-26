package com.example.week2_exercise.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2_exercise.R
import com.example.week2_exercise.ui.theme.ui.theme.Week2_ExerciseTheme

class Profile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week2_ExerciseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Profil()
                }
            }
        }
    }
}

@Composable
fun Profil() {

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
    ){
        Row (modifier = Modifier
            .background(Color.LightGray)
            .padding(10.dp, top = 40.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ){

            Buttons(R.drawable.backarrow,"back")
            Text(
                text = "Profile",
                fontFamily = Poppins,
                fontSize = 25.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
            )
            Buttons(R.drawable.baseline_edit_24,"edit")
        }

        Row (
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxWidth()
                .padding(vertical = 40.dp, horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){


            Column (
                modifier = Modifier
                    .padding(bottom = 70.dp, top = 20.dp)
            ){
                Text(
                    text = "Hayya",
                    fontFamily = Poppins,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    )

                Text(
                    text = "FOUNDER OF ABUKU",
                    fontFamily = Poppins,
                    fontSize = 18.sp,
                    color = Color.Black
                )
            }

            Image(
                painter = painterResource(
                    id = R.drawable.whatsapp_image_2023_09_26_at_07_55_41),
                contentDescription = "Rher the moon god",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(110.dp)

            )

        }

        ElevatedCard(
            shape = RoundedCornerShape(40.dp),
            modifier = Modifier
                .padding(20.dp)
                .offset(0.dp, (-80).dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onTertiary,
            )

        ) {
            Text(
                text = "Personal Information",
                fontFamily = Poppins,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                modifier =Modifier.padding(start = 20.dp, top= 40.dp, bottom = 8.dp, end = 20.dp)
                )
            Divider(
                color = Color.Gray,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 5.dp, bottom =20.dp)
            )

            Row {
                Label(
                    text1 = "NIM",
                    text2 = "0706012210052",
                    text3 ="Occupation",
                    text4 ="Student"
                )

                Label(
                    text1 = "Date of Birth",
                    text2 = "May 27, 2004",
                    text3 ="Marital Status",
                    text4 ="Private"
                )
            }

            Column (modifier = Modifier.padding(start = 20.dp, bottom = 40.dp, top = 12.dp)){
                Text(
                    text = "Email",
                    fontFamily = Poppins,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray
                )

                Text(
                    text = "hayyau01@student.ciputra.ac.id",
                    fontFamily = Poppins,
                    fontSize = 16.sp
                )
            }
        }

        ElevatedCard(
            shape = RoundedCornerShape(40.dp),
            modifier = Modifier
                .padding(20.dp)
                .offset(0.dp,(-90).dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onTertiary,
            )

        ) {
            Text(
                text = "Expertise",
                fontFamily = Poppins,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                modifier =Modifier.padding(start = 20.dp, top= 40.dp, bottom = 8.dp, end = 20.dp)
            )
            Divider(
                color = Color.Gray,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 5.dp, bottom =20.dp)
            )

            Expertise(title = "Mbah Gugel", image = R.drawable.google_icon)
            Expertise(title = "Mas Fesbuk", image = R.drawable.facebook_icon)
        }

        ElevatedCard(
            shape = RoundedCornerShape(40.dp),
            modifier = Modifier
                .padding(20.dp)
                .offset(0.dp,(-100).dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onTertiary,
            )

        ) {
            Text(
                text = "Send a Message",
                fontFamily = Poppins,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                modifier =Modifier.padding(start = 20.dp, top= 40.dp, bottom = 8.dp, end = 20.dp)
            )
            Divider(
                color = Color.Gray,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 5.dp, bottom =20.dp)
            )


            Box(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .border(
                        shape = RoundedCornerShape(45.dp),
                        border = BorderStroke(2.dp, Color.LightGray)
                    )
                    .fillMaxWidth()

            ){
                Text(
                    text = "Write a Message",
                    fontSize= 18.sp,
                    fontFamily = Poppins,
                    color = Color.LightGray,
                    modifier =Modifier.padding(20.dp)

                )
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(top =20.dp, bottom = 10.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 90.dp),
                colors = ButtonDefaults.buttonColors(Color.DarkGray)

            ){
                Text(
                    text = "Send",
                    fontFamily = Poppins,
                    fontSize= 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun Label(
    text1 : String,
    text2 : String,
    text3 : String,
    text4 : String,
    font : FontFamily = Poppins,
    textDecoration1: TextDecoration = TextDecoration.None,
    textDecoration2: TextDecoration = TextDecoration.None,
){

    Column (
        modifier = Modifier
        .padding(start = 22.dp),
    ){

        Text(
            text = text1,
            textDecoration = textDecoration1,
            fontFamily = font,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Gray
        )

        Text(
            text = text2,
            textDecoration = textDecoration2,
            fontFamily = font,
            fontSize = 16.sp
        )

        Text(
            text = text3,
            textDecoration = textDecoration1,
            fontFamily = Poppins,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 12.dp),
            color = Color.Gray
        )

        Text(
            text = text4,
            textDecoration = textDecoration2,
            fontFamily = Poppins,
            fontSize = 16.sp
        )
    }

}

@Composable
fun Expertise(
    title : String,
    image: Int
){
    Row(horizontalArrangement = Arrangement.Start, modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp)) {
        Image(
            painter = painterResource(
                id = image
            ),
            contentDescription = title,
            Modifier
                .size(50.dp)
        )

        Text(
            text = title,
            fontFamily= Poppins,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 10.dp, start = 20.dp, bottom = 40.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun ProfilPreview() {
    Week2_ExerciseTheme {
        Profil()
    }
}