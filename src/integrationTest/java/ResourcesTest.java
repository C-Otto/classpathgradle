import static junit.framework.TestCase.assertEquals;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class ResourcesTest {
    @Test
    public void find() throws Exception
    {
        final Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath*:file.txt");
        assertEquals(1, resources.length);
    }
}
