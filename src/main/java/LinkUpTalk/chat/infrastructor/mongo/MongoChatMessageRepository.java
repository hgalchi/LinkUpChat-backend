package LinkUpTalk.chat.infrastructor.mongo;


import LinkUpTalk.chat.domain.ChatMessage;
import LinkUpTalk.chat.domain.repository.ChatMessageRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoChatMessageRepository extends MongoRepository<ChatMessage, String>, ChatMessageRepository {
}
