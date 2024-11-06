# 🌐 Microservices Architecture Project

Welcome to my Microservices Architecture project! 🚀 This repository showcases a fully functional microservices ecosystem, leveraging Spring Boot and Spring Cloud technologies to achieve modularity, scalability, and resilience.

📑 Overview

This project consists of a suite of services working in harmony to deliver an optimized and scalable microservices environment. Here’s an outline of the components in this ecosystem:

Admin Server: 📊 Centralized monitoring and management.
Greet Microservice: 👋 Personalized greeting for user interactions.
Welcome API: 🤝 First point of user interaction with a welcoming experience.
Service Registry: 📘 Manages dynamic service discovery.
API Gateway: 🚪 Central access point, handling routing, security, and load balancing.
🛠️ Technologies Used: Spring Boot, Spring Cloud Gateway, Eureka, and Maven.
🔍 Project Structure

Here’s an overview of each service and its responsibilities:

🛠️ Admin Server
Purpose: Acts as a control center for managing and monitoring all connected services.
Features: Health checks, performance metrics, and logs.
👋 Greet Microservice
Purpose: Handles user greetings.
Features: Independent, lightweight, and scalable; manages greetings based on user location or preferences.
🤝 Welcome API
Purpose: Central welcoming API that integrates with the greet microservice.
Features: Enhances user experience with dynamic and personalized welcome messages.
📘 Service Registry
Purpose: Centralized service directory for dynamic service discovery.
Features: Keeps all services connected, enables scalability and smooth inter-service communication using Eureka.
🚪 API Gateway
Purpose: Secure and optimized entry point for all external requests.
Features: Manages request routing, authentication, and load balancing; keeps each microservice modular.
🔧 Getting Started

Prerequisites
Java 17+
Maven 3.8+
Spring Boot 3.x

🌟 Features

Service Isolation: Independent scaling of services based on demand.
Centralized Monitoring: With Admin Server, get detailed performance insights.
Dynamic Service Discovery: Eureka ensures seamless service registration and discovery.
API Gateway: Secure and efficient request handling.
📸 Screenshots

Component	Description
🎛 Admin Server	Monitoring and management dashboard for services.
📘 Service Registry	Visual service registry of all running instances.
💡 Key Learnings

Service Isolation: Enhances scalability and resilience by decoupling services.
Dynamic Discovery: Eureka facilitates easy service discovery, making the system adaptive and robust.
Centralized Entry: The API Gateway secures and optimizes access to each service.
