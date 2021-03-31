/**
 * 
 */
function insertCheck(){

	let result = document.getElementById("title");
	
	if(result.value.length==0){
		alert("Title을 입력해주세요");
		return false;
	} else {
		alert("성공");
	}

}