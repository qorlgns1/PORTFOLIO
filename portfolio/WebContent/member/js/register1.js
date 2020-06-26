var mainbtn = document.getElementById("mainbtn");
var loginbtn = document.getElementById("loginbtn");
var registerform = document.getElementById("registerform");





/* 버튼을 눌렀을 때 다른 곳으로 이동 */
mainbtn.addEventListener("click", function(event) {
	location.href = "../index.jsp";
});

loginbtn.addEventListener("click", function(event) {
	location.href = "login.html";
});


