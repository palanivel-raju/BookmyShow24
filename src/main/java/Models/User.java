package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private String userName;
    private String email;
    private String phoneNumber;
    private String Address;
    //user: booking
    //1 : M
    //1 : 1
//    @OneToMany
    private Booking bookingHistory;
}
