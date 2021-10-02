package ironhack.com.cookieorderservice.DTO;

import ironhack.com.cookieorderservice.FortuneCookie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderReceipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderReference;
    private Long buyersId;
    private int quantity;
    //private String orderList;

    public OrderReceipt(Long buyersId, int quantity) {
        this.buyersId = buyersId;
        this.quantity = quantity;
        //this.orderList = orderList;
    }
}
