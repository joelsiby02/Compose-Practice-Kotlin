package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    LearningTutorialImg(headingName = stringResource(R.string.jetpack_heading),
                        firstPara = stringResource(R.string.jetpack_short_para),
                        secondPara = stringResource(R.string.jetpack_long_para),
                        modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun LearningTutorial(headingName: String, firstPara: String, secondPara: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally, // Center all content horizontally
        modifier = modifier.padding(8.dp)
    ){
        Text(
            text = stringResource(R.string.jetpack_heading),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp).padding(top = 140.dp).align(Alignment.Start),
            lineHeight = 24.sp

        )
        Text(
            text = stringResource(R.string.jetpack_short_para),
            modifier = Modifier.padding(start = 16.dp, end = 10.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.jetpack_long_para),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify

        )
    }

}

@Composable
fun LearningTutorialImg(headingName: String, firstPara: String, secondPara: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
    LearningTutorial(headingName = headingName,
        firstPara = firstPara,
        secondPara = secondPara,
        modifier = Modifier)
}


@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleTheme {
        LearningTutorialImg(headingName = stringResource(R.string.jetpack_heading),
            firstPara = stringResource(R.string.jetpack_short_para),
            secondPara = stringResource(R.string.jetpack_long_para),
            modifier = Modifier)
    }
}