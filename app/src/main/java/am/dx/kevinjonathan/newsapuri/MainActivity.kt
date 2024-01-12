package am.dx.kevinjonathan.newsapuri

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import am.dx.kevinjonathan.newsapuri.ui.theme.NewsApuriTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsApuriTheme {

            }
        }
    }
}
