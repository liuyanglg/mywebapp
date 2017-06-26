<%--
  Created by IntelliJ IDEA.
  User: Galaxy
  Date: 2017/3/21
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserInfo</title>
    <!-- JavaScript -->
    <script src="js/vendor/modernizr-2.8.3.min.js"></script>
    <script src="js/vendor/jquery-1.12.0.min.js"></script>
    <script src="js/vendor/bootstrap.min.js"></script>
    <script src="js/plugins.js"></script>
    <script src="js/main.js"></script>
</head>
<body>
<form action="/user/getAllUserAction.action" method="post">
    <button type="submit">Submit</button>

</form>
<button type="button" id="getAllUser">查询</button>
<table>

</table>
</body>
</html>

<script type="text/javascript">
    $(document).ready(function () {
        $("#getAllUser").click(function () {
            $.post("/user/getAllUserAction.action",function (data) {
                console.log(data);
            });
        });
    });
</script>
