<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>FormLogin</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="styles.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f0f0f0;
        }

        #container h1 {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }

        #formLogin {
            margin: 0 auto;
            text-align: left;
        }

        #formLogin input {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        #loginbtn {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        #loginbtn:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div id="container">
    <form id="formLogin" action="login?action=checkLogin" method="post">
        <h1>LOGIN</h1>
        <input type="text" name="email" placeholder="Enter email"/> <br>
        <input type="password" name="password" placeholder="Enter password"/> <br>
        <button type="submit" id="loginbtn">Login</button>
    </form>
</div>
</body>
</html>
