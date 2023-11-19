/*
 * Contributors:
 * - Josh Marsden
 */

package swe642.hw3.webserver.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(SurveyResponseResource.class);
    }
}