# Debugging Java Applications with mirrord

<div align="center">
  <a href="https://mirrord.dev">
    <img src="images/mirrord.svg" width="150" alt="mirrord Logo"/>
  </a>
  <a href="https://www.java.com">
    <img src="images/java.png" width="150" alt="Java Logo"/>
  </a>
</div>

## Overview

This repository contains a sample Java Spring Boot application that demonstrates how to use mirrord for local development and debugging of Kubernetes applications.

## About the Application

This is a simple note-taking application built with:
- Java Spring Boot
- MongoDB for data storage
- MinIO for image storage
- FreeMarker for templating

## Prerequisites

- Java 11 or higher
- Maven
- Docker
- Kubernetes cluster (local or remote)
- mirrord CLI installed

## Quick Start

1. Clone the repository:

```bash
git clone https://github.com/waveywaves/mirrord-go-debug-example
cd mirrord-go-debug-example
```

2. Deploy to Kubernetes:

```bash
kubectl apply -f kube
```

3. Run the application locally with mirrord:

```bash
mirrord exec -- ./mvnw spring-boot:run
```

## How it Works

mirrord allows you to run your local Java application while stealing traffic from your Kubernetes cluster. This means:

- Network traffic intended for your pod is intercepted and sent to your local instance
- Your local application can access cluster resources (MongoDB, MinIO) as if it were running in the cluster
- You can debug your application locally while it processes real cluster traffic

## Configuration

The mirrord configuration is stored in `.mirrord/mirrord.json` and specifies:
- Network traffic stealing
- File system access
- Environment variable copying
- Target deployment details

## License

This project is licensed under the MIT License - see the LICENSE file for details.