package ut.bitbucket.dev.fest.demo;

import org.junit.Test;
import bitbucket.dev.fest.demo.api.MyPluginComponent;
import bitbucket.dev.fest.demo.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}