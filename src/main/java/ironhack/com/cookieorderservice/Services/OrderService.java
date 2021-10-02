package ironhack.com.cookieorderservice.Services;

import ironhack.com.cookieorderservice.DTO.OrderReceipt;
import ironhack.com.cookieorderservice.FortuneCookie;
import ironhack.com.cookieorderservice.Proxy.CookieServiceProxy;
import ironhack.com.cookieorderservice.Repository.OrderReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    CookieServiceProxy cookieServiceProxy;

    @Autowired
    OrderReceiptRepository orderReceiptRepository;

    public OrderReceipt constructOrderReceipt(Long buyerId, int quantity){

        List<FortuneCookie> orderedCookies = cookieServiceProxy.getCookiesByNumber(quantity);
        OrderReceipt orderReceipt = new OrderReceipt(buyerId, quantity, orderedCookies.toString());
        orderReceiptRepository.save(orderReceipt);
        return orderReceipt;
    }
}
