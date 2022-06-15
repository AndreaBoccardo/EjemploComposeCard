package cl.mobdev.ejemplocomposecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cl.mobdev.ejemplocomposecard.ui.theme.EjemploComposeCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjemploComposeCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    mainUI()
                }
            }
        }
    }
}
@Composable
fun mainUI(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Column(
            modifier = Modifier
                .border(1.dp, Color.Red)
                .fillMaxWidth()
                .padding(40.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(cl.mobdev.ejemplocomposecard.R.drawable.ic_launcher_background),
                    contentDescription = "imagen"
                )
                Column() {
                    Greeting("Mikaela")
                    Greeting("Zafiro")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hola $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EjemploComposeCardTheme {
        mainUI()
    }
}