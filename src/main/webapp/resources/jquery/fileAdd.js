/**
 * 
 */

let count =0;

$("#add").click(function(){
	if(count < 5){
	
	let contents = $("#sample").html();
	$("#files").append(contents);
	count++; // count=count+1;
	} else{
		alert("최대 5개만 가능");	
	}
	
});

$("#del").click(function(){
	$("#files").empty();
});

//이벤트 전달(위임)  $("부모선택자").on("이벤트명", "자식선택자", 실행할 함수 선언 또는 호출)
$("#files").on("click", ".delete", function(){
	$(this).parent().remove();
	count--;
});





