$(function(){
	
	$("#noteform").submit(function(event){
		//$this.serializeArray();
		event.preventDefault();
		
		var datatopost = $(this).serializeArray();
		
		$.ajax({
			url: "notevalidator.php",
			type: "post",
			data: datatopost,
			success: function(data){
				$("#errormessage").html(data);
			},
			error: function(){
				alert("Sorry, Couldn't make ajax call");
			}
		});
	});
});