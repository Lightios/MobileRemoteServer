# 🖥️ Remote Mobile Server

A lightweight Kotlin-based server built with Spring Boot. I have built it along with **[Remote Mobile Client](https://github.com/Lightios/MobileRemoteClient)**, that allows you to control the playback with your Android powered smartphone.

---

## 🚀 Requirements

Before running the server, make sure the following are installed on your system:

- ✅ **Java 17 or higher**
- 🪟 **[NirCmd](https://www.nirsoft.net/utils/nircmd.html)** (Windows only)
- 🧰 **Kotlin + Spring Boot dependencies** (managed via Gradle/Maven)

---

## ⚙️ Getting Started

Once all dependencies are installed, running the server is straightforward:

```bash
java -jar build/libs/mobile-remote-server.jar
```

📝 **Note:** On Windows, ensure that `nircmd.exe` is available in your `PATH` or in the project directory to avoid runtime errors.

---

## 🧠 Tech Stack

- 🛠️ **Kotlin**
- 🌱 **Spring Boot**
- 🪟 **NirCmd** for Windows control

---

## 📌 Notes

- This project does **not** include a user interface.
- No additional configuration is needed if dependencies are met — just open and run.
- Ideal for backend services or automation tools on Windows.
