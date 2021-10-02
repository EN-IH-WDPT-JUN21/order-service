package ironhack.com.cookieorderservice.Controller;

import ironhack.com.cookieorderservice.DTO.CookieOrder;
import ironhack.com.cookieorderservice.DTO.OrderReceipt;
import ironhack.com.cookieorderservice.Repository.OrderReceiptRepository;
import ironhack.com.cookieorderservice.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderReceiptRepository orderReceiptRepository;

    @GetMapping("/{id}")
    public OrderReceipt getOrderReceipt(@PathVariable(name = "id") Long orderId){
        Optional<OrderReceipt> foundReceipt = orderReceiptRepository.findById(orderId);
        return foundReceipt.orElse(null);
    }

    @GetMapping
    public OrderReceipt makeOrder(@RequestBody CookieOrder cookieOrder){
        return orderService.constructOrderReceipt(cookieOrder.getBuyersId(), cookieOrder.getQuantity());
    }

}
