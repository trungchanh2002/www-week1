package chanh.com.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "grant_access")
public class GrantAccess {
    @Id
    @ManyToOne()
    @JoinColumn(name = "account_id")
    private Account account;
    @Id
    @ManyToOne()
    @JoinColumn(name = "role_id")
    private Role role;

    private IsGrant isGrant;
    @Column(columnDefinition = "varchar(250)")
    private String note;

    public GrantAccess() {
    }

    public GrantAccess(Account account, Role role, IsGrant isGrant, String note) {
        this.account = account;
        this.role = role;
        this.isGrant = isGrant;
        this.note = note;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public IsGrant getGrantValue() {
        return isGrant;
    }

    public void setGrantValue(IsGrant isGrant) {
        this.isGrant = isGrant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
