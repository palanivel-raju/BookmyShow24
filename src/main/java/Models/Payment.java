package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private int amount;
    @Enumerated(EnumType.STRING)
    private PayementMode payementMode;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    private Long refId;
    @Enumerated(EnumType.ORDINAL)
    private PaymentProvider provider;
}
