# Quiz Application

## Overview
The **Quiz Application** is built to create a platform where users can:
- Participate in quizzes on various topics
- Answer multiple-choice questions
- Instantly receive scores and feedback
- View result

The application ensures an engaging, easy-to-use experience with support for different quiz types and dynamic user interfaces.

---

## Technologies Used
| Technology | Purpose |
| :--------- | :------ |
| **XML** | Designing user interfaces |
| **Java** | Building application logic |
| **SQLite** | Storing quiz questions, user scores, and statistics locally |
| **Airbnb Lottie** | Adding animations for an engaging user experience |

---

## Project Setup and Installation

### Prerequisites
- Android Studio installed (latest stable version recommended)
- Java Development Kit (JDK) 8 or higher
- Internet connection (for Gradle sync and library dependencies)

### Steps to Set Up Locally
1. **Clone the Repository**
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

| Login Screen | Home Screen | Quiz Screen | Result Screen |
| :----------: | :---------: | :----------: | :-----------: |
| ![Login](https://github.com/user-attachments/assets/your-login-image-link) | ![Home](https://github.com/user-attachments/assets/2530bb12-e2a2-4c59-9824-2f46ff2a2767) | ![Quiz](https://github.com/user-attachments/assets/41404b17-dfda-4e62-8a44-8e1e9319f32f) | ![Result](https://github.com/user-attachments/assets/6c548d29-1446-4838-bb3f-3e9bd1233f0e) |



---

## Project Structure
```
QuizApplication/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com/yourpackage/quizapp/
│   │   │   │   │   ├── activities/
│   │   │   │   │   ├── adapters/
│   │   │   │   │   ├── database/
│   │   │   │   │   ├── models/
│   │   │   │   │   ├── utils/
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   ├── drawable/
│   │   │   │   ├── values/
│   │   │   │   ├── anim/
│   │   │   └── AndroidManifest.xml
├── build.gradle
├── README.md
├── screenshots/
```





