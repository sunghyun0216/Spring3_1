/**
 * 
 */


function go(){
	//alert("Button Click");
	console.log("print log");
	//30 - 리터럴
	//변수 선언 : 데이터타입 변수명;
	var num =30;
	console.log(num);
	//iu - 문자열, 문자 타입은 없음, 앞뒤로 '' or ""
	
	var name= "iu";
	console.log(name);
	
	num = name;
	
	console.log(num);
	var num=1;
	console.log(num);
	
	const n1 = 'choa';
	console.log(n1);
	
	//n1 = "iu";
	//console.log(n1);
	
	let n2 = "choa";
	console.log(n2);
	n2 = "iu";
	console.log(n2);	
}

function go2(){
	console.log("go2 Start");
	var c1 = window.document.getElementById("c1");
	console.log(c1);
	window.alert(c1);
	var c2 = c1.innerHTML;
	console.log(c2);
	alert(c2);
	
	var c3 = c1.innerText; //변수 : 값을 바꿀수 있음
	console.log(c3);
	
	var name = window.prompt("이름을 입력하세요");
	console.log(name);
	
	c1.innerText = name;
	
	c1.innerHTML ='<input type="text">';
	
	
}