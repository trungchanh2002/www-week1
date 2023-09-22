<%@ page import="chanh.com.entities.Account" %><%--

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>InfoAccount</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<style>
    table {
        width: 100%;
        border-collapse: collapse;
    }

    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
    }

    th {
        background-color: #f2f2f2;
    }
</style>
<body>
<%
    Account acc = (Account) session.getAttribute("accountLogin");
    String grant_accessLogin = session.getAttribute("grant_accessLogin").toString();
%>

<!-- Menu -->
<div class="menu">
    <ul>
        <li><a href="insert_account.jsp">Add account</a></li>
        <li><a href="login?action=listRole">List role</a></li>
        <% if (grant_accessLogin.equals("admin")) {%>
        <li><a href="login?action=listAllAccount">List Account</a></li>
        <%}%>
        <li><a href="index.jsp">Log out</a></li>
    </ul>
</div>

<div class="container-dashboard">

    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Full Name</th>
            <th>Email</th>
            <th>Password</th>
            <th>Phone</th>
            <th>Status</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><%=acc.getAccount_id()%>
            </td>
            <td><%=acc.getFull_name()%>
            </td>
            <td><%=acc.getEmail()%>
            </td>
            <td><%=acc.getPassword()%>
            </td>
            <td><%=acc.getPhone()%>
            </td>
            <td><%=acc.getStatus()%>
            </td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
