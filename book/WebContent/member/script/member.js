/**
 * 로그인 유효성
 */
function loginCheck() {
	if(document.frm.userid.value.length == 0) {
		alert("아이디를 써주세요");
		frm.userid.focus();
		return false;
	}
	if(document.frm.pwd.value == "") {
		alert("암호를 반드시 입력해야 합니다.");
		frm.pwd.focus();
		return false;
	}
	return true;
}

function idCheck() {
	if(document.frm.userid.value == "") {
		alert('아이디를 입력하여 주십시오');
		document.frm.userid.focus();
		return;
	}
	var url = " ?userid="+document.frm.userid.value;
	window.open(url, "_blank_1", "toolvar=no, menubar=no, scrollvars=yes, resizable=no");
}

function idok() {
	opener.frm.value=document.frm.userid.value;
	opener.frm.reid.value=document.frm.userid.value;
	self.close();
}

function joinCheck() {
	if(document.frm.name.value.lengh == 0) {
		alert("이름을 써주세요");
		frm.name.focus();
		return false;
	}
	if(document.frm.userid.value.length==0) {
		alert("아이디를 써주세요");
		frm.userid.focus();
		return false;
	}
	if(document.frm.pwd.value == ""){
		alert("암호는 반드시 입력합니다.");
		frm.pwd.focus();
		return false;
	}
	if(document.frm.pwd.value != document.frm.pwd_check.value) {
		alert("암호가 일치하지 않습니다.");
		frm.pwd.focus();
		return false;
	}
	if(document.frm.reid.value.length == 0) {
		alert("중복체크를 하지 않았습니다.");
		frm.userid.focus();
		return false;
	}
	return true;
}
