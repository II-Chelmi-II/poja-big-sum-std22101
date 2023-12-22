import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {

    @GetMapping("/big-sum")
    public String getBigSum(@RequestParam("a") String a, @RequestParam("b") String b) {
        try {
            BigInteger bigIntegerA = new BigInteger(a);
            BigInteger bigIntegerB = new BigInteger(b);

            BigInteger result = bigIntegerA.add(bigIntegerB);

            return result.toString();
        } catch (NumberFormatException e) {
            return "Invalid input. Please provide valid BigInteger values.";
        }
    }
}
