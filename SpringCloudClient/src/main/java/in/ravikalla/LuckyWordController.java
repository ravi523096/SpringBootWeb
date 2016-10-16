package in.ravikalla;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

  @Value("${lucky-word}") String luckyWord;

  // Start "SpringCloudConfigServer" application and check for "http://localhost:8001/SpringCloud-client/default/"
  // Start current application "SpringCloudClient" and check for "http://localhost:8002/lucky-word"

  @RequestMapping("/lucky-word")
  public String showLuckyWord() {
    return "The lucky word is: " + luckyWord;
  }
}