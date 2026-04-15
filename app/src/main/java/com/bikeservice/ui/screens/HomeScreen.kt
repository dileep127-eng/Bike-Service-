package com.bikeservice.ui.screens

import androidx.compose.foundation.layout.*;
import androidx.compose.material3.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.dp;

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Vehicle List", style = MaterialTheme.typography.h4)

        // Add your vehicle list here

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { /* Handle service action */ }) {
                Text("Service")
            }
            Button(onClick = { /* Handle fuel action */ }) {
                Text("Fuel")
            }
            Button(onClick = { /* Handle history action */ }) {
                Text("History")
            }
        }
    }
}