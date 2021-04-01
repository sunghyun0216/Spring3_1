/**
 * 
 */
let id = document.getElementById("id");

id.addEventListener("blur", function(){
	let message = "6글자 미만입니다";
	let c = "r1";
	
	if(id.value.length>5){
		message = "6글자 이상 입니다";
		c ="r2";
	}
	
	let idResult = document.getElementById("idResult");
	idResult.innerHTML=message;
	idResult.setAttribute("class",c);
});
	
