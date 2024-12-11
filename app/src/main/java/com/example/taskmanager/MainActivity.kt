package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ){
                GettingImage(completion = "All tasks Completed",
                    workDone = "Nice Work!"
                )
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Composable
fun TaskManager(completion: String, workDone: String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally, // Center all content horizontally
        modifier = modifier.padding(8.dp)


    ) {
        Text(
            text = "All Tasks Completed",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)

        )
        Text(
            text = "Nice Work!",
            fontSize = 16.sp,
        )
    }
}

@Composable
fun GettingImage(completion: String, workDone: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.ic_task_completed)
    Box(modifier){
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
                .align(Alignment.Center)
        )
        TaskManager(
            completion = completion,
            workDone = workDone,
            modifier = Modifier
                .align(Alignment.BottomCenter) // Align near the bottom
                .padding(bottom = 180.dp) // Add padding above the bottom
        )
    }

}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    TaskManagerTheme {
//        Greeting("Android")
        GettingImage("All Tasks Completed", "Nice Work!")
    }
}