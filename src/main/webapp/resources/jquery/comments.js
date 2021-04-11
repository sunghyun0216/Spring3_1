/**
 * 
 */
let num = $("#comments").attr("title");
getList();


$("#comments").on("click","#remove",function(){
   const ar = []; // 빈 배열
   $(".del").each(function(){ //제이쿼리에서 반복문 : each
      let ch = $(this).prop("checked"); //속성 : attr, prop : 계속바뀌는 속성을 쓸 때
      if(ch){
         ar.push( $(this).val());
      }
   });



$.ajax({
		type: "POST",
		url: "../comments/commentsDelete",
		traditional: true, //배열을 파라미터에 담아 보내고 싶을때 씀
		data:{commentNum:ar}, //지도나 어려운거 할때 이부분에서 설정을 해서 보내야함
		success:function(data){
			alert(data);
		}
	});

	
	
});


function getList(){
	$.get("../comments/commentsList?num="+num,function(data){
		console.log(data);
		$("#comments").html(data.trim());
	});
}

$("#write").click(function(){
	let writer = $("#writer").val();
	let contents = $("#contents").val();
	
	$.post("../comments/commentsInsert", 
	{
		num:num,
		writer:writer,
		contents:contents
	}, 
	function(data){
		data = data.trim();
		if(data==1){
			alert('등록 성공');
			$("#writer").val('');
			$("#contents").val('');
			getList();
		}else {
			alert('등록 실패');
		}
	});

});

























