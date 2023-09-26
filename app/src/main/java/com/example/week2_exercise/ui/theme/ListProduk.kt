package com.example.week2_exercise.ui.theme

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
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
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.EmojiSupportMatch
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2_exercise.R
import com.example.week2_exercise.ui.theme.ui.theme.Week2_ExerciseTheme

class ListProduk : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week2_ExerciseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListProduct()
                }
            }
        }
    }
}

@Composable
fun ListProduct() {

    Column (modifier = Modifier.verticalScroll(rememberScrollState())){
        Row (modifier = Modifier
            .background(Color.LightGray)
            .padding(10.dp)
            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround ){

            Buttons(R.drawable.backarrow,"back")
            Text(
                text = "Your Cart",
                fontFamily = Poppins,
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Buttons(R.drawable.burgermenu,"menu")
        }

        ProductBoxes(
            category = "Deskmat",
            title = "Abuku X Chainsaw Man",
            rate = "Rate-🔥-Quality-10/10",
            price = "Rp. 200.000,00",
            image = R.drawable.abuku_x_chainsawman
        )

        Divider(
            color = Color.Gray,
            modifier = Modifier.padding(16.dp, 4.dp,16.dp,4.dp)
        )

        ProductBoxes(category = "Keyboard",
            title = "Abuku Artisan Speed",
            rate = "Rate-💀-Speed-10/10",
            price = "Rp. 500.000,00" ,
            image = R.drawable.abukutype1
        )

        Divider(
            color = Color.Gray,
            modifier = Modifier.padding(16.dp, 0.dp,16.dp,4.dp)
        )
//        ProductBoxes(category = "Human",
//            title = "Asa Mitaka",
//            rate = "Rate-💀-Bruh-10/10",
//            price = "Not For Sale",
//            image = R.drawable.screen_shot_2023_02_08_at_19_45_19)
        ProductBoxes(category = "Hybrid",
            title = "Yoru",
            rate = "Rate-💗-Waifu-10/10",
            price = "Not For Sale",
            image = R.drawable.screenshot_2023_07_19_at_22_42_04_transformed)

        TextCombos("Delivery Charges","Free Delivery",textDecoration2 = TextDecoration.Underline)
        TextCombos("Total Amount","Rp. 69.420,00")
        Divider(
            color = Color.Gray,
            modifier = Modifier.padding(16.dp, 0.dp,16.dp,16.dp)
        )
        Row (modifier = Modifier
            .padding(4.dp,0.dp,4.dp,10.dp)
            .fillMaxWidth()
            .background(Color.White),
            Arrangement.SpaceAround
        ){

            Button(onClick = {},
                shape = RoundedCornerShape(35),
                colors = ButtonDefaults.buttonColors
                    (
                    containerColor = Color.Transparent,
                    contentColor = Color.Black),
                border = BorderStroke(3.dp, Color.Black),
                contentPadding = PaddingValues(25.dp,12.dp)

            ) {
                Text(
                    text = "Rp. 69.420,00",
                    fontSize = 20.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding()
                )
            }

            Button(onClick = {},
                shape = RoundedCornerShape(35),
                colors = ButtonDefaults.buttonColors
                    (
                    containerColor = Color.Black,
                    contentColor = Color.White),
                contentPadding = PaddingValues(25.dp,12.dp)
            ) {
                Text(
                    text = "Continue",
                    fontSize = 20.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding()
                )
            }
        }



}




}

@Composable
fun ProductBoxes(
    category : String,
    title : String,
    rate: String,
    price : String,
    amount : String = "+ 1 -",
    image : Int
){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)
) {
        Image(painter = painterResource(image),
            contentDescription = "Product Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(170.dp)
                .clip(shape = RoundedCornerShape(10))

        )

        Column(modifier = Modifier.padding(15.dp,0.dp)){
            Text(text = category,
                fontSize = 16.sp,
                fontFamily = Poppins,
                modifier= Modifier.padding(0.dp,2.dp))
            Text(text = title,
                fontSize = 20.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                modifier= Modifier.padding(0.dp,2.dp))
            Text(text = rate,
                fontSize = 14.sp,
                fontFamily = Poppins,
                modifier= Modifier.padding(0.dp,2.dp))
            Text(text = price,
                fontSize = 14.sp,
                fontFamily = Poppins,
                modifier= Modifier.padding(0.dp,2.dp))
            Row(modifier = Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
                Text(text = amount,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Poppins
                )

                Image(painter = painterResource(id = R.drawable.baseline_cancel_presentation_24), contentDescription = "cancel")

            }
        }
    }
}

@Composable
fun TextCombos(
    text1 : String,
    text2 : String,
    textDecoration1: TextDecoration = TextDecoration.None,
    textDecoration2: TextDecoration = TextDecoration.None,
){
    Divider(
        color = Color.Gray,
        modifier = Modifier.padding(16.dp, 4.dp,16.dp,4.dp)
    )

    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)
        ,
        horizontalArrangement = Arrangement.SpaceBetween,){

        Text(
            text = text1,
            textDecoration = textDecoration1
        )

        Text(
            text = text2,
            textDecoration = textDecoration2
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ListProductPreview() {
    Week2_ExerciseTheme {
        ListProduct()
    }
}