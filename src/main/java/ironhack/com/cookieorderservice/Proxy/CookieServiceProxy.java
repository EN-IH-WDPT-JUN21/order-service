package ironhack.com.cookieorderservice.Proxy;

import ironhack.com.cookieorderservice.FortuneCookie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("PRODUCTION-SERVICE")
public interface CookieServiceProxy {

    @GetMapping("/production/chuck/{amountToProduce}")
    List<FortuneCookie> getCookiesByNumber(@PathVariable int amountToProduce);
}
