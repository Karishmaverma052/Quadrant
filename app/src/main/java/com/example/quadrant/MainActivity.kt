package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()

                    }
                }
            }
        }
    }


@Composable
fun Quadrant() {
    Column{
        Row{
            Box(
                modifier = Modifier
                    .height(400.dp)
                    .width(200.dp)

            ) {
                Column {
                    Text(text = "",
                        modifier = Modifier
                            .weight(0.5f))

                    Text(
                        text = "Text Composable",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(CenterHorizontally)
                            .padding(16.dp)
                    )
                    Text(
                        text = "Displays text and follows the recommended Material Design guidelines.",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier
                            .padding(16.dp)
                            .weight(1f)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .height(400.dp)
                    .width(200.dp)

            ){
                Column {
                    Text(text = "",
                        modifier = Modifier
                            .weight(0.5f))

                    Text(
                        text = "bg_compose_background.png",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(CenterHorizontally)
                            .padding(16.dp)
                    )
                    Text(
                        text = "Creates a composable that lays out and draws a given Painter class object.",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier
                            .padding(16.dp)
                            .weight(1f)
                    )
                }

            }
        }
        Row(horizontalArrangement = Arrangement.Center) {
            Box(
                modifier = Modifier
                    .height(400.dp)
                    .width(200.dp)

            ){

                Column {
                    Text(text = "",
                        modifier = Modifier
                            .weight(0.5f))

                    Text(
                        text = "Row Composable",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(CenterHorizontally)
                            .padding(16.dp)
                    )
                    Text(
                        text = "A layout composable that places its children in a horizontal sequence.",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier
                            .padding(16.dp)
                            .weight(1f)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .height(400.dp)
                    .width(200.dp)

            ){
                Column {
                    Text(text = "",
                        modifier = Modifier
                            .weight(0.5f))

                    Text(
                        text = "Column composable",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(CenterHorizontally)
                            .padding(16.dp)
                    )
                    Text(
                        text = "A layout composable that places its children in a vertical sequence.",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier
                            .padding(16.dp)
                            .weight(1f)
                    )
                }
            }

        }
    }

}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        Quadrant()
    }
}