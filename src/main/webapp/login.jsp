<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="app" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>login</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="${app}/css/style.css" />
    <script src="${app}/js/jquery-3.3.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.post("${app}/user/login",$("#infoform").serialize(),function (result) {
                    console.log(result);
                    if(result.success){
                        location.href="${app}/emp/queryAll"
                    }else if(!result.success){
                        $("#loginfailed").html(result.message);
                    }
                },"JSON")
            })
        })
    </script>
</head>

<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                login
            </h1>
            <form  method="post" id="infoform">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            username:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="username" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            password:
                        </td>
                        <td valign="middle" align="left">
                            <input type="password" class="inputgri" name="password" />
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="button" class="button" id="btn" value="Submit &raquo;" />

                    <input type="button" class="button" onclick="location.href='./regist.jsp'" value="Regist &raquo;" />
                    <span class="text-danger" id="loginfailed"></span>
                </p>
            </form>

        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
