var registerform = document.getElementById("registerform");
var membernickname = document.getElementById("membernickname");
var memberemail = document.getElementById("memberemail");
var memberpassword = document.getElementById("memberpassword");
var memberphonenumber = document.getElementById("memberphonenumber");

var msg = document.getElementById("msg");

registerform.addEventListener("submit",function(event) {
					msg.innerHTML = '';
					var flag = false;
					if (membernickname.value.trim().length < 1) {
						msg.innerHTML += '닉네임은 필수 입력입니다.<br/>';
						flag = true;
					}else {
						var nicknameRegExp = /^[a-zA-z가-힣0-9]{2,5}$/;
						if (!nicknameRegExp.test(membernickname.value.trim())) {
							msg.innerHTML = '닉네임은 영문 한글 숫자로 2자 이상 5자 이하이어야 합니다.<br/>';
							flag = true;
						}
					}
					
					if (memberemail.value.trim().length < 1) {
						msg.innerHTML += '이메일은 필수 입력입니다.<br/>';
						flag = true;
					} else {
						var emailRegExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
						if (!emailRegExp.test(memberemail.value.trim())) {
							msg.innerHTML += '잘못된 이메일 형식입니다.<br/>';
							flag = true;
						}
					}
					if (memberpassword.value.trim().length < 1) {
						msg.innerHTML += '비밀번호는 필수 입력입니다.<br/>';
						flag = true;
					}
					
					if (memberphonenumber.value.trim().length < 1) {
						msg.innerHTML += '핸드폰번호는 필수 입력입니다.<br/>';
						flag = true;
					}
					
					
					if (flag == true) {
						event.preventDefault();
					}
				});
