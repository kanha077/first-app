package com.example.travelphotoapp

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelphotoapp.ui.theme.TravelphotoappTheme

class MainActivity : ComponentActivity() {

     var currentImage = 0
 lateinit var image:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next=findViewById<ImageButton>(R.id.btnnext)
        val prev=findViewById<ImageButton>(R.id.btnprev)

        next.setOnClickListener{
            var idcurentImageString= "pic$currentImage"
            var idcurrentImageInt = this.resources.getIdentifier(idcurentImageString,"id",packageName)
            image=findViewById(idcurrentImageInt)
            image.alpha=0f
            currentImage=(3+currentImage+1)%3
            var idImageToShowString="pic"+currentImage
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idcurrentImageInt)
            image.alpha=1f
        }
        prev.setOnClickListener{
            var idcurentImageString= "pic$currentImage"
            var idcurrentImageInt = this.resources.getIdentifier(idcurentImageString,"id",packageName)
            image=findViewById(idcurrentImageInt)
            image.alpha=0f
            currentImage=(3+currentImage-1)%3
            var idImageToShowString="pic"+currentImage
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idcurrentImageInt)
            image.alpha=1f
        }
    }
}