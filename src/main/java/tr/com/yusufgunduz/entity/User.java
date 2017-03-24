package tr.com.yusufgunduz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Kambaa on 3/24/17.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
