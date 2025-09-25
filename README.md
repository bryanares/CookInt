# 🍳 CookInt  
*A modern recipe discovery app built with Jetpack Compose, Clean Architecture and Hilt, where users can explore recipes, bookmark favorites, and enjoy offline access*  

It’s being built following best practices with:  
- ✅ **Kotlin + Jetpack Compose** for UI  
- ✅ **Hilt** for dependency injection  
- ✅ **MVVM + Clean Architecture** for scalability  
- ✅ **Coroutines + Flow** for async data handling  
- ✅ **Room + Retrofit** for offline-first data  

---

## Features
- 📱 Built entirely with **Jetpack Compose**
- 🏗️ **Clean Architecture** (data, domain, UI layers)
- 🛠️ **Dependency Injection** with Hilt
- 🔑 User authentication & authorization via **Firebase**
- 🍲 Fetch recipes from a public API
- 📌 Bookmark recipes for later
- 📂 Offline caching using **Room Database**
- 🧭 Navigation using **Compose Navigation**
- 🎨 Material 3 theming


## Tech Stack
- Kotlin
- Jetpack Compose
- Hilt (DI)
- Room
- Firebase Authentication
- Retrofit / OkHttp (for API calls)
- Coroutines & Flow

---

## 🚀 Roadmap

Step by step roadmap.  

### **Phase 1 – Project Setup & Navigation**
- ✅ Project created with Kotlin & Jetpack Compose  
- ✅ Applied Clean Architecture folder structure (data, domain, ui)  
- ✅ Integrated Hilt (DI) & set up `@HiltAndroidApp`  
- ✅ Basic navigation graph: Splash → Login → Home  
- ✅ Screen placeholders for Splash, Login, Home  

---

### **Phase 2 – Navigation Actions**
- ⏳ Splash navigates to Login after a short delay  
- ⏳ Login screen navigates to Home (temporary button)  
- ⏳ Proper backstack handling (cannot return to Splash after Login/Home)  

---

### **Phase 3 – Authentication**
- 🔒 Integrate Firebase Authentication  
- 🔒 Splash checks auth state → auto-route to Home if user already logged in  
- 🔒 Implement Login with Email/Password  
- 🔒 Implement Logout flow  

---

### **Phase 4 – Recipes API**
- 🌐 Connect to a public Recipes API (Retrofit + OkHttp)  
- 🌐 Display recipe list in Home screen  
- 🌐 Handle loading & error states (ViewModel + Coroutines/Flow)  

---

### **Phase 5 – Bookmarks & Offline Mode**
- 📌 Allow bookmarking recipes  
- 📂 Cache recipes offline using Room Database  
- 📶 Show cached recipes when offline  

---

### **Phase 6 – Polishing**
- 🎨 Material 3 theming & styling  
- 🧭 Improved navigation (e.g., Recipe details screen)  
- ✅ Unit tests for ViewModels & UseCases  
- 📱 Final optimizations for performance  

