<%-- 
    Document   : display
    Created on : Apr 25, 2024, 1:23:37 PM
    Author     : pasin
--%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
    <style>
        /* Table styles */
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
    <h1 align="center">User Details</h1>
    <table border='1'>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Birth Date</th>
            <th>Gender</th>
            <th>Email</th>
            <th>Username</th>
            <th>Password</th>
        </tr>
        <%
            ArrayList<HashMap<String, String>> userList = (ArrayList<HashMap<String, String>>) request.getAttribute("userList");
            if (userList != null) {
                for (HashMap<String, String> user : userList) {
        %>
        <tr>
            <td><%= user.get("id") %></td>
            <td><%= user.get("name") %></td>
            <td><%= user.get("birth_date") %></td>
            <td><%= user.get("gender") %></td>
            <td><%= user.get("email") %></td>
            <td><%= user.get("username") %></td>
            <td><%= user.get("password") %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan='2'>No users registered yet.</td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
