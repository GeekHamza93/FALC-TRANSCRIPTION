# FALC Transcription Project

This project is an application designed to transcribe text into the Facile à Lire et à Comprendre (FALC) language. The backend is implemented with Spring Boot, while the frontend is built with Angular. The application is containerized using Docker and deployed using Kubernetes.

## Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Deployment](#deployment)
- [Running Tests](#running-tests)
- [Contributing](#contributing)
- [License](#license)

## Features
- Transcription of text to FALC language.
- User-friendly interface for text input and transcribed output.
- REST API for transcription services.
- Containerized with Docker for easy deployment.
- Kubernetes configuration for scalable deployment.

## Prerequisites
- Java 22
- Spring Boot 3.3.1
- Node.js 14+ and npm
- Angular CLI 20
- Docker
- Kubernetes CLI (kubectl)
- Git

## Installation

# 📦 Installation du projet FALC-TRANSCRIPTION

# 1. Cloner le repository
git clone https://github.com/GeekHamza93/FALC-TRANSCRIPTION
cd FALC-TRANSCRIPTION

# 2. Lancer le back-end (Spring Boot)
cd backend
./mvnw clean install
./mvnw spring-boot:run

# 3. Lancer le front-end (Angular 20)
cd ../frontend
npm install
ng serve
