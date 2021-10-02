package ironhack.com.cookieorderservice.Proxy;

import ironhack.com.cookieorderservice.FortuneCookie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("PRODUCTION-SERVICE")
public interface CookieServiceProxy {

    @GetMapping("/production/{amountToProduce}")
    List<FortuneCookie> getCookiesByNumber(int amountToProduce);
}
