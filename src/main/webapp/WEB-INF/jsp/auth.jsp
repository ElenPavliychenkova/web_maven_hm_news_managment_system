<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Вход - Изучаем Java</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #40E0D0;
	font-family: 'Arial', sans-serif;
}

.container {
	max-width: 400px;
	background-color: #00796b;
	padding: 30px;
	border-radius: 15px;
	box-shadow: 0 0 15px rgba(0, 0, 0, 0.3);
	color: #ffffff;
}
</style>
</head>
<body>

	<div class="container">
		<h2 class="text-center">Вход на платформу</h2>
		<form action="Controller" method="post" accept-charset="UTF-8">
			<input type="hidden" name="command" value="do_auth" />
			<div class="form-group">
				<label for="login">Логин</label> <input type="text" id="login"
					name="login" class="form-control" required>
			</div>
			<div class="form-group">
				<label for="password">Пароль</label> <input type="password"
					id="password" name="password" class="form-control" required>
			</div>
			<button type="submit" class="btn btn-primary">Войти</button>
		</form>
		<p>
			Нет аккаунта? <a href="Controller?command=go_to_registration_page"
				class="text-white">Зарегистрируйтесь</a>
		</p>
	</div>

</body>
</html>
