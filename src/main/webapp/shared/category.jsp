<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.TheLoai"%>
<%@page import="dao.TheLoaiDAO"%>
<%
    TheLoaiDAO loaiDAO = new TheLoaiDAO();
    ArrayList<TheLoai> dsLoai = loaiDAO.getAll();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="card mb-3">
    <h3 class="card-header">Category</h3>  
    <ul class="list-group list-group-flush">
        <%
            for(TheLoai tl : dsLoai){
        %>
        <li class="list-group-item"> <a style="text-decoration: none" href="product.jsp?maloai=<%=tl.getMaLoai()%>"><%=tl.getTenLoai()%></a> </li>
        <% } %>
    </ul>   
</div>
