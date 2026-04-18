package com.example.chatapp.ui_examples

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onNavigateToScaffold: () -> Unit) {
    val onClick: () -> Unit = {}

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("UI Examples") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = onNavigateToScaffold,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Scaffold Example")
            }

            OutlinedButton(onClick = { onClick() }) {
                Text("Press Me")
            }

            Text(
                text = "Welcome to the UI Gallery!",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}