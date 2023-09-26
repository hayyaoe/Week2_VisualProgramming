package com.example.week2_exercise.ui.theme

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2_exercise.R
import com.example.week2_exercise.ui.theme.ui.theme.Week2_ExerciseTheme
import kotlin.math.round

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)


class DetailProduct : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week2_ExerciseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProductDetailPreview()
                }
            }
        }
    }
}

@Composable
fun ProductDetail() {

    Column(modifier = Modifier
        .background(Color.DarkGray)
        .verticalScroll(rememberScrollState())) {

        Row (modifier = Modifier
            .background(Color.LightGray)
            .padding(10.dp)
            .fillMaxWidth(), horizontalArrangement =Arrangement.SpaceAround ){

            Buttons(R.drawable.backarrow,"back")
            Text(
                text = "ABUKU Enchant 40",
                fontFamily = Poppins,
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Buttons(R.drawable.burgermenu,"menu")
        }


            Image(
                painter = painterResource(id = R.drawable.abuku_x_chainsawman),
                contentDescription ="Product Image"
            )

        Column(
            Modifier
                .graphicsLayer {
                    this.translationY = -15.dp.toPx()
                }
                .clip(shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp))
                .background(Color.DarkGray)
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(16.dp))
        {
            Text(
                text = "ABUKU Enchant 40 Mechanical Keyboard",
                color = Color.White,
                fontSize = 24.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(0.dp,0.dp,0.dp,10.dp)
            )
            Row (modifier = Modifier.padding(0.dp,0.dp,0.dp,10.dp)){

                Image(painter = painterResource(id = R.drawable.star), contentDescription = "Star")
                Text(
                    text = "5.0", Modifier
                        .padding(5.dp,0.dp),
                    color = Color.LightGray,
                    fontFamily = Poppins
                )
                Text(
                    text = "(69 Reviews)",
                    color = Color.Gray,
                    fontFamily = Poppins
                )
            }
            Text(
                text = "Sebuah keyboard 40% dengan layout ergonomic yang terinspirasi dari Alice Layout.\n" +
                        "Enchant40 memiliki 46 mechanical keys hotswap yang dapat diganti dengan mudah dan sudah south facin..",
                fontFamily = Poppins,
                color = Color.White,
                modifier = Modifier.padding(0.dp,0.dp,0.dp,10.dp)
            )

            Text(
                text = "Readmore..",
                fontFamily = Poppins,
                color = Color.White,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.padding(0.dp,0.dp,0.dp,0.dp)
            )

            Row (
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ){

                Text(
                    text = "Rp. 800,000",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    color = Color.White
                )

                Button(
                    onClick={},
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    )
                ){
                    Text(
                        text = "Add To Cart",
                        fontWeight = FontWeight.Bold,
                        fontFamily = Poppins,
                        fontSize = 20.sp,
                        color = Color.DarkGray
                    )
                }


            }
        }
    }
}

@Composable
fun Buttons(
    image: Int,
    desc: String
){
    Image(painter = painterResource(id = image),
        contentDescription =desc,
        contentScale = ContentScale.Fit,
        modifier = Modifier.size(30.dp)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProductDetailPreview() {
    Week2_ExerciseTheme {
        ProductDetail()
    }
}