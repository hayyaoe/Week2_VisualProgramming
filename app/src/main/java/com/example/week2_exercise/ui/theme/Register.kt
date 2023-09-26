package com.example.week2_exercise.ui.theme

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2_exercise.R
import com.example.week2_exercise.ui.theme.ui.theme.Week2_ExerciseTheme

class Register : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week2_ExerciseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Daftar()
                }
            }
        }
    }
}

val Poppins = FontFamily(
    Font(R.font.popinsreg, FontWeight.Normal),
    Font(R.font.poppinsblack, FontWeight.Black),
    Font(R.font.poppinssemibold, FontWeight.SemiBold),
    Font(R.font.poppinsbold, FontWeight.Bold)

)

@Composable
fun Daftar() {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .background(Color.DarkGray)) {
        Row (modifier = Modifier
            .padding(40.dp)
            .fillMaxWidth(), horizontalArrangement = Arrangement.Start ){
            Buttons(R.drawable.baselinewhite,"back")
        }

        Image(
            painter = painterResource(
                id = R.drawable.whatsapp_image_2023_09_26_at_07_55_41_removebg_preview),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 0.dp, 0.dp, 30.dp)
        )

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(70.dp, 70.dp))
                .clip(shape = RoundedCornerShape(70.dp, 70.dp))
                .background(Color.LightGray)
        )

        {

            Text(text = "Create New Account",
                fontWeight = FontWeight.Bold,
                fontFamily = Poppins,
                color = Color.White,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 15.dp)
                    .offset(0.dp, 0.dp)

            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .clip(shape = RoundedCornerShape(70.dp, 70.dp))
                    .background(Color.White)

            )

            {

                Row (horizontalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(140.dp, 20.dp, 0.dp, .0.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.facebook_icon),
                        contentDescription ="Facebook",
                        modifier = Modifier.size(38.dp)

                    )
                    Image(
                            painter = painterResource(id = R.drawable.x_icon),
                    contentDescription ="Facebook",
                    modifier = Modifier.size(38.dp)
                    )
                    Image(
                    painter = painterResource(id = R.drawable.google_icon),
                    contentDescription ="Facebook",
                    modifier = Modifier.size(38.dp)
                )
                }
                Text(text = "or use your email account",
                    fontWeight = FontWeight.Normal,
                    fontFamily = Poppins,
                    color = Color.Gray,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp)

                )

                InputBox("Name", "ex: John Doe")
                InputBox(label = "Email", placeholder = "ex: JaneDoe@example.com")
                InputBox("Password", "Enter Password")

                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(top =20.dp, bottom = 10.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 90.dp),
                    colors = ButtonDefaults.buttonColors(Color.DarkGray)

                ){
                    Text(
                        text = "Register",
                        fontFamily = Poppins,
                        fontSize= 26.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                        )
                }

                Text(
                    text="already have an account ?",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    fontFamily = Poppins
                )

                Text(
                    text="Login",
                    textAlign = TextAlign.Center,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                    modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)
                )
            }
            }
        }

    }


@Composable
fun InputBox(
    label : String,
    placeholder : String,
){
    Text(text = label,
        fontSize = 20.sp,
        modifier = Modifier.padding(50.dp,20.dp,0.dp,0.dp),
        fontFamily = Poppins
    )

    Box(
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .border(
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(2.dp, Color.LightGray)
            )
            .fillMaxWidth()

    ){
        Text(
            text = placeholder,
            fontSize= 18.sp,
            color = Color.LightGray,
            modifier =Modifier.padding(20.dp),
            fontFamily = Poppins
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DaftarPreview() {
    Week2_ExerciseTheme {
        Daftar()
    }
}