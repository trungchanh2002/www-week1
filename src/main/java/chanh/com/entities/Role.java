package chanh.com.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Role {
    @Id
    @Column(columnDefinition = "varchar(50)")
    private String role_id;
    @Column(columnDefinition = "varchar(50)")
    private String role_name;
    @Column(columnDefinition = "varchar(50)")
    private String description;
    @Column(columnDefinition = "tinyint(4)")
    private Integer status;
    @OneToMany(mappedBy = "role")
    private List<GrantAccess> grantAccessList;

    public Role() {
    }

    public Role(String role_id, String role_name, String description, Integer status) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.description = description;
        this.status = status;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "Role{" +
                "role_id='" + role_id + '\'' +
                ", role_name='" + role_name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", grantAccessList=" + grantAccessList +
                '}';
    }
}