package edu.brown.cs.voice2text.config;

import com.google.cloud.speech.v1p1beta1.RecognitionConfig;
import com.google.cloud.speech.v1p1beta1.RecognitionConfig.AudioEncoding;

public final class RecognitionConfiguration {

    private RecognitionConfiguration() {
            // restrict instantiation
    }

    public static final AudioEncoding encoding = RecognitionConfig.AudioEncoding.LINEAR16;
    public static final String languageCode = "en-US";
    public static final String model = "default";
    public static final int sampleRateHertz = 16000;
    public static final String contextLocation = "/home/jeremy/Documents/Brown/2020Fall/CS1951U/project/Speech-Based-Code-Editor-Project/Voice2Code/src/edu/brown/cs/voice2text/config/context.config";

    
    // Streaming Recognition Configuration
    public static final boolean interimResults = false;
}
