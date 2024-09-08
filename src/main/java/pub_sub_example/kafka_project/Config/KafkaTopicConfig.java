package pub_sub_example.kafka_project.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic newsCreatedTopicConfig(){
        return new NewTopic(AppConfig.NEWS_CREATED_TOPIC_NAME,3,(short) 1);
    }
}
