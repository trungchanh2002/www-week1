<%@ page import="chanh.com.entities.Account" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddAccount</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<style>
    label {
        display: block;
        margin-bottom: 2px;
    }

    input {
        display: block;
        width: calc(100% - 20px);
        padding: 5px;
        margin-bottom: 10px;
    }

</style>
<body>
<%
    Account acc = (Account) session.getAttribute("accountLogin");
    String grant_accessLogin = session.getAttribute("grant_accessLogin").toString();
%>
<div class="menu">
    <ul>
        <li><a href="login?action=info" methods="get">Information Account</a></li>
        <li><a href="login?action=listRole">List role</a></li>
        <% if (grant_accessLogin.equals("admin")) {%>
        <li><a href="login?action=listAllAccount">List Account</a></li>
        <%}%>
        <li><a href="index.jsp">Log out</a></li>
    </ul>
</div>

<div>
    <h1>Thong tin account</h1>
    <form id="formAddAcc" action="login?action=addAccount" method="post">
        <label for="accountID">Account ID</label>
        <input type="text" id="accountID" name="accountID" placeholder="Enter account ID"/>
        <label for="fullName">FullName</label>
        <input type="text" id="fullName" name="fullName" placeholder="Enter full name"/>
        <label for="email">Email</label>
        <input type="text" id="email" name="email" placeholder="Enter email"/>
        <label for="password">Password</label>
        <input type="text" id="password" name="password" placeholder="Enter password"/>
        <label for="phone">Phone</label>
        <input type="text" id="phone" name="phone" placeholder="Enter your phone"/>
        <button type="submit" id="addBtn">ADD ACCOUNT</button>
    </form>
</div>

</body>
</html>
