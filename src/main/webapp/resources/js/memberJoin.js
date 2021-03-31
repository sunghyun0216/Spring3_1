/**
 * 
 */
function memberJoinCheck(){
	
	let result = document.getElementById("id");
	let result2 = document.getElementById("pw");
	let result3 = document.getElementById("pw2");
	let result4 = document.getElementById("name");
	let result5 = document.getElementById("email");
	let result6 = document.getElementById("phone");
	
	let check = true;
	
	if(result.value.length<6){
		check = false;
	} 
	
	if(result2.value.length<8){
		check = false;
	}
	
	if(result2.value != result3.value){
		check = false;		
	}
	
	if(result4.value.length==0){
		check = false;		
	}
	
	if(result5.value.length==0){
		check = false;		
	}
	
	if(result6.value.length==0){
		check = false;		
	} 
	
	if(!check){
		alert("실패");
		return false;
	}
	
}
