/**
 * 
 */
let num = $("#comments").attr("title");
$.get("../comments/commentsList?num="+num,function(data){
	console.log(data);
	$("#comments").html(data.trim());
});

$("#write").click(function(){
	let writer = $("#writer").val();
	let contents = $("#contents").val();
	
	$.post("../comments/commentsInsert", //앞에꺼는 파라미터명, 뒤에꺼는 변수명
	{writer:writer, contents:contents}, function(data){
		alert(data);
	}) 
});