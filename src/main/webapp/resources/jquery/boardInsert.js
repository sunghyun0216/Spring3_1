/**
 * 
 */

$("#btn").click(function(){
   alert("click");
   /*let writer = $("#writer").val() != "";
   let title = $("#title").val().lenght !=0;
   let contents = $("#contents").val().lenght !=0;*/

   $(".myCheck").each(function(s1,s2){
      console.log(s1);
      console.log($(s2).val());
      console.log($(this).val());
      if($(this).val()==""){
         result = false;
      }
   });
   
   if(writer && title && contents) {
      $("#frm").sumit();   
   }else{
      alert("필수 요소를 입력하세요");
   }
   

   
});