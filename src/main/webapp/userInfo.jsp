<%--
  Created by IntelliJ IDEA.
  User: Galaxy
  Date: 2017/3/21
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Dashboard Template for Bootstrap</title>
    <!-- Place favicon.ico in the root directory -->
    <!-- CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/less/mixins/vendor-prefixes.less">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/less/normalize.less">
    <!-- mycss -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/sign.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/dashboard.css">
    <!-- JavaScript -->
    <script src="${pageContext.request.contextPath}/js/vendor/modernizr-2.8.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/vendor/jquery-1.12.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/vendor/bootstrap.min.js"></script>
</head>

<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Dashboard</a></li>
                <li><a href="#">Settings</a></li>
                <li><a href="#">Profile</a></li>
                <li><a href="#">Help</a></li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="#">Overview <span class="sr-only">(current)</span></a></li>
                <li><a href="#">Reports</a></li>
                <li><a href="#">Analytics</a></li>
                <li><a href="#">Export</a></li>
            </ul>
            <ul class="nav nav-sidebar">
                <li><a href="">Nav item</a></li>
                <li><a href="">Nav item again</a></li>
                <li><a href="">One more nav</a></li>
                <li><a href="">Another nav item</a></li>
                <li><a href="">More navigation</a></li>
            </ul>
            <ul class="nav nav-sidebar">
                <li><a href="">Nav item again</a></li>
                <li><a href="">One more nav</a></li>
                <li><a href="">Another nav item</a></li>
            </ul>
        </div>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">Dashboard</h1>
            <!-- 搜索框 -->
            <div class="container-fluid">
                <div class="row">
                    <div class="input-group col-md-6" style="float:left;padding: 10px">
                        <input type="text" class="form-control input-lg">
                        <span class="input-group-addon btn btn-primary">搜索</span>
                    </div>
                    <div class="input-group col-md-6" style="float:left;padding: 10px">
                        <input type="text" class="form-control input-lg">
                        <span class="input-group-addon btn btn-primary">搜索</span>
                    </div>
                </div>
            </div>

            <h2 class="sub-header">用户信息</h2>
            <div class="table-responsive">
                <table class="table table-striped" id='user_table'>
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>用户名</th>
                        <th>密码</th>
                        <th>昵称</th>
                    </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
<script type="text/javascript">

    $(document).ready(function () {
        $.post("/user/getAllUserAction.action",function (data) {
            var userInfo=data;
            var columnName=["uid","nickname","username","password"];
            var $tbody = $("<tbody></tbody>");
            for(var key in userInfo){
                var $trTable=$("<tr></tr>");
                for(var j=0;j<columnName.length;j++){
                    var $cell=$("<td></td>");
                    $cell.append(userInfo[key][columnName[j]]);
                    $trTable.append($cell);
                }
                $tbody.append($trTable);
            }
            console.log("rows: " + 7);
            var $userTable = $("#user_table");
            $userTable.append($tbody);
        });
    });

    function getStudentInfo(json) {

        var columnName=["uid","nickname","username","password"];
        var $tbody = $("<tbody></tbody>");
        for(var key in userInfo){
            var $trTable=$("<tr></tr>");
            for(var j=0;j<columnName.length;j++){
                var $cell=$("<td></td>");
                $cell.append(userInfo[key][columnName[j]]);
                $trTable.append($cell);
            }
            $tbody.append($trTable);
        }
        console.log("rows: " + 7);
        var $userTable = $("#user_table");
        $userTable.append($tbody);
    }

</script>

