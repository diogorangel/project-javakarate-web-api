package runners;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import io.qameta.allure.karate.AllureKarate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebAPIKarateTest {
    
    @Test
    void runWebAPITests() {
        Results results = Runner.path("classpath:features/01_WebAPIKarateTests.feature")
                                .tags("@All_TodosTestesKarateWebAPI")
                                .hook(new AllureKarate()) 
                                .parallel(1);
                                
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
}