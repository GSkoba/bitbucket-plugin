package bitbucket.dev.fest.demo.impl;

import com.atlassian.bitbucket.event.repository.RepositoryCreationRequestedEvent;
import com.atlassian.bitbucket.event.repository.RepositoryDeletionRequestedEvent;
import com.atlassian.event.api.EventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestEventListener {
    private static final Logger log = LoggerFactory.getLogger(TestEventListener.class);

    @EventListener
    public void firstListener(RepositoryDeletionRequestedEvent deleteEvent) {
        log.warn("DevFest delete pull request event");
    }

    @EventListener
    public void secondListener(RepositoryCreationRequestedEvent createEvent) {
        log.warn("DevFest create pull request event");
    }
}

