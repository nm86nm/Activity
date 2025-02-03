package com.mnp.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mnp.activity.ui.theme.ActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("TAG", "onCreate()")
        super.onCreate(savedInstanceState)
        setContent {
            ActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(text = "This is Activity project.")
                }
            }
        }
    }

    override fun onDestroy() {
        Log.i("TAG", "onDestroy()")
        super.onDestroy()
    }

    override fun onPause() {
        Log.i("TAG", "onPause()")
        super.onPause()
    }

    override fun onRestart() {
        Log.i("TAG", "onRestart()")
        super.onRestart()
    }

    override fun onResume() {
        Log.i("TAG", "onResume()")
        super.onResume()
    }

    override fun onStart() {
        Log.i("TAG", "onStart()")
        super.onStart()
    }

    override fun onStop() {
        Log.i("TAG", "onStop()")
        super.onStop()
    }
}