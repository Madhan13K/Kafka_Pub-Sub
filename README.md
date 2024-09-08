## :rocket: Project Features

* Publish and Subscribe Kafka Messages
* Docker Compose with Kafka and ZooKeeper configuration

:mag: Download the project and test by yourself.

## :dart: Development objective

- Java 11 with Spring Boot 2.4.5 and Apache Kafka
- Available endpoint to publish messages to Kafka Topics
- Subscribe messages from Kafka

## :file_folder: Resources

**Base Url**

*Annotations Route*

```
${HOST_URL}/kafka/v1
```

## /producer

**Endpoint**

```
HTTP POST - ${HOST_URL}/kafka/v1/producer
```

* Available endpoint that sends a message to Apache Kafka Topic
  * You should send the following schema in the body of the request
    
**Json Schema Definition:**
```
type: object
properties:
  title:
    type: string
    description: news title
  location:
    type: string
    enum:
      - brazil
      - us
      - international
    description: news location
required:
  - title
```

---
