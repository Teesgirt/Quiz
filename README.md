Quiz Application

Overview
The Quiz Application is built to create a platform where users can:
- Participate in quizzes on various topics
- Answer multiple-choice questions
- Instantly receive scores

Technologies Used
XML - Designing user interfaces
Java - Building application logic
SQLite - Storing quiz questions, user scores, and statistics locally
Airbnb Lottie - Adding animations for an engaging user experience

Project Setup and Installation

Prerequisites
- Android Studio installed (latest stable version recommended)
- Java Development Kit (JDK) 8 or higher
- Internet connection (for Gradle sync and library dependencies)

Steps to Set Up Locally
1.Clone the Repository**
   ```bash
   git clone https://github.com/your-username/quiz-application.git
   ```

2. **Open in Android Studio**
   - Open Android Studio → `Open an existing project` → Select the downloaded project folder.

3. **Sync Gradle**
   - Allow Android Studio to automatically sync Gradle and download all necessary dependencies.

4. **Run the Application**
   - Connect an Android device or start an emulator.
   - Press **Shift + F10** or click the **Run** button to install and launch the app.

---

## External Libraries / APIs Used
> Make sure these libraries are included in the `build.gradle (Module: app)` file.

### 1. **Airbnb Lottie Animation Library**
For adding smooth and attractive animations.
```gradle
implementation 'com.airbnb.android:lottie:6.1.0'
```

### 2. **AndroidX Libraries**
For building modern, efficient, and backward-compatible Android applications.
```gradle
implementation 'androidx.appcompat:appcompat:1.6.1'
implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
implementation 'androidx.recyclerview:recyclerview:1.3.2'
implementation 'androidx.cardview:cardview:1.0.0'
implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
```

---

## Database Integration

- **SQLite** is used as a lightweight local database.
- Database is created automatically when the app runs for the first time.
- The database stores:
  - Quiz Questions
  - User’s Answers
  - Scores
  - Performance Statistics

You can find the database helper class (`DatabaseHelper.java`) inside the `/database/` package in the project structure.

**Important**:  
> No external database server is required.  
> All data is stored and retrieved locally using SQLite.

---

## Screenshots / Demo

| Home Screen | Quiz Screen | Result Screen |
| :---------: | :----------: | :-----------: |
| ![Home](screenshots/home_screen.png) | ![Quiz](screenshots/quiz_screen.png) | ![Result](screenshots/result_screen.png) |

*(Replace the images inside the `/screenshots/` folder with your app screenshots.)*
