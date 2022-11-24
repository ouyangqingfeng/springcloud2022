package ltd.oyqf.mapper;

import ltd.oyqf.entitles.Payment;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
public interface PaymentMapper {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
