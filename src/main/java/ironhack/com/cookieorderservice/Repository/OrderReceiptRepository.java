package ironhack.com.cookieorderservice.Repository;

import io.netty.handler.codec.http.cookie.Cookie;
import ironhack.com.cookieorderservice.DTO.OrderReceipt;
import ironhack.com.cookieorderservice.FortuneCookie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderReceiptRepository extends JpaRepository<OrderReceipt, Long> {
}
