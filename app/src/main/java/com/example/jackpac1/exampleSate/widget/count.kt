import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun WaterCounter(modifier: Modifier = Modifier,navicontroler: NavController) {
    val count = 0
    Column(modifier = modifier.padding(16.dp)) {
        val count: MutableState<Int> = remember { mutableStateOf(0) }
        Text("You've had ${count.value} glasses.")

        Button(onClick = { count.value++
//            navicontroler.navigate("MainTest")
                         println("----${count}")
                         }, Modifier.padding(top = 8.dp)) {
            Text("Add one")

        }
    }
}
@Preview
@Composable
fun textdata(){
    Text(text="22323")
}
