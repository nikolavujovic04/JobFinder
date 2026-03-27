package com.example.jobproject

import android.media.Image
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobproject.ui.theme.JobProjectTheme
import com.example.jobproject.ui.theme.PurpleLogin
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JobProjectTheme {
            }
        }
    }
}

@Composable
fun Job(modifier: Modifier = Modifier) {
    var isChecked by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.height(280.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 50.dp, bottomEnd = 50.dp))
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            PurpleLogin,
                            PurpleLogin.copy(alpha = 0.7f)
                        )
                    )
                ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                modifier = Modifier.size(100.dp),
                painter = painterResource(id = R.drawable.job),
                contentDescription = "Slicica",
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "HIPERLINK",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.LightGray)
            Text(text = "Welcome Back", fontWeight = FontWeight.Bold ,fontSize = 40.sp,
                color = Color.White)
            Text(text = "Sign in to continue your journey", fontSize = 20.sp, fontWeight = FontWeight.SemiBold,color = Color.LightGray)
        }

        var email by remember {
            mutableStateOf("")
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 60.dp, start = 20.dp, end = 20.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "Email Address", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(10.dp))
            TextField(value = email,
                onValueChange = {
                    email = it
            },modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(text = "company@gmail.com",
                        color = Color.Gray)
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = null,
                        tint = PurpleLogin
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Password", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(10.dp))
            TextField(value = email,
                onValueChange = {
                    email = it
                },modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(text = "company@gmail.com",
                        color = Color.Gray)
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = null,
                        tint = PurpleLogin
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "Forgot password?",
                    color = PurpleLogin,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.End,
                )
            }

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
                    .padding(20.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = PurpleLogin
                )
            ) {
                Text(
                    text = "Sign in ->",
                )
            }

            Text(text = "or continue with",
                textAlign = TextAlign.Center,
                color = Color.Gray,
                modifier = Modifier.fillMaxWidth())

            Row(
                modifier = Modifier.padding(20.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                OutlinedButton(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .height(52.dp),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.5.dp, Color.LightGray),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = Color.White
                    )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_google),
                        contentDescription = "Google",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Google",
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedButton(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .height(52.dp),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.5.dp, Color.Black),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = Color.Black
                    )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_apple),
                        contentDescription = "Apple",
                        modifier = Modifier.size(20.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Apple",
                        color = Color.White,
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Dont have an account?", color = Color.Gray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Sign up", color = PurpleLogin)
            }

        }

        
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun JobPreview() {
    Job()
}