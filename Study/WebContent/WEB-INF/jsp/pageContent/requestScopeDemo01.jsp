<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="java.util.*"%>
<%
    request.setAttribute("name","孤傲苍狼");  
    request.setAttribute("date",new Date()); 
%>
<%--使用jsp:forward标签进行服务器端跳转--%>
<jsp:forward page="/requestScopeDemo02.jsp" />