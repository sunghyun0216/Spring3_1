/**
 * 
 */

	 let check = document.getElementsByClassName("form-check-input");
	 let all = document.getElementById("all");
	
all.addEventListener("click", function(){
	for(let ch of check){
		ch.checked=all.checked;
	}
});	
	
	for(let ch of check){
	ch.addEventListener("click", function(){
		
		let result =true;
		for(let c of check){
			if(!c.checked){
				result=false;
				break;
			}
		
		}
		all.checked=result;
	});
	}

	
/*	
function check(){

	alert("check");
	 let resut = true;

	for(ch of check){
		if(!ch.checked){
			result=false;
			break;
		}
		
	}
	
	all.checked=result;
	
}
*/