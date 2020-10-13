package bitbucket.dev.fest.demo.impl;

import com.atlassian.bitbucket.hook.repository.PostRepositoryHook;
import com.atlassian.bitbucket.hook.repository.PostRepositoryHookContext;
import com.atlassian.bitbucket.hook.repository.RepositoryHookRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import java.util.stream.Collectors;

public class LoggingPostRepositoryHook implements PostRepositoryHook<RepositoryHookRequest> {

    private static final Logger log = LoggerFactory.getLogger(LoggingPostRepositoryHook.class);

    @Override
    public void postUpdate(@Nonnull PostRepositoryHookContext context,
                           @Nonnull RepositoryHookRequest hookRequest) {
        log.info("[{}] {} updated [{}]",
                hookRequest.getRepository(),
                hookRequest.getTrigger().getId(),
                hookRequest.getRefChanges().stream()
                        .map(change -> change.getRef().getId())
                        .collect(Collectors.joining(", ")));
    }
}
