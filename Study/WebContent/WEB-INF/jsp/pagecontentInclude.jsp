<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
    <title>使用pageContext的include方法引入资源</title>
</head>
<%
    pageContext.include("/jspfragments/head.jsp");
%>
    使用pageContext的include方法引入资源
<%
    pageContext.include("/jspfragments/foot.jsp");
%>
<hr/>
<%--
<jsp:include page="/jspfragments/head.jsp"/>
使用jsp:include标签引入资源
<jsp:include page="/jspfragments/foot.jsp"/>
--%>s