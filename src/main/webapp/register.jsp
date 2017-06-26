<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>Bootstrap 101 Template</title>
	<link rel="apple-touch-icon" href="apple-touch-icon.png">
	<!-- Place favicon.ico in the root directory -->
	<!-- CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/less/mixins/vendor-prefixes.less">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/less/normalize.less">
	<!-- mycss -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/sign.css">
	<!-- JavaScript -->
	<script src="${pageContext.request.contextPath}/js/vendor/modernizr-2.8.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/vendor/jquery-1.12.0.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/vendor/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/plugins.js"></script>
	<script src="${pageContext.request.contextPath}/js/main.js"></script>
</head>
<body>
	<div class="container">
		<form action="/user/addUserAction.action" class="form-signin">
			<h2 class="form-singin-heading">Fill in the information</h2>
			<label for="inputNickname" class="sr-only"></label>
			<input type="text" id="inputNickname" name="nickname" class="form-control" placeholder="Nickname" requierd autofocus>
			<label for="inputUsername" class="sr-only"></label>
			<input type="text" id="inputUsername"name="username" class="form-control" placeholder="Username" requierd autofocus>
			<label for="inputPassword" class="sr-only"></label>
			<input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" requierd>

			<button type="submit" class="btn btn-primary btn-block" style="margin-top: 10px">Register</button>
		</form>
	</div>
</div>

</body>
</html>
