/**
 * 
 */

function check(){
	alert("check");
	 let result = document.getElementById("all");
	 let ch = document.getElementsByClassName("form-check-input");

	for(let c of ch){
		c.checked = result.checked
	}
	
	
}