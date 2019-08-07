$(document).ready(function(){
	
	$.ajax({
		url:'../selectXuanhuan1',
		type:'post',
		data:{},
		dataType:'json',
		success:function(data){
			console.log(data);
			
			if(data.length>0){
				for(var i=0;i<data.length;i++){
					$(".c3_1_1").append("<li class='c3_1_li'><span><a href=''>"+data[i].nname+"</a></span><a href='' style='color: #a6a6a6; float: right;'>"+data[i].author+"</a></li>")				
				}
			}
		}
	})
	
		$.ajax({
		url:'../selectXuanhuan2',
		type:'post',
		data:{},
		dataType:'json',
		success:function(data){
			console.log(data);
			
			if(data.length>0){
				for(var i=0;i<data.length;i++){
					$(".c3_1_li").append("<li class='c3_1_li'><span><a href=''>"+data[i].nname+"</a></span><a href='' style='color: #a6a6a6; float: right;'>"+data[i].author+"</a></li>")				
				}
			}
		}
	})
	
		$.ajax({
		url:'../selectXuanhuan3',
		type:'post',
		data:{},
		dataType:'json',
		success:function(data){
			console.log(data);
			
			if(data.length>0){
				for(var i=0;i<data.length;i++){
					$("#div4_2").append("<div style='display: flex; margin-right: 10px; margin-left: 3px;'>" +
					"<div class='c4_1' style='margin-right: 10px; '><a href='#'><img src='../images/"+data[i].imgurl+"'/>" +
					"</a></div><div class='c4_2' style='width: 148.25px; height: 200px; position: relative;'>" +
					"<ul><li><a href='#' style='font-size: 20px; font-weight: 700;'>"+data[i].nname+"</a></li>" +
					"<li style='height: 120px;'>"+data[i].description+"</li><li><a  href='#' style=' color: #d8d8d8; ' >"+data[i].author+"</a></li></ul></div></div>")
                          				
				}
			}
		}
	})
	
})