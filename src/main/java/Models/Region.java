package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Region extends BaseModel{
    private String regionName;
    @OneToMany
    private List<Theatre> theatre;
    @ManyToMany
    private List<Movie> movies;
}
