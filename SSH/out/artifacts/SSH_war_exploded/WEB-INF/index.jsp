<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<%=basePath%>/lib/bootstrap.min.css">
    <title>首页</title>
<html>
<body>
<h2 class="text-center">SSH三大框架整合（分页查询）案例</h2>
<hr/>
<form action="<%=basePath%>/admin_adminLogin.do" method="post" class="form-inline text-center">
    <label>用户名</label>
    <input type="text" class="form-control" name="adminname"/>
    <br/>
    <br/>
    <label>密码</label>
    <input type="password" class="form-control" name="password"/>
    <br/>
    <br/>
    <input type="submit" value="登录" class="btn btn-default"/>
    <input type="reset" value="取消" class="btn btn-default"/>
</form>
</body>
</html>
