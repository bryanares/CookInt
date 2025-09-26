package com.brian.cookint.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.brian.cookint.ui.screens.auth.LoginScreen
import com.brian.cookint.ui.screens.auth.RegisterScreen
import com.brian.cookint.ui.screens.bookmarks.BookMarkScreen
import com.brian.cookint.ui.screens.details.RecipeDetailScreen
import com.brian.cookint.ui.screens.home.HomeScreen
import com.brian.cookint.ui.screens.profile.ProfileScreen
import com.brian.cookint.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavigationScreen.Splash.route
    ) {
        composable(NavigationScreen.Splash.route) {
            SplashScreen()
        }
        composable(NavigationScreen.Login.route) {
            LoginScreen()
        }
        composable(NavigationScreen.Home.route) {
            HomeScreen()
        }
        composable(NavigationScreen.Register.route) {
            RegisterScreen()
        }
        composable(NavigationScreen.RecipeDetail.route) {
            RecipeDetailScreen()
        }
        composable(NavigationScreen.Bookmarks.route) {
            BookMarkScreen()
        }
        composable(NavigationScreen.Profile.route) {
            ProfileScreen()
        }
    }
}