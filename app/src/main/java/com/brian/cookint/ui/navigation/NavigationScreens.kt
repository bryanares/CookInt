package com.brian.cookint.ui.navigation

sealed class NavigationScreen (val route: String) {
    object Splash : NavigationScreen("splash")
    object Login : NavigationScreen("login")
    object Home : NavigationScreen("home")
    object Register : NavigationScreen("register")
    object Profile : NavigationScreen("profile")
    object RecipeDetail : NavigationScreen("recipe_detail")
    object Bookmarks : NavigationScreen("bookmarks")
}
