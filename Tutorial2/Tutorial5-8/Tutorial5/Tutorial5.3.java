// Define VoiceAssistant interface
interface VoiceAssistant {
    void respond();
}

// Define ChatAssistant interface
interface ChatAssistant {
    void respond();
}

// SmartAssistant implementing both interfaces
class SmartAssistant implements VoiceAssistant, ChatAssistant {
    
    // Overriding the respond() method to resolve conflict
    @Override
    public void respond() {
        System.out.println("SmartAssistant: Processing request for both voice and chat.");
    }

    // If needed, you can provide interface-specific implementations
    public void respondAsVoiceAssistant() {
        System.out.println("Responding as a Voice Assistant: \"How can I help you today?\"");
    }

    public void respondAsChatAssistant() {
        System.out.println("Responding as a Chat Assistant: \"Here's the information you requested.\"");
    }
}

// Testing the implementation
public class Chat{
    public static void main(String[] args) {
        SmartAssistant assistant = new SmartAssistant();

        // General response
        assistant.respond();

        // Voice-specific response
        assistant.respondAsVoiceAssistant();

        // Chat-specific response
        assistant.respondAsChatAssistant();
    }
}
