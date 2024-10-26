package cl.bootcamp.apprandomuser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cl.bootcamp.apprandomuser.ui.theme.AppRandomUserTheme
import cl.bootcamp.apprandomuser.viewModal.UserViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel: UserViewModel by viewModels()
        setContent {
            AppRandomUserTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeView(viewModel, innerPadding)
                }
            }
        }
    }
}

@Composable
fun HomeView(
    viewModel: UserViewModel,
    paddingValues: PaddingValues
) {

}