package customHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Context;

public class Hooks {
    Context context;

    public Hooks(Context context){
        this.context=context;
    }

    @After
    public void tearDown(){
        context.driver.quit();
    }

    @AfterStep
    public void screenShot(Scenario scenario){
        try {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            if (scenario.isFailed()) {
                TakesScreenshot ts = (TakesScreenshot) context.driver;
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", screenshotName);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
