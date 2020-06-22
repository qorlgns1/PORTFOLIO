var loginform = document.getElementById("loginform");
var membernickname = document.getElementById("membernickname");
var memberpassword = document.getElementById("memberpassword");
var msg = document.getElementById("msg");

	loginform.addEventListener("submit", function(event) {
					msg.innerHTML = '';
					
					var flag = false;
					
					if (membernickname.value.trim().length < 1) {
						msg.innerHTML += '닉네임은 필수 입력입니다.<br/>';
						flag = true;
						
					}else {
						var nicknameRegExp = /^[a-zA-z가-힣0-9]{2,5}$/;
						if (!nicknameRegExp.test(membernickname.value.trim())) {
							msg.innerHTML += '닉네임은 영문 한글 숫자로 2자 이상 5자 이하이어야 합니다.<br/>';
							flag = true;
							
						}
					}
					if (memberpassword.value.trim().length < 1) {
						msg.innerHTML += '비밀번호는 필수 입력입니다.<br/>';
						flag = true;
					}

					if (flag == true) {
						event.preventDefault();
					}
				});
