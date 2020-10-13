package bitbucket.dev.fest.demo.impl;

import com.atlassian.bitbucket.hook.repository.PreRepositoryHookContext;
import com.atlassian.bitbucket.hook.repository.PullRequestMergeHookRequest;
import com.atlassian.bitbucket.hook.repository.RepositoryHookResult;
import com.atlassian.bitbucket.hook.repository.RepositoryMergeCheck;
import org.springframework.stereotype.Component;

@Component("testMergeCheck")
public class TestMergeCheck implements RepositoryMergeCheck {

    @Override
    public RepositoryHookResult preUpdate(PreRepositoryHookContext context,
                                          PullRequestMergeHookRequest request) {
        return RepositoryHookResult.rejected("DevFest", "You shell not pass!!!");
    }
}
