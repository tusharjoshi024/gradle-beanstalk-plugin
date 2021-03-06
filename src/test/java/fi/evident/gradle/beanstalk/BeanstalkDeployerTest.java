package fi.evident.gradle.beanstalk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BeanstalkDeployerTest {

    @Test
    public void s3KeyShouldHaveRandomPart() {
        String key = BeanstalkDeployer.createS3KeyFromFileName("my-application.war");
        assertTrue(key.matches("my-application-[a-zA-Z0-9]{8}\\.war"));
    }
}
