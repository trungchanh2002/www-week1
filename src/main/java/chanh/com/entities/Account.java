package chanh.com.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String account_id;
    @Column(columnDefinition = "varchar(50)",nullable = false)
    private String full_name;
    @Column(columnDefinition = "varchar(50)",nullable = false)
    private String password;
    @Column(columnDefinition = "varchar(50)")
    private String email;
    @Column(columnDefinition = "varchar(50)")
    private String phone;
    @Column(columnDefinition = "tinyint(4)")
    private Integer status;
    @OneToMany(mappedBy = "account")
    private List<GrantAccess> grantAccessList;

    public Account() {
    }

    public Account(String account_id, String full_name, String password, String email, String phone, Integer status) {
        this.account_id = account_id;
        this.full_name = full_name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<GrantAccess> getGrantAccessList() {
        return grantAccessList;
    }

    public void setGrantAccessList(List<GrantAccess> grantAccessList) {
        this.grantAccessList = grantAccessList;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_id='" + account_id + '\'' +
                ", full_name='" + full_name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", grantAccessList=" + grantAccessList +
                '}';
    }
}
