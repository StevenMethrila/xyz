package com.example.myapplication

import android.graphics.Paint.Align
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        // Blue Box (Top 25% with Rounded Corners)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.25f)
                .clip(RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp))
                .background(Color.Blue),
        ) {
            Row(modifier = Modifier.fillMaxWidth().padding(0.dp,20.dp,20.dp,10.dp),
                horizontalArrangement = Arrangement.End
            ){
                Text(text = "Sam Steven Methrila")
            }
        }

        Box(
            modifier = Modifier.fillMaxWidth().offset(y = (-0.5).dp),
            contentAlignment = Alignment.Center // Center the Card horizontally
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .height(80.dp), // Use height instead of fillMaxHeight for better control
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.elevatedCardElevation(20.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Card Views", fontSize = 18.sp, color = Color.Black)
                }
            }
        }
    }
}
