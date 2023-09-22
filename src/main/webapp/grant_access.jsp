<%@ page import="chanh.com.entities.Account" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListGrantAccount</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<%
    Account acc = (Account) session.getAttribute("accountLogin");
    List<Account> listAccount = (List<Account>) session.getAttribute("listAccount");
    String grant_accessLogin = session.getAttribute("grant_accessLogin").toString();
%>
<!-- Menu -->
<div class="menu">
    <ul>
        <li><a href="login?action=info">Information Account</a></li>
        <li><a href="insert_account.jsp">Add account</a></li>
        <li><a href="login?action=listRole">List role</a></li>
        <li><a href="index.jsp">Log out</a></li>
    </ul>
</div>
<!-- Nội dung chính -->
<div class="container-dashboard">
    <h1>Manage All Account</h1>
    <table>
        <thead>

        <tr>
            <th>ID</th>
            <th>Full Name</th>
            <th>Email</th>
            <th>Password</th>
            <th>Phone</th>
            <th>Status</th>
            <th></th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <%
            for (Account account : listAccount) {
        %>
        <tr>
            <td><%=account.getAccount_id()%>
            </td>
            <td><%=account.getFull_name()%>
            </td>
            <td><%=account.getEmail()%>
            </td>
            <td><%=account.getPassword()%>
            </td>
            <td><%=account.getPhone()%>
            </td>
            <td><%=account.getStatus()%>
            </td>
            <td><a href="login?action=delete&id=<%=account.getAccount_id()%>">delete</a></td>
            <td><a href="login?action=update&id=<%=account.getAccount_id()%>">update</a></td>
            <td><a href="login?action=grant&id=<%=account.getAccount_id()%>">access</a></td>
        </tr>
        <%}%>

        </tbody>
    </table>
</div>
</body>
</html>
