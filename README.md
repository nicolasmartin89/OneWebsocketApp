<!--
    #/**
    # * @author Nicolas Martin
    # * Email: nicolasmartin89@gmail.com
    # * GitHub Profile: https://github.com/nicolasmartin89
    # * LinkedIn: https://www.linkedin.com/in/nicolas-demis-martin
    #/***************************************************/
-->
---
# 💻 Chat with Spring Boot and WebSocket

[![SpringBoot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://docs.spring.io/spring-boot/index.html)
[![MongoDB](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white)](https://www.mongodb.com/es)

[![HTML](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)](https://developer.mozilla.org/es/docs/Web/HTML)
[![CSS](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)](https://developer.mozilla.org/es/docs/Web/CSS)
[![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)](https://js.org/index.html)

[![Intellij Idea](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/es-es/idea/)

## 📑 Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Configuration](#configuration)
- [Contacts](#contacts)

## 📖 Introduction
**OneWebsocketApp** is a one-on-one chat application built using WebSocket and Spring Boot for the backend, with a frontend composed of HTML, CSS, and JavaScript. The application allows users to send and receive messages in real-time, ensuring a seamless and responsive chat experience.
## 🛠️ Prerequisites

Before you begin, ensure you have met the following requirements:
- Java Development Kit (JDK) 17 or higher
- Maven 3.8 or higher
- A modern web browser (Chrome, Firefox, etc.)
- An IDE such as IntelliJ IDEA or Eclipse (optional but recommended)
## ▶️ Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/nicolasmartin89/OneWebsocketApp.git
   ```

2. Navigate to the project directory:

   ```bash
   cd OneWebsocketApp
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```
4. Run the Spring Boot application::

   ```bash
   mvn spring-boot:run
   ```


## 📁 Project Structure

The tests follow a modular and maintainable structure:

```
OneWebsocketApp/
├── .mvn/                                 # Maven wrapper files
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/app/onewebsocketapp/
│   │   │       ├── chat/
│   │   │       │   ├── ChatController.java           # Handles WebSocket chat endpoints
│   │   │       │   ├── ChatMessage.java              # Entity representing a chat message
│   │   │       │   ├── ChatMessageRepository.java    # Repository interface for chat messages
│   │   │       │   ├── ChatMessageService.java       # Service layer for chat message operations
│   │   │       │   └── ChatNotification.java         # Model representing chat notifications
│   │   │       ├── chatroom/
│   │   │       │   ├── ChatRoom.java                 # Entity representing a chat room
│   │   │       │   ├── ChatRoomRepository.java       # Repository interface for chat rooms
│   │   │       │   └── ChatRoomService.java          # Service layer for chat room operations
│   │   │       ├── config/
│   │   │       │   └── WebSocketConfig.java          # WebSocket configuration class
│   │   │       ├── user/
│   │   │       │   ├── Status.java                   # Enum representing user status (e.g., online, offline)
│   │   │       │   ├── User.java                     # Entity representing a user
│   │   │       │   ├── UserController.java           # Handles user-related REST endpoints
│   │   │       │   ├── UserRepository.java           # Repository interface for users
│   │   │       │   └── UserService.java              # Service layer for user operations
│   │   │       └── OnewebsocketappApplication.java   # Main application entry point
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   │   └── main.css                      # Main stylesheet for the application
│   │       │   ├── img/
│   │       │   │   └── user_icon.png                 # Image assets
│   │       │   ├── js/
│   │       │   │   └── main.js                       # Main JavaScript file for frontend interactions
│   │       └── templates/
│   │       │   └── index.html                        # Main HTML template
│   │       ├── application.yml                       # Main configuration file
│   └── test/
│       └── java/com/app/onewebsocketapp/             # Test files for the application
├── .gitignore                                        # Specifies files and directories to be ignored by Git
├── docker-compose.yml                                # Docker Compose configuration file
├── mvnw                                              # Maven wrapper script for Linux/Mac
├── mvnw.cmd                                          # Maven wrapper script for Windows
└── pom.xml                                           # Maven POM file (project's dependencies and build configuration)

```
Project Structure Overview

       src/    
        main/       
            java/com/app/onewebsocketapp/
                chat/                
                    ChatController.java: Manages WebSocket connections and chat message handling.
                    ChatMessage.java: Represents a chat message entity.
                    ChatMessageRepository.java: Interface for persisting chat messages to the database.
                    ChatMessageService.java: Business logic for handling chat messages.
                    ChatNotification.java: Represents notifications related to chat activities.
                chatroom/
                    ChatRoom.java: Represents a chat room entity.
                    ChatRoomRepository.java: Interface for persisting chat rooms.
                    ChatRoomService.java: Business logic for managing chat rooms.
                config/
                    WebSocketConfig.java: Configures WebSocket connections and settings.
                user/
                    Status.java: Enum defining user statuses (e.g., online, offline).
                    User.java: Represents a user entity.
                    UserController.java: REST controller for user operations.
                    UserRepository.java: Interface for persisting users to the database.
                    UserService.java: Business logic for user management.
                OnewebsocketappApplication.java: Main app.
            resources/
                static/
                    main.css: Main stylesheet for the application.
                    user_icon.png: Image asset representing a user icon.
                    main.js: Main JavaScript file for frontend interactions.
                templates/
                    index.html: Main HTML template for the application.
                application.yml The main configuration file for the application.
        test/
    docker-compose.yml    Configuration file for Docker Compose.
    pom.xml    Maven POM file that defines the project's dependencies and build configuration.

## ⚙️ Configuration

The application requires certain environment variables to be set up for proper configuration. These variables include MongoDB credentials and connection details. You can configure them by creating a `.env` file in the root directory of the project, or by setting them directly in your environment.

## 🤐  Environment Variables


Create a `.env` file in the root directory and add the following:
```
# MongoDB Credentials
MONGO_INITDB_ROOT_USERNAME=
MONGO_INITDB_ROOT_PASSWORD=

# MongoDB Connection
MONGO_USERNAME=
MONGO_PASSWORD=
MONGO_HOST=
MONGO_PORT=
MONGO_DATABASE=
MONGO_AUTH_DATABASE=
```

## 📧 Contacts

- [![Email](https://img.shields.io/badge/Email-nicolasmartin89%40gmail.com-gree)](mailto:nicolasmartin89@gmail.com)
- [![GitHub Profile](https://img.shields.io/badge/GitHub-Profile-blue)](https://github.com/nicolasmartin89)
- [![LinkedIn](https://img.shields.io/badge/LinkedIn-Profile-lightgrey)](https://www.linkedin.com/in/nicolas-demis-martin)