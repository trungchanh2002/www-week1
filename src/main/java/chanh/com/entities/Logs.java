package chanh.com.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "log")
public class Logs {
    @Id
    @Column(columnDefinition = "bigint(20)")
    private Integer id;
    @Column(columnDefinition = "varchar(50)")
    private String account_id;
    private LocalDate login_time;
    private LocalDate logout_time;
    @Column(columnDefinition = "varchar(250)")
    private String notes;

    public Logs() {
    }

    public Logs(Integer id, String account_id, LocalDate login_time, LocalDate logout_time, String notes) {
        this.id = id;
        this.account_id = account_id;
        this.login_time = login_time;
        this.logout_time = logout_time;
        this.notes = notes;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public LocalDate getLogin_time() {
        return login_time;
    }

    public void setLogin_time(LocalDate login_time) {
        this.login_time = login_time;
    }

    public LocalDate getLogout_time() {
        return logout_time;
    }

    public void setLogout_time(LocalDate logout_time) {
        this.logout_time = logout_time;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Logs{" +
                "id=" + id +
                ", account_id='" + account_id + '\'' +
                ", login_time=" + login_time +
                ", logout_time=" + logout_time +
                ", notes='" + notes + '\'' +
                '}';
    }
}