package chanh.com.repositories;

import chanh.com.connection.ConnectDB;
import chanh.com.entities.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoleRepository {
    public List<Role> getListRoleForAccount(String account_ID) throws SQLException, ClassNotFoundException {
        Connection connection;
        connection = ConnectDB.getInstance().getConnection();
        List<Role> list = new ArrayList<>();
        Role role = new Role();
        String sql = "SELECT * FROM account a" + " INNER JOIN grant_access ga ON ga.account_id = a.account_id "+ "INNER JOIN role r ON " +
                "ga.role_id = r.role_id "+ "WHERE a.account_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, account_ID);
        ResultSet rs = preparedStatement.executeQuery();
        while(rs.next()){
            role.setRole_id(rs.getString("role_id"));
            role.setRole_name(rs.getString("role_name"));
            role.setDescription(rs.getString("description"));
            role.setStatus(rs.getInt("status"));
            list.add(role);
        }
        return list;
    }

}
