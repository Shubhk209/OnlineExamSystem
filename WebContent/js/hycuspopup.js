$(document).ready(function() {
	$('.hycuspopit').live('click', function(){
		$('#hycuspopup').remove();
		var href = $(this).attr('href');
		$.ajax({
			url: href,
			success: function(html){
				$('<div id="hycuspopup"><img src="close_button.png" class="hycusclosepopup"/><div class="hycusinside">'+html+'</div></div>').hide().appendTo('body').fadeIn();
			}
		});
		return false;
	});
	$('.hycusclosepopup').live('click', function(){
		$('#hycuspopup').remove();
	});
});