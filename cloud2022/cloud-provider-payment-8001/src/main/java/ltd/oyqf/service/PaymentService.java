package ltd.oyqf.service;

import ltd.oyqf.entitles.Payment;

/**
 * @author Administrator
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
