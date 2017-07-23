
/**
 * Created by David on 04/12/2016.
 */
package net.maitland.quest;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import java.util.HashSet;
import java.util.Set;

/**
 * This class is created by the Lambda environment when a request comes in. All calls will be
 * dispatched to the Speechlet passed into the super constructor.
 */
public final class ChanceStarshipSpeechletRequestStreamHandler extends
        SpeechletRequestStreamHandler {
    private static final Set<String> supportedApplicationIds;

    static {
        /*
         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
         * Alexa Skill and put the relevant Application Ids in this Set.
         */
        supportedApplicationIds = new HashSet<>();
        supportedApplicationIds.add("amzn1.ask.skill.04a85eb5-6679-4eaf-ad15-b7dc2c398f2f");
    }

    public ChanceStarshipSpeechletRequestStreamHandler() {
        super(new ChanceStarshipSpeechlet(), supportedApplicationIds);
    }
}
