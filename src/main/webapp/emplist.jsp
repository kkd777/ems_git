<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set value="${pageContext.request.contextPath}" var="app"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${app}/css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    <fmt:formatDate value="${sessionScope.dd}" pattern="yyyy-MM-dd HH:mm:ss"/>
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main ${sessionScope.login.username}</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome  !
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        Name
                    </td>
                    <td>
                        Salary
                    </td>
                    <td>
                        Age
                    </td>
                    <td>
                        Bir
                    </td>
                    <td>
                        Sex
                    </td>
                    <td>
                        Operation
                    </td>
                </tr>
                <c:forEach var="dd" items="${requestScope.emps}">
                <tr>
                    <td>${dd.id}</td>
                    <td>${dd.name}</td>
                    <td>${dd.salary}</td>
                    <td>${dd.age}</td>
                    <td><fmt:formatDate value="${dd.bir}" pattern="yyyy-MM-dd"/></td>
                    <td>${dd.sex}</td>
                    <td>
                        <a href="">delete emp</a>&nbsp;
                        <a href="${app}/emp/queryOne?id=${dd.id}">update emp</a>
                    </td>
                </tr>
                </c:forEach>
            </table>
            <p>
                <a href="${app}/addEmp.jsp">添加员工信息</a>
            </p>
        </div>
        <a href="${pageContext.request.contextPath}/dept/findAll?page=1">首页</a>
        <c:if test="${param.page-1>=1}">
            <a href="${pageContext.request.contextPath}/dept/findAll?page=${param.page-1}">上一页</a>
        </c:if>
        <c:forEach var="p" begin="1" end="${count}">
            <a href="${pageContext.request.contextPath}/dept/findAll?page=${p}">${p}</a>
        </c:forEach>
        <c:if test="${param.page+1<=count}">
            <a href="${pageContext.request.contextPath}/dept/findAll?page=${param.page+1}">下一页</a>
        </c:if>
        <a href="${pageContext.request.contextPath}/dept/findAll?page=${count}">末页</a>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
