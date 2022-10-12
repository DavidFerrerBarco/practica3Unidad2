package david.ferrer.practica3unidad2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import david.ferrer.practica3unidad2.ui.theme.Practica3Unidad2Theme
import david.ferrer.practica3unidad2.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica3Unidad2Theme() {
                Column() {
                    Text(
                        text = "Las ventajas de estos es que",
                        color = MaterialTheme.colors.primary,
                    )
                    Text(
                        text = "Nos ayudan a recopilar los colores",
                        color = MaterialTheme.colors.primaryVariant
                    )
                    Text(
                        text = "Para mejor accesibilidad y fácil modificación",
                        color = MaterialTheme.colors.secondary
                    )
                }

            }
        }
    }
}
